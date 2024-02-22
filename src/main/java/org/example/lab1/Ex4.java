package org.example.lab1;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
    Random rand=new Random();
    int maxim=30;
    int numar_random_1=rand.nextInt(maxim);
    int numar_random_2=rand.nextInt(maxim);

    int numar_maxim=0;

            for(int i=1;i<maxim;i++)
            {
                if(numar_random_1%i==0 &&numar_random_2%i==0)
                {
                    if(i>numar_maxim)
                    {
                        numar_maxim=i;
                    }
                }
            }
        System.out.println("Primul numar:"+numar_random_1);
        System.out.println("Al doilea numar:"+numar_random_2);
        System.out.printf("Cel mai mare divizor comun este:"+numar_maxim);

    }
}
