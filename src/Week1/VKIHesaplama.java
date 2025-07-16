package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 16 Temmuz 2025
 * Bu proje Vücut Kitle İndeksi hesaplar.
 */
public class VKIHesaplama {
    public static void main(String[] args) {

        int weight;
        double height, VKI;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = inp.nextDouble();
        if (height <= 0) {
            System.out.println("Boyunuz pozitif bir sayı olmalı.");
            return;
        }

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = inp.nextInt();
        if (weight <= 0) {
            System.out.println("Kilonuz pozitif bir sayı olmalı.");
            return;
        }

        VKI = weight / (height * height);
        System.out.println("Vücut Kitle İndeksi: " + VKI);
    }
}
