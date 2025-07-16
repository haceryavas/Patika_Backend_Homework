package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje ürünlerin kilogram değerlerine göre toplam tutarı hesaplar.
 */
public class ManavKasa {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        double total, ARMUT_FIYAT = 2.14, ELMA_FIYAT = 3.67, DOMATES_FIYAT = 1.11,
                MUZ_FIYAT = 0.95, PATLICAN_FIYAT = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kilo giriniz: ");
        armut = inp.nextInt();
        System.out.print("Elma kilo giriniz: ");
        elma = inp.nextInt();
        System.out.print("Domates kilo giriniz: ");
        domates = inp.nextInt();
        System.out.print("Muz kilo giriniz: ");
        muz = inp.nextInt();
        System.out.print("Patlıcan kilo giriniz: ");
        patlican = inp.nextInt();

        total = armut * ARMUT_FIYAT + elma * ELMA_FIYAT + domates * DOMATES_FIYAT +
                muz * MUZ_FIYAT + patlican * PATLICAN_FIYAT;
        System.out.println("Toplam fiyat : " + total);
    }
}
