import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
    public static void display() {
        System.out.println("Welcome to Employee Wage Computation Program");
    }

    public static void employeeCheck(int wagePerHour, int fullTimeHours, int partTimeHours) {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for Full-Time Employee ");
            System.out.print("Enter 2 for Part-Time Employee ");
            int input = scanner.nextInt();
            int dailyWage;

            switch (input) {
                case 1:
                    dailyWage = wagePerHour * fullTimeHours;
                    System.out.println("Full-Time Employee's Daily Wage: " + dailyWage);
                    break;
                case 2:
                    dailyWage = wagePerHour * partTimeHours;
                    System.out.println("Part-Time Employee's Daily Wage: " + dailyWage);
                    break;
                default:
                    System.out.println("Invalid Employee Type");
            }
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        display();

        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;

        employeeCheck(wagePerHour, fullTimeHours, partTimeHours);
    }
}