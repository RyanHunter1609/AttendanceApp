import java.util.ArrayList;
import java.util.Collections;
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

        int absenceThree = lessThanThreeAbsences(absences);


        System.out.println("The number of students with less than 3 absences: " + absenceThree);


        System.out.println("The number of students with perfect attendance and less than 3 absences: " + lessThanThreeSum(countPerfect, absenceThree));

        System.out.println("Type the number of absences: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("USER INPUT: " + number);
        System.out.println(absences.lastIndexOf(number) + " student(s) had " + number + " absence(s).");
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

    private static int lessThanThreeAbsences(ArrayList<Integer> absences) {
        //calculate the number of students with less than 3 absences
        int count = 0;

        for (int i = 0; i < absences.size(); i++) {
            if (absences.get(i) < 3) {
                count++;
            }
        }
        return lessThanThreeAbsences(absences);
    }

    private static int lessThanThreeSum(int countPerfect, int absenceThree) {
        //what percentage of students who had fewer than 3 absences also had perfect attendance?
        //parts divided by whole
        int sum = countPerfect % absenceThree;
        return sum;

    }

}

