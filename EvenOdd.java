import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number [N] :- ");
        int N = input.nextInt();
        if ((N >= 0) && ((N % 2) ==0)){
                System.out.println("\n" + N + " is an even number.");
            } else {
                System.out.println("\n" + N + " is an odd number.");
            }
        }
    }
