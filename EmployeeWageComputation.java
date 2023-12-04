import java.util.Random;

public class EmployeeWageComputation {
    public static void display(){
        System.out.println("Welcome to Employee Wage Computation Program");
    }
    public static void employeeCheck(){
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
    public static void main(String[] args) {
        display();
        employeeCheck();
    }
}
