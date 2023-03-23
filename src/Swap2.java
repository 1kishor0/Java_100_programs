import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter X and Y: ");
        Scanner in=new Scanner(System.in);

        x= in.nextInt();
        y=in.nextInt();

        System.out.println("Before Swapping : "+x +"\ty: "+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swappinhg x: "+x+"\ty: "+y);
    }
}
