import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int[] wypelnienie(int x) {
        int[] tab = new int[x];
        int y = 40;
        for (int i = 0; i < x; i++) {
            tab[i] = y;
            y--;
        }
        return tab;
    }

    public static void wypisanie(int[] tab) {
        for (int x : tab) {
            System.out.print(x + " ");
        }
    }

    public static String[] tekst(){
        String x;
        String[] tab1 = new String[6];
        Scanner skaner = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            x = skaner.next();
            tab1[i] = x;
        }
        return tab1;
    }

    public static void wypisanieString(String[] tab) {
        String x;
        for(int i = 5; i >=0; i--){
            x = tab[i];
            System.out.println(x);
        }
    }

    public static void jeden(String imie){
        System.out.println(imie);
    }
    public static void jeden(String imie,String nazwisko){
        System.out.println(imie + " " + nazwisko);
    }
    public static void jeden(String imie,String nazwisko,int wiek){
        System.out.println(imie + " " + nazwisko + " " + wiek);
    }

    public static int suma(int x,int y){

        int suma = x + y;
        return suma;
    }

    public static int suma(int x,int y, int z){

        int suma = x + y + z;
        return suma;
    }
    public static void main(String[] args) {

        int tab[] = wypelnienie(20);
        wypisanie(tab);

        String tab1[] = tekst();
        wypisanieString(tab1);

        jeden("Szymon","Nowak",32);

        int zmiennaA = suma(20,25);
        int zmiennaB = suma(24,66,12);
        System.out.println("Wynik: " + suma(23,24) + suma(12,13,14));

    /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

    }

}
