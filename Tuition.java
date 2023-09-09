import java.util.Scanner;

class Tuition{
    public static void main(String[] args){

        int units;
        double exam = 50.0;
        double id = 20.0;
        double OrgFee = 10.0;
        double surcharge = 0.01;

        Scanner get = new Scanner(System.in);

        System.out.print("How many units will you take? ");
        units = get.nextInt();

            if(units<10) {
                int cost = 200;
                int partialFee = units * cost;
                double tuitionFee = partialFee + exam + id + OrgFee;

                System.out.println("Did you enroll on time? 1(Yes) 2(No)");
                int enroll = get.nextInt();

                    if(enroll == 2) {
                        double TotalTuitionFee = tuitionFee + surcharge;
                        double FinalTuitionFee = TotalTuitionFee + tuitionFee;
                        System.out.println("Your total tuition fee is " + FinalTuitionFee);
                    } else{
                        System.out.println(tuitionFee);}

                    } else if(units>10) {
                        int cost = 200;
                        int partialFee = units * cost;
                        double tuitionFee = partialFee + exam + id + OrgFee;

                        System.out.println("Did you enroll on time? ");
                        int enroll = get.nextInt();

                            if(enroll == 2) {
                                double TotalTuitionFee = tuitionFee + surcharge;
                                double FinalTuitionFee = TotalTuitionFee + tuitionFee;
                                System.out.println("Your total tuition fee is " + FinalTuitionFee);
                            } else{
                                System.out.println(tuitionFee);
                            }
                    }

        }
        

    }