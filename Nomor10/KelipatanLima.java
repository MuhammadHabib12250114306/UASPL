package Nomor10;

import java.util.Arrays;

public class KelipatanLima {
    public int angka;

    public static void kelipatanLima(int[] angka) {
        Arrays.sort(angka);
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 5 == 0) {
                System.out.println(angka[i]);
            }
        }
    }
}

