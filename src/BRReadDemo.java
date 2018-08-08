import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        String str;
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
