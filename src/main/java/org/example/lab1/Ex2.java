package org.example.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args)  { //psvm
        Path path = Paths.get("in.txt");
        List <String> numere=new ArrayList();
try{
        Scanner scanator=new Scanner(new File("src/main/resources/in.txt"));
        FileWriter writer=new FileWriter("src/main/resources/out.txt");

        while(scanator.hasNext())
        {
            String numar=scanator.next();
            numere.add(numar);
        }


        int total=0;
        float medie_nr;
        int nr_minim=1000;
        int nr_maxim=-1000;

        for (int i=0;i<numere.size();i++)
        {
            total+=Integer.parseInt(numere.get(i));
        }

        medie_nr=(float)total/numere.size();

        for(String numar:numere)
        {
            if(Integer.parseInt(numar)>nr_maxim)
            {
                nr_maxim=Integer.parseInt(numar);
            }

        }
    for(String numar:numere)
    {
        if(Integer.parseInt(numar)<nr_minim)
        {
            nr_minim=Integer.parseInt(numar);
        }

    }
    System.out.println("Numere:"+numere);
    System.out.println(total+"");
    System.out.println(""+nr_minim);
    System.out.println(""+nr_maxim);

        writer.write(String.valueOf(total));
        writer.write(System.lineSeparator());
        writer.write(String.valueOf(medie_nr));
        writer.write(System.lineSeparator());
        writer.write(String.valueOf(nr_minim));
        writer.write(System.lineSeparator());
        writer.write(String.valueOf(nr_maxim));

        writer.close();
        scanator.close();
}catch (IOException e){
    e.getMessage();
}

    }
}
