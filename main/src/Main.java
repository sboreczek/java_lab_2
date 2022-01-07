public class Main {

    public static void zad1(){

        for(int i = 0; i <= 25; i++){

            if(i / 13 == 1)
                break;
                System.out.println(i);

        }
        System.out.println(" ");

        for(int i = 0; i <= 25; i++){

            if(i % 2 == 0)
                continue;
            System.out.println(i);

        }
    }

    public static int zadc(int a){

        System.out.println(" ");

        int i;
        for(i = 0; i <= 25; i++){

            if(i / 13 == 1)
                return a;
            System.out.println(i);
        }
        return i;
    }





    public static void main(String[] args) {

        zad1();
        int a = zadc(5);
        System.out.println("\n" + a);

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

    }

}
