import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, AttendanceApp!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Welcome " + name + "!");
    }
}
