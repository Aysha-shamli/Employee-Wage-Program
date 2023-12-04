import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
    public static void display() {
        System.out.println("Welcome to Employee Wage Computation Program");
    }

    public static void employeeCheck(int wagePerHour, int fullTimeHours, int partTimeHours) {
        int workingDaysPerMonth = 20;
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for Full-Time Employee ");
            System.out.print("Enter 2 for Part-Time Employee ");
            int input = scanner.nextInt();


            switch (input) {
                case 1:
                    int dailyWage = wagePerHour * fullTimeHours;
                    int fullTimeWage = wagePerHour * fullTimeHours * workingDaysPerMonth;
                    System.out.println("Full-Time Employee's Daily Wage: " + dailyWage);
                    System.out.println("Full-Time Employee's Monthly Wage: " + fullTimeWage);
                    break;
                case 2:
                    dailyWage = wagePerHour * partTimeHours;
                    int partTimeWage = wagePerHour * partTimeHours * workingDaysPerMonth;
                    System.out.println("Part-Time Employee's Daily Wage: " + dailyWage);
                    System.out.println("Part-Time Employee's Monthly Wage: " + partTimeWage);
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