package Nomor2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan text : ");
        String text = input.nextLine();
        int panjangText = text.length();

        panjang(panjangText);
    }

    public static void  panjang(int panjangText){
        if (panjangText == 5){
            System.out.println("Panjang text adalah 5 karakter");
        } else {
            System.out.println("Panjang text tidak 5 karakter");
        }
    }
}