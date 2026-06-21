import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // 1. Collecting User Input
        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = input.next().charAt(0);
        
        // Consume the leftover newline character before reading the next line
        input.nextLine(); 

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Level: ");
        int level = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        // 2. Processing Conditions
        // Determine Adult Status
        String adultStatus = (age >= 18) ? "YES" : "NO";

        // Determine Academic Classification based on GPA
        String academicClass;
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0 && gpa < 3.5) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5 && gpa < 3.0) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        // 3. Displaying Formatted Student Profile
        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);

        // Close the scanner resource
        input.close();
    }
}
