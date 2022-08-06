package Project_akhir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan5 extends latihan4{
    void lima ()  {
        System.out.println("======================== Bagian 1 ========================");
        for (int x = 0; x < 10; x++) {
            System.out.print(x);
        }
        System.out.println("   ");
        System.out.println("======================== Bagian 2 ========================");
    //part 2
        int i = 4;
        while (i>0) {
            System.out.println(i);
            i--;
        }
        System.out.println("   ");
        System.out.println("======================== Bagian 3 ========================");
    //part 3
        int a = 0;
        do{
            System.out.println(a);
            a++;
        } while (a<10);
        System.out.println("   ");
        System.out.println("======================== Bagian 4 ========================");
    }
    //part 4
    void ldua (String hasil) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        switch (hasil) {
            case "jo" :
                System.out.println("Pacarmu Evan");
                break;
            
            case "syahrul" :
                System.out.println("Pacarmu Vivi");
                break;
            
            case "Okta" :
                System.out.println("Pacarmu Feby");
                break;
        }
    }    
}
