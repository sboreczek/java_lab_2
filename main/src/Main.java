import java.util.Scanner;

public class Main {

    public static void zad1(){
        Scanner skaner = new Scanner(System.in);
        int a = skaner.nextInt();
        switch(a % 2){
            case 0:
                System.out.println("Ta liczba jest parzysta");
                break;

            case 1:
                System.out.println("Ta liczba nie jest parzysta");
                break;
        }

        switch(a % 7){
            case 0:
                System.out.println("Ta liczba jest podzielna przez 7");
                break;

            case 1:
                System.out.println("Ta liczba nie jest podzielna przez 7");
                break;
        }

    }






    public static void main(String[] args) {

        zad1();
        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

    }

}
