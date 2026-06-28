package com.oops.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = null;

        try {
            bw = new BufferedReader(
                    new FileReader(
                            "/Users/shubhamphansekar/Downloads/takeUforward/AdvProgrammingInOOPS/src/com/oops/files/example.txt"));
            String line;
            while ((line = bw.readLine()) != null) {
                System.out.println(" " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }
}
