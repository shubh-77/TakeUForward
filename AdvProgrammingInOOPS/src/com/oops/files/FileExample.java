package com.oops.files;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File file = new File(
                "/Users/shubhamphansekar/Downloads/takeUforward/AdvProgrammingInOOPS/src/com/oops/files/example.txt");

        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.canRead());

    }
}
