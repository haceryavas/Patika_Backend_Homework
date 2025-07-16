package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje girilen verilere göre uçak bileti fiyatını hesaplar.
 */
public class UcakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double fiyat, KM_BASINA_UCRET = 0.10, ONIKIDEN_KUCUK = 0.5, ONIKI_YIRMIDORT_ARASI = 0.1,
                ALTMISBES_USTU = 0.3, GIDIS_DONUS = 0.2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeti km cinsinden giriniz: ");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            fiyat = mesafe * KM_BASINA_UCRET;

            if (yas < 12)
                fiyat -= fiyat * ONIKIDEN_KUCUK;
            else if (yas <= 24)
                fiyat -= fiyat * ONIKI_YIRMIDORT_ARASI;
            else if (yas >= 65)
                fiyat -= fiyat * ALTMISBES_USTU;

            if (yolculukTipi == 2) {
                fiyat -= fiyat * GIDIS_DONUS;
                fiyat *= 2;
            }

            System.out.println("Toplam Tutar = " + fiyat);

        } else
            System.out.println("Hatalı Veri Girdiniz!");

    }

}
