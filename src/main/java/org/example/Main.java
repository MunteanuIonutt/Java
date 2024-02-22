package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanator=new Scanner(System.in);
        System.out.println("Adaugati valoarea primului numar:");
        int numar=scanator.nextInt();
        System.out.println("Valoarea numarului este:"+numar);
        scanator.close();

        }
    }
