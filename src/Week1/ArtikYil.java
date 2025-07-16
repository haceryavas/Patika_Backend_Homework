package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje girilen yıla göre artık yıl olup olmadığını bulur.
 */
public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        boolean isArtik = false;

        System.out.print("Yıl giriniz: ");
        yil = scanner.nextInt();

        if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0))
            isArtik = true;
        else
            isArtik = false;

        if (isArtik)
            System.out.println(yil + " bir artik yıldır.");
        else
            System.out.println(yil + " bir artik yıl değildir.");

    }
}
