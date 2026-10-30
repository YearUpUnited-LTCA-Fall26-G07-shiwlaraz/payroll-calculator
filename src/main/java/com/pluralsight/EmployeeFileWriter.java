package com.pluralsight;

import java.io.IOException;
import java.io.*;



public class EmployeeFileWriter {

    public static void WriteEmployeeFileTo() {
        try {
            FileWriter writer = new FileWriter("skills.txt");
            BufferedWriter bufWriter = new BufferedWriter(writer);

            String text;

            for (int i = 0; i <= 10; i++) {
                text = String.format("Counting %d%n", i);
                bufWriter.write(text);
            }

            bufWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }
    }
}




