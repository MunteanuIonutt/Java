package org.example.Lab2;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Introduceti un text:");
            String text = scanner.nextLine();

            System.out.println("Introduceti pozitia pt inserarea noului sir:");
            int pozitieInserare = scanner.nextInt();
            scanner.nextLine(); // Consuma newline-ul

            System.out.println("Introduceti sirul care va fi inserat:");
            String sir = scanner.nextLine();

            StringBuilder stringBuilder = new StringBuilder(text);
            try {
                stringBuilder.insert(pozitieInserare, sir);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Pozitia de inserare este invalida.");
            }
            String result = stringBuilder.toString();

            System.out.println("Rezultatul dupa inserare:" + result);

            System.out.println("Introduceti pozitia de la care sa se stearga sirul:");
            int pozitieStergere = scanner.nextInt();

            System.out.println("Cititi nr de caractere care vor fi sterse:");
            int nrCaractere = scanner.nextInt();
            stringBuilder.delete(pozitieStergere, pozitieStergere + nrCaractere);
            String rezultat = stringBuilder.toString();
            System.out.println("Sirul dupa stergere:" + rezultat);

            scanner.close();
        }



    }

