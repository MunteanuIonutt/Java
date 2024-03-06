package org.example.Lab2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Persoana {

        private String nume;
        private String cnp;
        public Persoana(String nume,String cnp )
        {
            this.nume=nume;
            this.cnp=cnp;

        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public void setCnp(String cnp) {
            this.cnp = cnp;
        }

        public int getVarsta( )
        {
            String anNasterii=cnp.substring(1,3);
            String lunaNasterii=cnp.substring(3,5);
            String ziuaNasterii=cnp.substring(5,7);

            int an=Integer.parseInt(anNasterii);
            int luna=Integer.parseInt(lunaNasterii);
            int ziua=Integer.parseInt(ziuaNasterii);

            int secol = Character.getNumericValue(cnp.charAt(0));
            if (secol == 1 || secol == 2)
            {
                an += 1900;
            } else if (secol == 3 || secol == 4)
            {
                an += 1800;
            } else if (secol == 5 || secol == 6)
            {
                an += 2000;
            }

            LocalDate dataNasterii = LocalDate.of(an, luna, ziua);
            LocalDate dataCurenta = LocalDate.now();
            return (int) ChronoUnit.YEARS.between(dataNasterii, dataCurenta);
        }

        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Cititi nr de persoane:");
            int n=scanner.nextInt();
            scanner.nextLine();
            Persoana[] persoane = new Persoana[n];
            for(int i = 0; i < n; i++)
            {
                System.out.println("Introduceti numele persoanei " + (i + 1) + ":");
                String numeP = scanner.nextLine();
                String cnpP;
                while (true)
                {
                    System.out.println("Introduceti cnp ul persoanei " + (i + 1) + ":");
                    cnpP = scanner.nextLine();
                    if (validareCNP(cnpP))
                    {
                        persoane[i] = new Persoana(numeP, cnpP);
                        break;
                    } else {
                        System.out.println("CNP invalid. Incercati din nou.");
                    }
                }
            }
            for (Persoana persoana : persoane)
            {
                System.out.println("Numele:"+persoana.nume + ", " +"cnp:"+ persoana.cnp + ", "+"varsta:" + persoana.getVarsta()+" ani");
            }

        }
        private static boolean validareCNP(String cnp)
        {
            if (cnp.length() != 13||!contineDoarCifre(cnp))
            {
                return false;
            }

            int primaCifra = Character.getNumericValue(cnp.charAt(0));
            if (primaCifra != 1 && primaCifra != 2 && primaCifra != 5 && primaCifra != 6)
            {
                return false;
            }
            return true;
        }
        private static boolean contineDoarCifre(String str)
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (!Character.isDigit(str.charAt(i)))
                {
                    return false;
                }
            }
            return true;
        }

    }


