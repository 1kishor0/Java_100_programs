import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedLoops {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n;
        ArrayList<Integer> primes=new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            primes.add(i);
        }
        for(int t: primes){
            System.out.print(t+" ");
        }
    }
}
