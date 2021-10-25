import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        for (int i = 100; i >= 0; i--) {
            System.out.print("\n" + i);
            if (i % 8 == 0) {
                System.out.print(" - podzilone przez 8");
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int[] a = new int[5];
        int i = 0;


        Scanner in = new Scanner(System.in);

        for (int element : a) {

            System.out.println("\nPodaj " + (i + 1) + " element  tablicy: ");
            a[i] = in.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(a));


        for (int element: a) {
            System.out.println(element + 11);
        }


    }
}
