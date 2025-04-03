import java.util.Scanner;
public class Q17_corresponding_dayofweek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a day name (e.g., Monday, Tuesday): ");
        String day = sc.nextLine().trim().toLowerCase();
        
        int dayNumber;
        switch (day) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default:
                dayNumber = -1;
                System.out.println("Invalid day name. Please enter a valid day.");
        }
        
        if (dayNumber != -1) {
            System.out.println("The corresponding day number is: " + dayNumber);
        }
    }
}
