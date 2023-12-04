import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
    public static void display() {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
    public static void employeeCheck(int wagePerHour, int fullTimeHours, int partTimeHours) {
        Random random = new Random();
        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        while (totalHoursWorked < 100 && totalDaysWorked < 20) {
            int attendance = random.nextInt(2);
            if(attendance == 1) {
                System.out.println("Employee is Present");
                int employeeType = (int) (Math.random() * 2) + 1;

                if (totalHoursWorked < 100 && totalDaysWorked < 20) {
                    switch (employeeType) {
                        case 1:
                            if (totalHoursWorked + fullTimeHours <= 100) {
                                totalHoursWorked += fullTimeHours;
                                totalDaysWorked++;
                                int dailyWage = wagePerHour * fullTimeHours;
                                totalWage += dailyWage;
                                break;
                            }
                        case 2:
                            if (totalHoursWorked + partTimeHours <= 100) {
                                totalHoursWorked += partTimeHours;
                                totalDaysWorked++;
                                int dailyWage = wagePerHour * partTimeHours;
                                totalWage += dailyWage;
                                break;
                            }
                    }
                }
            } else {
                System.out.println("Employee is Absent");
            }
        }
        System.out.println("Total Working Days: " + totalDaysWorked);
        System.out.println("Total Working Hours: " + totalHoursWorked);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
    public static void main(String[] args) {
        display();

        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;

        employeeCheck(wagePerHour, fullTimeHours, partTimeHours);
    }
}