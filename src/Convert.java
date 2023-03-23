import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        float Temperature;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter temperature in Farenheit");
        Temperature=in.nextInt();

        Temperature=((Temperature-32)*5)/9;
        System.out.println("Temperature in Celsius "+ Temperature);

    }
}
