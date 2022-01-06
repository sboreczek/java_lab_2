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

    public static void zad2(){

        /* Switch case często używany jest z pętlą, gdzie case-y działają jak else if() */
        String tekst = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : tekst.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
                    break;
            }
        }
        System.out.printf("\nLitera występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3], tablica[4]);
        System.out.println("\nLiczba pozostałych liter: " + tablica[5]);

    }




    public static void main(String[] args) {

        zad1();
        zad2();
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
