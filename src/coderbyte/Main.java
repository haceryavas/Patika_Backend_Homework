package coderbyte;

import java.util.*;

class Main {

    public static String LetterCountI(String str)
    {
        // code goes here
        String[] words = str.split(" ");
        String result = "";
        int letterCounter = 0, counter = 0;


        for(int i = 0; i < words.length; i++)
        {
            letterCounter = countLetter(words[i]);
            //System.out.println(letterCounter);

            if(counter < letterCounter)
            {
                counter = letterCounter;
                result = words[i];
            }

        }

        if(counter == 1)
        {
            return "-1";
        }
        else{
            return result;
        }
    }

    public static int countLetter(String str)
    {
        char c;
        char[] array = new char[str.length()];
        int[] harfSayi = new int[str.length()];
        int counter = 0;

        for(int i = 0; i < str.length(); i ++)
        {
            c = str.charAt(i);

            array[i] = c;

            for(int j = 0; j < array.length; j ++)
            {
                boolean dahaOnceVarMi = false;

                if(c == array[j])
                {
                    dahaOnceVarMi =  true;
                    counter ++;
                }
                else
                {
                    dahaOnceVarMi =  false;
                }
            }
            harfSayi[i] = counter;
            counter = 0;

        }

        counter = enYukseginiBul(harfSayi);

        return counter;
    }

    public static int enYukseginiBul(int[] array){
        Arrays.sort(array);
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length-1-i] = temp;
        }
        return array[0];
    }




    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCountI(s.nextLine()));
    }

}