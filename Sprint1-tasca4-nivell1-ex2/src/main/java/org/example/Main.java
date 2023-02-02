package org.example;


import calculoDNI.CalculoDNI;

public class Main {
    public static void main(String[] args) {

        int numDNI = 36576455;

        char letter = CalculoDNI.calculateLetter(numDNI);
        System.out.println(letter);

    }//closes method Main



}//closes class Main

