package sample;

import java.util.Random;

	class Employee {
	    // Constants
	    static final int FULL_TIME = 1;
	    static final int PART_TIME = 2;
	    static final int WAGE_PER_HOUR = 20;
	    static final int FULL_DAY_HOURS = 8;
	    static final int PART_TIME_HOURS = 4;
	    static final int WORKING_DAYS_PER_MONTH = 20;
	    static final int MAX_WORKING_HOURS = 100;

	    // Instance variables
	    private int totalWage;
	    private int totalWorkingHours;
	    private int totalWorkingDays;

	    // Method to check if employee is present or absent
	    private int checkAttendance() {
	        Random random = new Random();
	        return random.nextInt(2) + 1; // Returns 1 for Present, 2 for Absent
	    }

	    // Method to calculate daily employee wage
	    private int calculateDailyWage(int attendance) {
	        int dailyWage = 0;
	        switch (attendance) {
	            case FULL_TIME:
	                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
	                break;
	            case PART_TIME:
	                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
	                break;
	        }
	        return dailyWage;
	    }

	    // Method to calculate monthly wage
	    private void calculateMonthlyWage() {
	        for (int day = 0; day < WORKING_DAYS_PER_MONTH; day++) {
	            int attendance = checkAttendance();
	            totalWage += calculateDailyWage(attendance);
	            totalWorkingHours += (attendance == FULL_TIME) ? FULL_DAY_HOURS : PART_TIME_HOURS;
	            totalWorkingDays++;
	        }
	    }

	    // Method to calculate wage till a condition is met
	    private void calculateWagesTillCondition() {
	        while (totalWorkingDays < WORKING_DAYS_PER_MONTH && totalWorkingHours < MAX_WORKING_HOURS) {
	            int attendance = checkAttendance();
	            totalWage += calculateDailyWage(attendance);
	            totalWorkingHours += (attendance == FULL_TIME) ? FULL_DAY_HOURS : PART_TIME_HOURS;
	            totalWorkingDays++;
	        }
	    }

	    // Method to display welcome message
	    private void displayWelcomeMessage() {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	    }

	    // Method to display daily wage
	    private void displayDailyWage() {
	        int attendance = checkAttendance();
	        int dailyWage = calculateDailyWage(attendance);
	        System.out.println("UC 1: Daily Wage for Employee is: " + dailyWage);
	    }

	    // Method to display part-time employee wage
	    private void displayPartTimeEmployeeWage() {
	        int partTimeWage = calculateDailyWage(PART_TIME);
	        System.out.println("UC 2: Part Time Employee Wage is: " + partTimeWage);
	    }

	    // Method to display wage using switch case
	    private void displayWageUsingSwitch() {
	        int wageUsingSwitch = calculateDailyWage(FULL_TIME);
	        System.out.println("UC 3: Wage Using Switch for Full Time Employee is: " + wageUsingSwitch);
	    }

	    // Method to display monthly wage
	    private void displayMonthlyWage() {
	        calculateMonthlyWage();
	        System.out.println("UC 4: Monthly Wage for Employee is: " + totalWage);
	    }

	    // Method to display wage till a condition is met
	    private void displayWagesTillCondition() {
	        calculateWagesTillCondition();
	        System.out.println("UC 5: Wage till condition is met: " + totalWage);
	    }

	    // Method to refactor the code using a class method and class variables
	    private static void computeEmployeeWage() {
	        Employee employee = new Employee();
	        employee.displayDailyWage();
	        employee.displayPartTimeEmployeeWage();
	        employee.displayWageUsingSwitch();
	        employee.displayMonthlyWage();
	        employee.displayWagesTillCondition();
	    }

	    public static void main(String[] args) {
	        Employee employee = new Employee();
	        employee.displayWelcomeMessage();
	        computeEmployeeWage(); // UC 6 and UC 7 are covered in this method
	    }
	}


