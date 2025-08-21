package com.projects.springproject.javaproject;

public class Trie {
    TrieNode root = new TrieNode();
    void insert(String word){
        TrieNode node = root;
        for(Character input : word.toCharArray()){
            node.children.putIfAbsent(input,new TrieNode());
            node = node.children.get(input);
        }
    }
}
