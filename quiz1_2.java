package Project_akhir;

import java.util.Scanner;

public class quiz1_2 extends quiz1{
    
    void qsdua1() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("                KALKULATOR                   ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
    }
    
    void qsdua (double nil1, double nil2, String op) {

        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        
        double hasil;

        switch (op) {
            case "+" :
                hasil = nil1 + nil2;
                System.out.println("Hasil dari "+nil1+op+nil2+" = "+hasil);
            break;

            case "-" :
                hasil = nil1 - nil2;
                System.out.println("Hasil dari "+nil1+op+nil2+" = "+hasil);
            break;

            case "*" :
                hasil = nil1 * nil2;
                System.out.println("Hasil dari "+nil1+op+nil2+" = "+hasil);
            break;

            case "/" :
                hasil = nil1 / nil2;
                System.out.println("Hasil dari "+nil1+op+nil2+" = "+hasil);
            break;

        }

    }
}