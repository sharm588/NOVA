package com.company;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) {
        System.out.println("test");
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            Process p = Runtime.getRuntime().exec(
                    "python /Users/rohit/IdeaProjects/NovaStuff/tester.py");
            p.waitFor();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            // for reading one line
            String line = null;
            // keep reading till readLine returns null
            while ((line = in.readLine()) != null) {
                // keep appending last line read to buffer
                stringBuffer.append(line + " ");
            }
        } catch (Exception e) {
        }
        System.out.println(stringBuffer);

    }
}
