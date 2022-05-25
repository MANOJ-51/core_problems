import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number [N1] :- ");
        int N1 = input.nextInt();
        System.out.print("Enter a number [N2] :- ");
        int N2 = input.nextInt();
        System.out.print("Enter a number [N3] :- ");
        int N3 = input.nextInt();
        if(N1 > N2 && N1 > N3) {
            System.out.println( N1 + " is largest number.");
        }
        else if(N2 > N1 && N2 >N3){
            System.out.println( N2 + " is largest number.");
        }
        else {
            System.out.println( N3 + " is largest number.");
        }
    }
}
