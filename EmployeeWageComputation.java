import java.util.Random;

public class EmployeeWageComputation {
    public static void display(){
        System.out.println("Welcome to Employee Wage Computation Program");
    }

    public static void employeeCheck(int wagePerHour, int hoursWorked){
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");

            int dailyWage = wagePerHour * hoursWorked;
            System.out.println("Employee's Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        display();

        int wagePerHour = 20;
        int hoursWorked = 8;

        employeeCheck(wagePerHour, hoursWorked);
    }
}
