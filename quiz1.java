package Project_akhir;

import java.util.Scanner;

public class quiz1 extends project3{
    
    void qsatu1 () {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("      Program Mencari Keliling Lingkaran     ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
    }
    
    void qsatu (double rl) {
        System.out.println("");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");

        double phi = 3.14;
        double hasil = phi * (rl+rl);
        System.out.println("Keliling Lingkaran Adalah : "+hasil);
    }
}