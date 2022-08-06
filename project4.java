package Project_akhir;//pengorganisasian kelas-kelas dan interface yang sekelompok menjadi suatu unit tunggal dalam library.

import java.io.IOException;//mengimpor paket IOException Java
import java.io.InputStreamReader;//mengimpor paket Inputstreamreader Java
import java.util.Scanner;//mengimpor paket Scanner Java
import javax.swing.JOptionPane;//mengimpor paket JOptionPane Java
import java.io.BufferedReader;//mengimpor paket BufferedReader Java

public class project4 extends anak{
//public menandakan class bisa dipanggil kapanpun, dimanapun, extends digunakan untuk memanggil isi dari class lain
    public static void main (String []args) throws IOException, Exception {
        Scanner pilih = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        System.out.println("Pilihan File Sesuai Nama");
        System.out.println(" 1. latihan      2. latihan1");
        System.out.println(" 3. latihan1_2   4. latihan1_5");
        System.out.println(" 5. latihan2     6. latihan3");
        System.out.println(" 7. latihan4     8. latihan5");
        System.out.println(" 9. latihan6    10. project1");
        System.out.println("11. project2    12. project3");
        System.out.println("13. quiz1       14. quiz1_2");
        System.out.println("15. kakek       16. ayah");
        System.out.println("17. anak");
        
        System.out.print("Masukkan Pilihan Sesuai Nama File : ");
        String choice = pilih.nextLine();

        project4 p4 = new project4();

        switch(choice) {
            case "latihan" :
                p4.latwal();
            break;

            case "latihan1_2" :
                System.out.print("Masukkan nama : ");
                String username = pilih.next();
    
                System.out.print("Masukkan angka : ");
                int harga = pilih.nextInt();
                p4.sdua(username, harga);
            break;

            case "latihan1_5" :
                p4.slima();
            break;
            
            case "latihan1" :
                System.out.print("Input alas : " );
                double a = pilih.nextInt();
    
                System.out.print("Input tinggi : ");
                double b = pilih.nextInt();
    
                p4.satu(a,b);
            break;

            case "latihan2" :
                p4.dua();
            break;

            case "latihan3" :
                System.out.println("### DATA SISWA ###");
                System.out.print("Nama Siswa : ");
                String nama = pilih.next();
    
                System.out.print("Alamat : ");
                String alamat = pilih.next();
            
                System.out.print("Usia : ");
                int usia = pilih.nextInt();
    
                System.out.print("NIS : ");
                int NIS = pilih.nextInt();
                p4.tiga(nama,alamat,usia,NIS);
            break;

            case "latihan4" :
                System.out.print("Inputkan nama : ");
                String name = br.readLine();
                p4.empat(name);
            break;

            case "latihan5" :
                p4.lima();
                System.out.print("Masukkan Namamu : ");
                String hasil = br.readLine();
                p4.ldua(hasil);
            break;

            case "latihan6" :
                p4.enam();
            break;

            case "project1" :
            
                System.out.println("Masukkan barang 1 : ");        
                int b1 = Integer.parseInt(br.readLine());
                System.out.println(b1);
    
                System.out.println("Masukkan barang 2 : ");
                int b2 = Integer.parseInt(br.readLine());
                System.out.println(b2);
    
                System.out.println("Masukkan barang 3 : ");
                int b3 = Integer.parseInt(br.readLine());
                System.out.println(b3);
                p4.psatu(b1, b2, b3);
            break;
            
            case "project2" :
                System.out.print("Masukkan Nilai : ");
                int nil = Integer.parseInt(br.readLine());
                p4.pdua(nil);
            break;

            case "project3" :
                String pilihan = JOptionPane.showInputDialog("Masukkan Pilihan : ");
                p4.ptiga(pilihan);
            break;

            case "quiz1" :
                p4.qsatu1();
                System.out.print("Masukkan Jari-Jari : ");
                double rl = pilih.nextInt();
                p4.qsatu(rl);
            break;

            case "quiz1_2" :
                p4.qsdua1();
                System.out.print("Masukkan Angka 1 : ");
                double nil1 = pilih.nextInt();
    
                System.out.print("Masukkan Angka 2 : ");
                double nil2 = pilih.nextInt();
    
                System.out.print("Operator : ");
                String op = pilih.next();
                p4.qsdua(nil1, nil2, op);
            break;

            case "kakek" :
                p4.hidung();
                p4.mata();
                System.out.print("Input alas : ");
                double alas = pilih.nextInt();
                System.out.print("Input tinggi : ");
                double t = pilih.nextInt();
                p4.segitiga(alas, t);
            break;

            case "ayah" :
                p4.ayah();
                p4.mata();
            break;

            case "anak" :
                System.out.print("Input alas : ");
                double r = pilih.nextInt();
                System.out.print("Input tinggi : ");
                double s = pilih.nextInt();
                p4.anak(r, s);
        }
    }
}