package com.pluralsight;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        Employee[] employees = EmployeeFileReader.readEmployeeFromFile();

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.printf("%d | %s | $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
                        Thread.sleep(5000);
            }

        }
    }
}




