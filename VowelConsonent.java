import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER:");
        char digit =input.next().charAt(0);
        if(digit == 'a' || digit == 'e' || digit == 'i' || digit == 'o' || digit == 'u' ||
                digit == 'A' || digit == 'E' || digit == 'I' || digit == 'O' || digit == 'U')
        {
            System.out.println( digit + " is vowel.");
        }
        else
        {
            System.out.println( digit + " is consonent.");
        }
     }
}
