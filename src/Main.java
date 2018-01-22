import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, AttendanceApp!\n");
        //read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();
        //output welcome message
        System.out.println("Welcome " + name + "!");

        //output a list of absences
        ArrayList<Integer> absences = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < name.length(); i++) {
            absences.add(random.nextInt(11));
        }
        System.out.println("The elements are: " + absences);
    }
}
