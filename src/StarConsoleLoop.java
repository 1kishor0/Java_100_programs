public class StarConsoleLoop {
    public static void main(String[] args) {
        int row, numberOfStars;
        for (int i = 1; i <=10 ; i++) {
            for(numberOfStars=1;numberOfStars<=i;numberOfStars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
