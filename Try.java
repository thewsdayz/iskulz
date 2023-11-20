import java.util.Scanner;

class Try{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double highestAverage = 0;
        double lowestAverage = 0;
        int highestStudent = 0;
        int lowestStudent = 0;

        System.out.print("Enter how many students: ");
        int totalstudents = sc.nextInt();
        int t = totalstudents;

        for (int student = 1; student <= t; student++){
            double qtotal = 0;
            double etotal = 0;
            double att = 0;
            double recit = 0;

            int quiz = 1;
            while (quiz <= 3){ // gumagana na
                System.out.print("Enter Quizzes " + quiz + " score for Student " + student + ": ");
                qtotal += sc.nextDouble();
                quiz++;
            }

            int exam = 1;
            while (exam <= 2){ // ayos naman
                System.out.print("Enter Major Exam " + exam + " score for the Student " + student + ": ");
                etotal += sc.nextDouble();
                exam++;
            }

            System.out.print("Enter Attendance score for the Student " + student + ": ");
            att = sc.nextDouble();

            System.out.print("Enter Recitation score for the Student " + student + ": ");
            recit = sc.nextDouble();

            double average = (qtotal * 0.3) + (etotal * 0.2) + (att * 0.1) + (recit * 0.1);

            if (average < lowestAverage || lowestAverage == 0){
                lowestAverage = average;
                lowestStudent = student;
            }
            else{
                highestAverage = average;
                highestStudent = student;
            }

            if(average < 74){
                System.out.println("Student " + student + " average is equivalent to E");
            }
            else if(average >= 75 && average <= 80){
                System.out.println("Student " + student + " average is equivalent to D");
            }
            else if(average >= 81 && average <= 85){
                System.out.println("Student " + student + " average is equivalent to C");
            }
            else if(average >= 86 && average <= 90){
                System.out.println("Student " + student + " average is equivalent to B");
            }
            else{
                System.out.println("Student " + student + " average is equivalent to A");
            }
        }

        System.out.println("Highest Average is for Student " + highestStudent + ": " + highestAverage);
        System.out.println("Lowest Average is for Student " + lowestStudent + ": " + lowestAverage);

        sc.close();
    }
}