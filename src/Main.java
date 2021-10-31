import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.*;

public class Main {



    public static void main(String[] args) {
        /* ćw_6 Listy */
       System.out.println("Wpisz imiena zwierzat: ");
       Scanner in = new Scanner(System.in);
       List<String> zwierzata = new ArrayList<>();

       for (int i=0;i<5;i++){
           String name = in.nextLine();
           zwierzata.add(name);

       }
        methoda(zwierzata);
        zwierzata.remove(4);
        zwierzata.remove(3);
        zwierzata.add("Bonia");
        zwierzata.add("Monia");
        zwierzata.add("Dagir");
        System.out.println(zwierzata+",wielkość listy - "+zwierzata.size());
        methoda1(zwierzata);
    }
        public static void methoda(List<String> zwierzata){
        for(String name :zwierzata){
            System.out.println("Ma na Imie:\n"+name);
        }

    }
    public static void methoda1 (List<String>zwierzata){
       Collections.reverse(zwierzata);
       System.out.println(zwierzata);
    }



}
