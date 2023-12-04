import java.util.Random;

public class EmployeeWageComputation {
    public static void display() {
        System.out.println("Welcome to Employee Wage Computation Program");
    }

    public static void employeeCheck(int wagePerHour, int fullTimeHours, int partTimeHours) {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");

            int fullTimeWage = wagePerHour * fullTimeHours;
            System.out.println("Full-Time Employee's Daily Wage: " + fullTimeWage);

            int partTimeWage = wagePerHour * partTimeHours;
            System.out.println("Part-Time Employee's Daily Wage: " + partTimeWage);
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
