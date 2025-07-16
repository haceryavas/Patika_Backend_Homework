package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje basamak sayısının kullanıcıdan alır ve döngüler kullanılarak,
 * yıldızlar(*) ile ekrana ters üçgen çizer.
 */
public class TersUcgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bas;

        System.out.print("Basamak sayısını girin: ");
        bas = scan.nextInt();

        for (int i = bas; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
