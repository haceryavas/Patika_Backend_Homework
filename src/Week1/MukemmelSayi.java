package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje girilen bir sayının mükemmel sayı olup olmadığını bulur.
 * Mükemmel Sayı Nedir ?
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
 * kendisine eşit olan sayıya mükemmel sayı denir.
 */
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Bir sayı girin: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) total += i;
        }
        if (total == n) System.out.println(n + " mükemmel sayıdır.");
        else System.out.println(n + " mükemmel sayı değildir.");
    }
}
