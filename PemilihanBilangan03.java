import java.util.Scanner;
/**
 * PemilihanBilangan03
 */
public class PemilihanBilangan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) 
        {
         System.out.println("Angka " + angka + " termasuk bilangan genap");   
        }
        else 
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil ");
        }

        sc.close();
        
    }
}