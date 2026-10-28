package com.pruralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee[] employees = new Employee[20];
        int index = 0;

        try {
            FileReader fr1 = new FileReader("employees.csv");
            BufferedReader br1 = new BufferedReader(fr1);

            String lines1;
            br1.readLine();
            while ((lines1 = br1.readLine()) != null) {
                String[] split = lines1.split("[|]");

                int id = Integer.parseInt(split[0]);
                String name = split[1];
                double hoursWorked = Double.parseDouble(split[2]);
                double payRate = Double.parseDouble(split[3]);

                employees[index] = new Employee(id, name, hoursWorked, payRate);
                index++;

                // System.out.println(lines1);
                // System.out.println(split[0]);
            }

        } catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");

            e.printStackTrace();
        }
        for (int i = 0; i < index; i++) {
            System.out.printf("%d | %s | $%.2f%n",
                    employees[i].getEmployeeId(),
                    employees[i].getName(),
                    employees[i].getGrossPay());
                    Thread.sleep(1000);
        }
    }
}



