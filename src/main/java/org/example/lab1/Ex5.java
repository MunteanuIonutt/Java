package org.example.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.exit;

public class Ex5 {
    public static void main(String[] args) {
        int maxim=20;
        Random rand=new Random();
        int numar_random=rand.nextInt(20);
        System.out.println("Numar:"+numar_random);
        int numar1=0;
        int numar2=1;
        int sir1;

        for(int i=0;i<maxim;i++) {
            sir1 = numar1 + numar2;
            numar1=numar2;
            numar2=sir1;

           if (numar_random==sir1)
           {
               System.out.printf("Numarul random este in fibo!");
               exit(0);
           }
        }
        System.out.printf("Numarul random nu este in fibo!");

    }
}
