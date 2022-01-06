import java.util.Scanner;

public class Main {

    public static void zad1(){

        for(int i = 100;i > 0;i--){
            if(i % 6 == 0)
                System.out.println(i);
        }

    }

    public static void zad2(){

        int tablica[] = new int[5];
        int i = 0;
        Scanner klawisze = new Scanner(System.in);
        while(i < 5){
            tablica[i] = klawisze.nextInt();
            i++;
        }

        for(int j : tablica){

            System.out.println(j + 11 + " ");

        }


    }




    public static void main(String[] args) {
        zad1();
        zad2();

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez 6
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


    }
}
