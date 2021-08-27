package processing.core;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        String string = "";
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            Process p = Runtime.getRuntime().exec(
                    "python ../../../../read_image.py --image=" + args[0]);
            p.waitFor();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            // for reading one line
           // String line = null;
            // keep reading till readLine returns null
            //while ((line = in.readLine()) != null) {
                // keep appending last line read to buffer
                string = in.readLine();
                stringBuffer.append(string);
            //}
        } catch (Exception e) {
        }
        String file = "../../../../sexData.txt";
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        PrintWriter eraseWriter = new PrintWriter(file);
        eraseWriter.write("");
        eraseWriter.close();
        printWriter.print(stringBuffer);
        //System.out.println(stringBuffer);
        printWriter.close();

    }
}
