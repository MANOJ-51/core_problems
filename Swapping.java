import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF [X]:");
        int X=input.nextInt();
        System.out.println("ENTER THE VALUE OF [Y]:");
        int Y= input.nextInt();
        System.out.println("X:"+X);
        System.out.println("Y:"+Y);
        System.out.println("THE NUMBERS ARE GETTING SWAPPED");
        X=X+Y;
        Y=X-Y;
        X=X-Y;
        System.out.println("X:"+X);
        System.out.println("Y:"+Y);
    }
}
