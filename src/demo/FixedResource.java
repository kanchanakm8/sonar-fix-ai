package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FixedResource {
    public static void readFile(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path)) {
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        readFile("test.txt");
    }
}
