import java.math.BigInteger;
import java.util.Scanner;

public class AddLargeNumber {
    public static void main(String[] args) {
        System.out.println("Enter two integer: ");
        String x,y;
        Scanner in=new Scanner(System.in);

        x=in.nextLine();
        y=in.nextLine();

        BigInteger first=new BigInteger(x);
        BigInteger second=new BigInteger(y);

        BigInteger sum;
        sum=first.add(second);
        System.out.println("Result: "+ sum);

    }
}
