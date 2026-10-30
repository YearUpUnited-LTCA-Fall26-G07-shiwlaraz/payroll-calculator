package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeFileReader {
    public static Employee[] readEmployeeFromFile() {
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

            }

        } catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");

            e.printStackTrace();
        } return employees;
    }
}




