package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Bu proje girilen doğum yılına göre kişin Çin Zodyağı Burcunu bulur.
 */
public class CinZodyagi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogumYili;
        String burc = "";

        System.out.print("Doğum yılınızı girin: ");
        dogumYili = scanner.nextInt();

        switch (dogumYili % 12) {
            case 0:burc = "Maymun";break;

            case 1:burc = "Horoz";break;

            case 2:burc = "Köpek";break;

            case 3:burc = "Domuz";break;

            case 4:burc = "Fare";break;

            case 5:burc = "Öküz";break;

            case 6:burc = "Kaplan";break;

            case 7:burc = "Tavşan";break;

            case 8:burc = "Ejderha";break;

            case 9:burc = "Yılan";break;

            case 10:burc = "At";break;

            case 11:burc = "Koyun";break;

            case 12:burc = "Maymun";break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);

    }
}
