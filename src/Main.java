import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.*;

public class Main {



    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb");
        Scanner in = new Scanner (System.in);
        Set<Integer> number = new TreeSet<>();

        for(int i = 0;i<10;i++){
            int numer = in.nextInt();
            number.add(numer);
        }

        System.out.println("Liczby: "+number);
        methoda(number);
     }
     public static void methoda(Set<Integer> number){
        int i=0;
        for(Integer x :number){
            System.out.println("Liczba "+(i+1)+" :"+x);
            i++;
        }
     }




}
