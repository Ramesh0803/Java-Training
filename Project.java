import java.util.Scanner;
public class Project{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        String[] names = new String[n];
        int[] marks = new int[n];

        // Input student details
        System.out.println("Enter details of 10 students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Find topper
        int max = marks[0];
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topperIndex = i;
            }
        }

        System.out.println("\nTopper:");
        System.out.println(names[topperIndex] + " - " + marks[topperIndex]);

        // Search student by name
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.next();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found: " + names[i] + " - " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        // Display students with marks > 75
        System.out.println("\nStudents scoring more than 75:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > 75) {
                System.out.println(names[i] + " - " + marks[i]);
            }
        }

        // Calculate class average
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        double average = (double) sum / n;
        System.out.println("\nClass Average: " + average);

        // Sort students by marks (ascending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] > marks[j]) {
                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\nStudents sorted by marks:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        sc.close();
    }
}