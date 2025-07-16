package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 16 Temmuz 2025
 * Bu proje Vücut Kitle İndeksi hesaplar.
 */

public class AritmetikIslemler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, sonuc;

        System.out.print("Birinci sayıyı giriniz: ");
        a = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = scan.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        c = scan.nextInt();

        sonuc = a + b * c - 2;
        System.out.println("Sonuç: " + sonuc);
    }
}
