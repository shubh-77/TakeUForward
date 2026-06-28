package com.oops.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(
                "/Users/shubhamphansekar/Downloads/takeUforward/AdvProgrammingInOOPS/src/com/oops/files/example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(" " + line);
            }
        }
    }
}
