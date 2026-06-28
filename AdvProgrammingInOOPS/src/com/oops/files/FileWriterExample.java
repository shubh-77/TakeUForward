package com.oops.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(
                    new FileWriter(
                            "/Users/shubhamphansekar/Downloads/takeUforward/AdvProgrammingInOOPS/src/com/oops/files/example.txt"));

            bw.write("Hey I am writing to the file");// after write you should flush and the close
            bw.newLine();
            bw.write("Hello");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }
}
