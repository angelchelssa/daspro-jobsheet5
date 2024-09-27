import java.util.Scanner;

public class PemilihanHariDenganIf123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("hari ini adalah weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Hari ini adalah Weekend");
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}