package com.company;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class callBashScript {
    static String line;
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Process p = Runtime.getRuntime().exec(
                    "sh ../pic_and_model.sh");
            p.waitFor();

        } catch (Exception e) {
        }
        FileReader reader = new FileReader("../sexData.txt");

        BufferedReader br = new BufferedReader(reader);

        // read line by line
        TimeUnit.SECONDS.sleep(15);
        line = br.readLine();
    }

    public String getOutput() throws IOException, InterruptedException{
        String output = line.substring(line.indexOf("n is") + 5, line.length() - 1);
        return output;
    }
}