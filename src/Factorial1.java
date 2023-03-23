import java.util.Scanner;

public class Factorial1 {
     int n,factt;
     void fact(int n,int factt){
       this.n=n;
       this.factt=factt;
       if(n<0){
           System.out.println("Number should be non negative");
       }
       else {
           for (int i = 1; i <=n ; i++) {

               factt=factt*i;

           }
           System.out.println("Factorial of  "+n+" is "+factt);
       }
    }


    public static void main(String[] args) {
        int n,c,factt=1;

        System.out.println("Enter an integer to calculate its factorial: ");
        Scanner in=new Scanner(System.in);
        Factorial1 obj=new Factorial1();
        n=in.nextInt();
        obj.fact(n,factt);

    }
}
