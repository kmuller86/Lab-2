import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int a = 1000;
        int index = 86;
        while ((--a) > 0) {
            System.out.print("\nindex: " + a);
            if (a % index == 0) {
                System.out.print(" - podzielna przez 86");
            }
        }
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int[] intArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i = 0;
        while (i < 10) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println("\nWpis procesu" + intArray[i]);
            i++;
        }

        double[] myArray = {3.4, 5.5, 7.0, 12.3};
        int j = 0;
        double sum = 0;
        while (j < myArray.length) {
            sum += myArray[j];
            j++;
        }
        System.out.println("Summa : " + sum);


        String[] names = {"Doc", "Dopey", "Bashful", "Grumpy", "Sneezy", "Sleepy", "Happy"};
        int L = 0;
        while (L < names.length) {
            System.out.println(names[L]);
            L++;
        }

        String[] namesdog = {"Doc", "Dopey", "Bashful", "Grumpy", "Sneezy", "Sleepy", "Happy"};
        int L1 = names.length - 1;
        while (L1 >= 0) {
            System.out.println(names[L1]);
            L1--;
        }

         /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        int m = 3;
        do {
            System.out.println(m);
            m++;
        } while (false);

        while (true) {
            System.out.println(index);
            break; // "break" muszi być a to  będzie nieskończona pęntla;
        }


    }
}
