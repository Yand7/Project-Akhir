package Project_akhir;

import javax.swing.JOptionPane;

class dataSiswa {
    int nis;
    String nama, jurusan, sekolah;

    //Method input
    void input() {
        String NIS  = JOptionPane.showInputDialog("NIS : ");
        nis         = Integer.parseInt(NIS);
        nama        = JOptionPane.showInputDialog("Nama : ");
        jurusan     = JOptionPane.showInputDialog("Jurusan : ");
        sekolah     = JOptionPane.showInputDialog("Sekolah : ");
    }

    //Method output
    void output() {
        System.out.println("NIS     : "+nis);
        System.out.println("Nama    : "+nama);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Sekolah : "+sekolah);       
    }
}

public class latihan6 extends latihan5{
    void enam() {
        
        //membuat objek baru
        dataSiswa objek1 = new dataSiswa();

        //mengakses dan menjalankan method input
        objek1.input();

        //mengakses dan menjalankan method output
        objek1.output();
    }
}
