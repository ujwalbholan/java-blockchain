package com.spring;

public class Main {
    public static void main(String[] args) {

        block genesisBlock = new block("hi i am first block","0");
        System.out.println("Hash for first block :"+genesisBlock.hash);

        block secondBlock = new block("hi i am second block",genesisBlock.hash);
        System.out.println("Hash of second block :"+secondBlock.hash);
    }
}