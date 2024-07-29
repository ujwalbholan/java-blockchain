package com.spring;

import java.util.Date;

public class block {
    public String hash;
    public String previousHash;
    public String data;
    public String timestamp;

    public block( String previousHash, String data) {
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = String.valueOf(new Date().getTime());
        this.hash = calculateHash();
    }


    public String calculateHash() {
        String calculateHash = digitalFootprint.applySha256(
                previousHash +
                        Long.toString(Long.parseLong(timestamp)) +
                        data
        );
        return calculateHash;
    }
}