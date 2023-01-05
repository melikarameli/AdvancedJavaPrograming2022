package org.example.one.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * byte po byte
 *
 * java.io.FileInputStream inputReader
 * java.io.FileOutputStream outputReader
 */
public class CopyBytesDemo {
    public static void main(String[] args) {
        try (FileInputStream inputReader  = new FileInputStream("in.txt");
             FileOutputStream outputWriter = new FileOutputStream("out.txt");) {
            int dataByte;
            while ((dataByte = inputReader.read())!= -1) {
                System.out.print((char)dataByte);
                outputWriter.write(dataByte);
            }
            System.out.println(dataByte);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
