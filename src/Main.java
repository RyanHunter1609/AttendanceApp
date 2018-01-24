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

        //calculate the number of students with perfect attendance
        int countPerfect = 0;
        for (int i = 0; i < name.length(); i++) {
            if (absences.get(i) == 0) {
                countPerfect++;
            }
        }
        System.out.println("The number of students with perfect attendance: " + countPerfect);

        //calculate the average of absences
        double avg = average(absences);
        //output average of absences
        System.out.println("The average number of absences: " + avg);

        //calculate the number of students with less than 3 absences
        int count = 0;

        for (int i = 0; i < absences.size(); i++) {
            if (absences.get(i) < 3) {
                count++;
            }
        }
        System.out.println("The number of students with less than 3 absences: " + count);

        //what percentage of students who had fewer than 3 absences also had perfect attendance?
        //parts divided by whole
        int sum = countPerfect % count;
        System.out.println("The number of students with perfect attendance and less than 3 absences: " + sum);
    }

    private static double average(ArrayList<Integer> absences) {
        //put double in parentheses to 'Cast' it as a double instead of an int problem
        return (double) sum(absences) / absences.size();
    }

    //create a function to calculate the sum
    private static int sum(ArrayList<Integer> absences) {
        int sum = 0;
        for (int i = 0; i < absences.size(); i++) {
            sum += absences.get(i);
        }
        return sum;
    }
}
