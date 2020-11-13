package StructuralPatterns.DecoratorPattern.FileDecoratorExample;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {
    public static void main(String args[]) throws Exception {
        File file = new File("./output.txt");
        file.createNewFile();

        //OutputStream is an abstract decorator, FileOutputStream is a concrete decorator
        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();
    }
}
