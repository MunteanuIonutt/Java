package org.example.lab1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanator = new Scanner(System.in);

        System.out.printf("Numarul tau:");
        int numar = scanator.nextInt();
        List divizori = new ArrayList();
        int contor = 0;

        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                divizori.add(i);
                contor++;
            }
        }

        if (contor == 2) {
            System.out.printf("Numar prim!");//souf
        } else {

            PrintStream printf = System.out.printf("Divizorii sunt:" + divizori.toString());
        }
    }
}
