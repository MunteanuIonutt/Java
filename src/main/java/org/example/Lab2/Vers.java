package org.example.Lab2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Vers
{
        public static void main(String[] args)throws  FileNotFoundException
        {
            try {
                Scanner scanner = new Scanner(new File("src/main/resources/cantec.txt"));
                FileWriter writer = new FileWriter("src/main/resources/cantec_out.txt");
                Random random = new Random();

                while (scanner.hasNextLine())
                {
                    String cantec = scanner.nextLine();
                    String[] nrcuvinte = cantec.split(" ");
                    int nrVocale=numarVocale(cantec);
                    writer.write(cantec );
                    writer.write("  "+nrcuvinte.length + " cuvinte si "+nrVocale+" vocale\n");

                    if(cantec.endsWith("sot"))
                    {
                        writer.write("*\n");
                    }

                    double nrRandom=random.nextDouble(0,1);
                    if(nrRandom<0.1)
                    {
                        writer.write(cantec.toUpperCase());
                        writer.write("  " + nrcuvinte.length + " cuvinte si " + nrVocale + " vocale"+nrRandom+"\n");
                    }

                }

                scanner.close();
                writer.close();
            } catch (FileNotFoundException e)
            {
                System.out.println("Fisierul nu a fost gasit: " + e.getMessage());
            } catch (IOException e)
            {
                System.out.println("Eroare la citire/scriere: " + e.getMessage());
            }
        }
        private static int numarVocale(String text)
        {
            //insensibilitate la caz(?i)
            return text.replaceAll("(?i)[^aeiou]", "").length();
        }
    }
