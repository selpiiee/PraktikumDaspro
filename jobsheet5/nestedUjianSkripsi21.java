
import java.util.Scanner;

public class nestedUjianSkripsi21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = null;
        System.out.print("Has the student been cleared of compensation? (Y/T or Yes/No): ");
        String compensationStatus = sc.nextLine().trim();

        if (compensationStatus.equalsIgnoreCase("yes") || compensationStatus.equalsIgnoreCase("y")) {
            System.out.print("Enter the number of guidance logs with Supervisor 1: ");
            int supervisor1 = sc.nextInt();
            System.out.print("Enter the number of guidance logs with Supervisor 2: ");
            int supervisor2 = sc.nextInt();
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
            } else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            } else if (supervisor1 >= 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
            }
        } else {
            message = "Failed: The student has not been cleared of compensation.";
        }
        System.out.print(message);
    }
}
