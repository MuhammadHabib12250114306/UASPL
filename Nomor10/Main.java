package Nomor10;

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

        System.out.println("Angka kelipatan lima terurut : ");
        KelipatanLima.kelipatanLima(angka);
    }
}