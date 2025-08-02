package coderbyte;

import java.util.*;

/**
 * @author Hacer Nur YAVAŞ - 17 Temmuz 2025
 * Prime Mover
 * Have the function PrimeMover (num) return the numth prime number.
 * The range will be from 1 to 10^4.
 * For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
 * Examples
 * Input: 9  Output: 23
 * Input: 100  Output: 541
 */

class PrimeMover {

    public static int PrimeMover(int num) {
        // code goes here

        if (num == 1) return 2; //1. Asal sayıyı istiyor ise 2 döndürülüyor

        int whichPrimeNum = 0; //Kaçıncı asal sayı olduğuna dair değişken
        int numthPrimeNum = 0; //İstenilen asal sayıyı tutacak değişken

        for (int i = 3; i <= 10000; i++) {
            int counter = 0;  //i sayısının asal sayı olup olmadığını kontrol edecek değişken

            for (int j = 2; j < i; j++) { // i sayısı 2'den kendisine kadar olan sayılara bölünerek kontrol ediliyor
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                whichPrimeNum++;  //counter 0 olduğu halde i bir asal sayıdır ve whichPrimeNum arttırılır
            }
            if (whichPrimeNum == num - 1) { //whichPrimeNum istenilen değerden bir eksikse (en başta if num ==1 dediğimiz için)
                numthPrimeNum = i;          //i değişkeni yani istenilen asal sayı numthPrimeNum değişkenine atanır ve döngü durdurulur.
                break;
            }
        }

        return numthPrimeNum;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PrimeMover(s.nextInt()));
    }


/*    // n'inci asal sayıyı döndüren metod
    public static int PrimeMover(int num) {
        int count = 0;
        int candidate = 2;

        while (true) {
            if (isPrime(candidate)) {
                count++;
                if (count == num) {
                    return candidate;
                }
            }
            candidate++;
        }
    }

    // Asallık kontrolü için verimli yöntem
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }*/
}