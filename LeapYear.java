import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A YEAR:");
        int year = input.nextInt();
        System.out.println("YEAR:" + year);
        if ( ((year % 4)==0) ) {
            System.out.println("YEAR IS A LEAP YEAR");
        }
        else{
            System.out.println("YEAR IS NOT A LEAP YEAR");
        }
    }
}
