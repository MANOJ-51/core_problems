import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        /* Taking input from user */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number [N] :- ");
        int N = input.nextInt();
        float num = 0;
        if(N != 0) {
            for(float i=1; i<=N; i++) {
                num += (1/i);
            }
            System.out.println("The value of harmonic number of " + N + " is " + num);
        }
        else {
            System.out.println("Enter a valid number");
        }
    }
}
