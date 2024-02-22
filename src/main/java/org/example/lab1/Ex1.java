package org.example.lab1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanator=new Scanner(System.in);

        System.out.println("Adaugati lungimea:");
        int lungime=scanator.nextInt();
        System.out.println("Adaugati latimea:");
        int latime=scanator.nextInt();
        int perimetru=2*lungime+2*latime;

        System.out.println("Perimetrul este:"+perimetru);

    }
}
