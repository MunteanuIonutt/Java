package org.example.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException { //psvm
        Path path = Paths.get("in.txt");
        List numere=new ArrayList();

        Scanner scanator=new Scanner(new File("src/main/resources.txt"));

        while(scanator.hasNext())
        {
            String numar=scanator.next();
            numere.add(numar);
        }
        System.out.printf("Numere:"+numere);
        scanator.close();
    }
}
