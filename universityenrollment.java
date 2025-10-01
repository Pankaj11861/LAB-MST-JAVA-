import java.util.*;

class InvalidEnrollmentException extends Exception {
    public InvalidEnrollmentException(String msg) { super(msg); }
}

public class universityenrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = sc.nextLine();
            int age = sc.nextInt();
            int courseId = sc.nextInt();
            int credits = sc.nextInt();

            if (age < 17 || age > 30) throw new InvalidEnrollmentException("Invalid age. Must be between 17 and 30.");
            if (courseId < 10000 || courseId > 99999) throw new InvalidEnrollmentException("Invalid Course ID. Must be a 5-digit number.");
            if (credits < 1 || credits > 30) throw new InvalidEnrollmentException("Invalid number of credits. Must be between 1 and 30.");

            System.out.println("Enrollment Successful!");
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course ID: " + courseId);
            System.out.println("Credits: " + credits);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values for age, course ID, and credits.");
        } catch (InvalidEnrollmentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
