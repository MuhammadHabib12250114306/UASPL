package Nomor5;

public class Posisi {
    public void posisi(int [] angka, int n, int cari) {
        int posisi = -1;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                posisi = i;
                System.out.println("Indeks ke-" + posisi);
            }
        }
    }
}
