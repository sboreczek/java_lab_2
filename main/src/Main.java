public class Main {

    public static void zad1(){

        int i = 1000;
        do{
            if(i%46 == 0)
                System.out.println("liczba " + i + " jest podzielna przez " + 46);
            i--;
        }while(i > 0);

    }

    public static void zad2(){

        int i = 0;
        int[] tab = {5,25,64,32,15};
        while(i<5){
            System.out.println(tab[i] + " ");
            i++;
        }

        i = 0;

        double[] tab2 = {45.43,213.324,22.66,55.123,52.43};
        while(i<5){
            System.out.println(tab2[i] + " ");
            i++;
        }

        i = 0;

        String[] tab3 = {"KOT","Woda","PRimavera","PAPPARDELLE","nintendo"};
        while(i<5){
            System.out.println(tab3[i] + " ");
            i++;
        }
    }


    public static void zad3() {
        int i = 0;
        while (true){

            if(i == 100)
                break;

            else{

                i++;
                System.out.println(i);

            }
        }

        //Pętla while(false) powoduje błąd kompilacji ponieważ instrukcje w niej zawarte nigdy nie zostaną wykonane ze względu na niemożliwość spełnienia warunku


    }

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();

    }


}
