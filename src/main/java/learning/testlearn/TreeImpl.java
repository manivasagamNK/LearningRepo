package learning.testlearn;

public class TreeImpl {

    TreeNode Tnode;

    private void insert(int i) {

        Tnode = treeInsert(i,Tnode);
    }

    private TreeNode treeInsert(int i, TreeNode tnode) {

        if(Tnode==null){
            return  new TreeNode(i);
        }
        if(i<tnode.data){
            tnode.left= treeInsert(i,tnode.left);
        } else if (i> tnode.data) {
            tnode.right= treeInsert(i,tnode.right);

        }
        return tnode;
    }


    public static void main(String[] args) {
        int[]  ar= {1,3,5,2,4};

        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                   int temp= ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]=temp;
                }
            }
        }


        TreeImpl tree= new TreeImpl();
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);

        tree.inorder();


    }

    private void inorder() {
       printInorder(Tnode);
    }

    private void printInorder(TreeNode tnode) {
        if (tnode != null) {
            printInorder(tnode.left);
            System.out.println(tnode.data);
            printInorder(tnode.right);
        }
       /* private void printPreorder(TreeNode tnode) {
            if(tnode!=null){
                System.out.println(tnode.data);
                printPreorder(tnode.left);
                printPreorder(tnode.right);
            }
            private void printPostorder(TreeNode tnode) {
                if(tnode!=null){
                    printPostorder(tnode.left);
                    printPostorder(tnode.right);
                    System.out.println(tnode.data);

                }
    }
*/
    }

}
