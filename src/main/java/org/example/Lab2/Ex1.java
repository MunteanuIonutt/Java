package org.example.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanator ;
        Scanner scanator_judet;
        String judet;
        try {
            scanator = new Scanner(new File("src/main/resources/judete.txt"));
            scanator_judet=new Scanner(System.in);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<String> lista_judete = new ArrayList<>();
        String judete;

        while(scanator.hasNext())
        {
            judete=scanator.nextLine();
            lista_judete.add(judete);
        }

        Collections.sort(lista_judete);

        System.out.printf("Judetul cautat este:");
        judet=scanator_judet.nextLine();

        int numar=(lista_judete.indexOf(judet)+1);

        if (numar>=1)
        {
            System.out.printf("Pozitia judetului este:"+numar);
        }
        else
        {
            System.out.printf("Nu a fost gasit!");
        }

        System.out.println(lista_judete);
    }


}
