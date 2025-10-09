import java.util.Scanner;

public class ifprintKRS21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Have the tuition fees been paid in full? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT payent has been verified");
            System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
        } else {
            System.out.println("Registration rejected.Please pay UKT first.");
        }
    }
}
