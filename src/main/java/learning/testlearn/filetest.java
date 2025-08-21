package learning.testlearn;

import java.io.*;

public class filetest {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader file= new FileReader("C:\\Users\\swath\\OneDrive\\Desktop\\test.txt");

            FileWriter filew= new FileWriter("C:\\Users\\swath\\OneDrive\\Desktop\\test.txt");

            BufferedReader Br= new BufferedReader(file);
            String line;
            while((line=Br.readLine())!=null){
                System.out.println(line);
            }

            BufferedWriter nw= new BufferedWriter(filew);
            nw.write("hii");
            nw.newLine();
            nw.write("helo");
            System.out.println("Text written to file using BufferedWriter.");



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
