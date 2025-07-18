package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 18 Temmuz 2025
 * Bu proje girilen N tane sayıdan en büyük ve en küçük sayıları bulur.
 */
public class MaxMinBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, n2, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            n2 = scan.nextInt();

            if (i == 1) {
                max = n2;
                min = n2;
            }
            if (n2 < min) {
                min = n2;
            }
            if (n2 > max) {
                max = n2;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
