package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class BadResource {
    public static void readFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        // Sonar issue: resource opened but not closed -> resource leak
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        // missing fis.close();
    }

    public static void main(String[] args) throws IOException {
        readFile("test.txt");
    }
}
