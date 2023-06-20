package Nomor1;

public class KelipatanLima {
    int angka;
    public void kelipatanLima(){
        if (angka % 5 == 0){
            System.out.println("Angka " + angka + " Termasuk Kelipatan 5");
        }else {
            System.out.println("Angka " + angka + " Tidak Termasuk Kelipatan 5");
        }
    }
}
