import java.util.Scanner;
/**
 * PemilihanHari03
 */
public class PemilihanHari03 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String dayName;
        String dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thrusday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
            dayType = "invalid day name";
                break;
        }
        System.out.println(dayName + " is a " + dayType);

        sc.close();
    }
}