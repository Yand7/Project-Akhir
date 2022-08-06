package Project_akhir;

public class latihan2 extends latihan1{
    void dua () {
        int nilai; 
        nilai = 93;

        if(nilai >= 90 && nilai <= 100){
            System.out.println("Grade A");
        }else if(nilai >= 80 && nilai < 90){
            System.out.println("Grade B");
        }else if(nilai >= 65 && nilai < 80){
            System.out.println("Grade C");
        }else if(nilai >= 50 && nilai < 65){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }
    }
}
