import java.util.*;

public class Main {

    public static ArrayList<String> zad1(){

        int x = 0;
        Scanner skan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        while(x < 5){
            lista.add(skan.next());
            x++;
        }
        return lista;
    }

    public static void wypisanie(ArrayList<String> lista) {
        for (String x : lista) {
            System.out.print(x + ", ");
        }
    }

    public static Set<Integer> liczby(){
        Scanner skan = new Scanner(System.in);
        Set<Integer> liczba = new TreeSet<>();
        int x = 0;
        while(x < 5){
            liczba.add(skan.nextInt());
            x++;
        }
        return liczba;

    }

    public static void wypisanieSet(Set<Integer> liczby) {

        System.out.println("liczby: " + liczby);

        for (int x : liczby) {
            System.out.print(x + ", ");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = zad1();
        wypisanie(lista1);

        lista1.remove(4);
        lista1.remove(3);
        System.out.println(lista1 + ", wielkość listy - " + lista1.size());
        Collections.sort(lista1, Collections.reverseOrder());
        wypisanie(lista1);

        Set<Integer> liczba = new TreeSet<>();
        wypisanieSet(liczba);

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */


    }

}
