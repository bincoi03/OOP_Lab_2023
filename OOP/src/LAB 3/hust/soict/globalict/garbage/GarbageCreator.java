package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\Competitive programming\\Java\\OOP\\src\\LAB 3\\hust\\soict\\globalict\\garbage\\test.exe";
        byte[] inputBytes = { 0 };
        long startTime , endTime ;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for(byte b : inputBytes)
            outputStringBuilder.append((char)b);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}