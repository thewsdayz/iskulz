import java.util.Scanner;

public class Gs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grades for quizzes, major exams, attendance, and recitation
        System.out.println("Enter the grades for 3 quizzes (30%):");
        double quiz1 = scanner.nextDouble();
        double quiz2 = scanner.nextDouble();
        double quiz3 = scanner.nextDouble();

        System.out.println("Enter the grades for 2 major exams (40%):");
        double exam1 = scanner.nextDouble();
        double exam2 = scanner.nextDouble();

        System.out.println("Enter the attendance grade (10%):");
        double attendance = scanner.nextDouble();

        System.out.println("Enter the recitation grade (10%):");
        double recitation = scanner.nextDouble();

        // Calculate the final grade
        double quizAverage = (quiz1 + quiz2 + quiz3) / 3;
        double examAverage = (exam1 + exam2) / 2;
        double finalGrade = (quizAverage * 0.3) + (examAverage * 0.4) + (attendance * 0.1) + (recitation * 0.1);

        // Determine the letter grade
        String letterGrade;
        if (finalGrade < 74) {
            letterGrade = "E";
        } else if (finalGrade >= 75 && finalGrade <= 80) {
            letterGrade = "D";
        } else if (finalGrade >= 81 && finalGrade <= 85) {
            letterGrade = "C";
        } else if (finalGrade >= 86 && finalGrade <= 90) {
            letterGrade = "B";
        } else {
            letterGrade = "A";
        }

        // Output the final grade
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}
