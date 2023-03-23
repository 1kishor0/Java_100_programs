import java.util.Scanner;

public class InputUsingScanner {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        s=in.nextLine();
        System.out.println("You Entered a String "+s);

        System.out.println("Enter an Integer");
        a=in.nextInt();
        System.out.println("You entered an integer "+ a);

        System.out.println("Enter  float");
        b=in.nextFloat();
        System.out.println("You Entered a float "+ b);

    }
}
