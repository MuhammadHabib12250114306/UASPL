package Nomor5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak angka : ");
        int n = input.nextInt();

        System.out.println("Inputkan angka : ");
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            angka[i] = input.nextInt();
        }

        System.out.print("Angka yang dicari : ");
        int cari = input.nextInt();

        Posisi letak = new Posisi();

        letak.posisi(angka, n, cari);
    }
}
