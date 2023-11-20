import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int totalStudents = sc.nextInt();
        int ts = totalStudents; 

        double[] averages = new double[ts];

        for (int student = 1; student <= ts; student++) {
            double quizTotal = 0;
            double examTotal = 0;
            double attendance = 0;
            double recitation = 0;

            for (int quiz = 1; quiz <= 3; quiz++) {
                System.out.print("Enter Quiz " + quiz + " score for Student " + student + ": ");
                quizTotal += sc.nextDouble();
            }

            for (int exam = 1; exam <= 2; exam++) {
                System.out.print("Enter Exam " + exam + " score for Student " + student + ": ");
                examTotal += sc.nextDouble();
            }

            System.out.print("Enter Attendance score for Student " + student + ": ");
            attendance = sc.nextDouble();

            System.out.print("Enter Recitation score for Student " + student + ": ");
            recitation = sc.nextDouble();

            // Calculate the average for the student
            double average = (quizTotal * 0.3) + (examTotal * 0.4) + (attendance * 0.1) + (recitation * 0.1);

            averages[student - 1] = average;
        }

        // Find the highest and lowest average
        double highestAverage = averages[0];
        double lowestAverage = averages[0];
        int highestStudent = 1;
        int lowestStudent = 1;

        for (int student = 1; student <= ts; student++) {
            if (averages[student - 1] > highestAverage) {
                highestAverage = averages[student - 1];
                highestStudent = student;
            }

            if (averages[student - 1] < lowestAverage) {
                lowestAverage = averages[student - 1];
                lowestStudent = student;
            }
        }

        // Display the results
        System.out.println("Student " + highestStudent + ": average " + highestAverage + " - " + getEquivalentGrade(highestAverage));
        System.out.println("Student " + lowestStudent + ": average " + lowestAverage + " - " + getEquivalentGrade(lowestAverage));

        sc.close();
    }

    // Function to get the equivalent grade
    private static String getEquivalentGrade(double average) {
        if (average >= 91) {
            return "A";
        } else if (average >= 86) {
            return "B";
        } else if (average >= 81) {
            return "C";
        } else if (average >= 75) {
            return "D";
        } else {
            return "E";
        }
    }
}
