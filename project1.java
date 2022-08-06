package Project_akhir;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class project1 extends latihan6{
    void psatu(int b1, int b2, int b3) throws Exception {
        
        int total = b1+b2+b3;
        System.out.println("Total : "+total);

        if (total > 100000) {
            System.out.println("Bonus Motor");
        } else if (total > 50000) {
            System.out.println("Bonus Kaos");
        } else if (total > 25000) {
            System.out.println("Bonus Payung");
        } else if (total > 10000) {
            System.out.println("Bonus Tisu Sulap");
        } else {
            System.out.println("Tidak Ada Bonus");
        }
    }
}
