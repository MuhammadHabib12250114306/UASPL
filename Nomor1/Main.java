package Nomor1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        KelipatanLima klpLima = new KelipatanLima();

        System.out.print("Inputkan angka : ");
        klpLima.angka = input.nextInt();

        klpLima.kelipatanLima();
    }
}