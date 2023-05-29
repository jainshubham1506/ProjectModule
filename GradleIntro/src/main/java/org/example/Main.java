package org.example;

import httpClient.Client;

public class Main {
    public static void main(String[] args) {
        Client cl=new Client();
        System.out.println(cl.run("https://www.google.com"));
    }
}