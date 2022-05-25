import java.util.Scanner;

public class Q_R {
    public static void main(String[] args) {
        /* Taking input from user */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number [DIVIDEND] :- ");
        float DIVIDEND = input.nextInt();
        System.out.print("Enter a number [DIVISOR] :- ");
        float DIVISOR = input.nextInt();
        float quotient = DIVIDEND / DIVISOR;
        float remainder = DIVIDEND % DIVISOR;
        System.out.println("The quotient is : " + quotient);
        System.out.println("The remainder is : " + remainder);

    }
}
