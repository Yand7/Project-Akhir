package Project_akhir;

import java.util.Scanner;

import javax.swing.JOptionPane;

class calcu {
       
    void tambah() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("                KALKULATOR                   ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String a1 = JOptionPane.showInputDialog("Masukkan Angka 1 : ");
        double n1 = Double.parseDouble(a1);
        String a2 = JOptionPane.showInputDialog("Masukkan Angka 2 : ");
        double n2 = Double.parseDouble(a2);
        System.out.println("Angka 1 : "+n1);
        System.out.println("Angka 2 : "+n2);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        double hc = n1 + n2;
        System.out.println("Hasil dari "+n1+" + "+n2+" = "+hc);
    }

    void kurang() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("                KALKULATOR                   ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String a1 = JOptionPane.showInputDialog("Masukkan Angka 1 : ");
        double n1 = Double.parseDouble(a1);
        String a2 = JOptionPane.showInputDialog("Masukkan Angka 2 : ");
        double n2 = Double.parseDouble(a2);
        System.out.println("Angka 1 : "+n1);
        System.out.println("Angka 2 : "+n2);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        double hc = n1 - n2;
        System.out.println("Hasil dari "+n1+" - "+n2+" = "+hc);
    }

    void kali() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("                KALKULATOR                   ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String a1 = JOptionPane.showInputDialog("Masukkan Angka 1 : ");
        double n1 = Double.parseDouble(a1);
        String a2 = JOptionPane.showInputDialog("Masukkan Angka 2 : ");
        double n2 = Double.parseDouble(a2);
        System.out.println("Angka 1 : "+n1);
        System.out.println("Angka 2 : "+n2);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        double hc = n1 * n2;
        System.out.println("Hasil dari "+n1+" * "+n2+" = "+hc);
    }

    void bagi() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("                KALKULATOR                   ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String a1 = JOptionPane.showInputDialog("Masukkan Angka 1 : ");
        double n1 = Double.parseDouble(a1);
        String a2 = JOptionPane.showInputDialog("Masukkan Angka 2 : ");
        double n2 = Double.parseDouble(a2);
        System.out.println("Angka 1 : "+n1);
        System.out.println("Angka 2 : "+n2);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        double hc = n1 / n2;
        System.out.println("Hasil dari "+n1+" / "+n2+" = "+hc);
    }
}

class metode {

    void ep() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("      Program Mencari Energi Potensial       ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String ma = JOptionPane.showInputDialog("Masukkan Masa : ");
        double m = Integer.parseInt(ma);
        String ti = JOptionPane.showInputDialog("Masukkan Tinggi : ");
        double h = Integer.parseInt(ti);
        System.out.println("Masa   : "+m);
        System.out.println("Tinggi : "+h);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        final double g = 10;
        double hasil = m*g*h;
        System.out.println("Energi Potensial Yang Dihasilkan Adalah : "+hasil);
    }

    void ki() {
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        System.out.println("      Program Mencari Energi Kinetik       ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        String ma = JOptionPane.showInputDialog("Masukkan Masa : ");
        double m = Integer.parseInt(ma);
        String vol = JOptionPane.showInputDialog("Masukkan Volume : ");
        double v = Integer.parseInt(vol);
        System.out.println("Masa   : "+ma);
        System.out.println("Volume : "+v);
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
        double hasil = 0.5*m*v*v;
        System.out.println("Energi Potensial Yang Dihasilkan Adalah : "+hasil);
    }
}

public class project3 extends project2 {
    void ptiga(String pilihan) {
        metode pil = new metode();
        calcu cc = new calcu();
        switch (pilihan) {
            case "1" : 
                pil.ep();
            break;

            case "2" : 
                pil.ki();
            break;

            case "3" :
                String op = JOptionPane.showInputDialog("Operator : ");
                switch (op){
                    case "+" :
                        cc.tambah();
                    break;

                    case "-" :
                        cc.kurang();
                    break;

                    case "*" :
                        cc.kali();
                    break;

                    case "/" :
                        cc.bagi();
                    break;
                }
                            
        }
    }
}
