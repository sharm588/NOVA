import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class screenshotTest {
    public static void main(String[] args) throws IOException {
        try {
            Process s = Runtime.getRuntime().exec(
                    "python ../../../../screenshot.py");
            s.waitFor();
            //}
        } catch (Exception e) {
        }
    }
}
