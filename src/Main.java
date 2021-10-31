import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */


        methoda2(methoda1());
        String a []= new String[6];
        methoda3(a);
        methoda4(a);
        methoda5("Ivan");
        methoda5("Ivan","Engels");
        methoda5("Ivan","Engels",26);
        int zmiennaA=(methoda6(6,7));
        int zmiennaB=(methoda6(1,2,3));
        System.out.println("wynik: "+(methoda6(6,7))+" wynik: "+methoda6(1,2,3));

    }
     public  static int [] methoda1 (){
        int [] a = {40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20};


        return a;
     }
     public static void methoda2 (int[]a){
        for (int number: a){
            System.out.println("This is: " + number);
        }
     }


     public static void  methoda3  (String[] a){
        Scanner in = new Scanner(System.in);
        int i=0;
        for (String element :a ){
        System.out.println("\nPodaj " + (i + 1) + " element  tablicy: ");
        a [i]=in.nextLine();
        i++;
        }
    }
    public static void methoda4(String []a){
        System.out.print("Wywolujemy elementy tablicy od ostatniego elementu \n");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);

        }
    }

    public static void methoda5(String imie){
         System.out.println("Mam na imie "+imie);

    }
    public static void methoda5(String imie, String nazwisko){
         System.out.println("Mam na Imie "+imie+" moje Nazwisko "+nazwisko);

    }
    public static void methoda5(String imie,String nazwisko, int wiek){

         System.out.println("Mam na Imie "+imie+" moje Nazwisko "+nazwisko+" mam "+wiek);
    }

    public static int methoda6(int a , int b){
      return a+b;
     }
     public static int methoda6(int a,int b,int c){
         return a+b+c;
     }
}









