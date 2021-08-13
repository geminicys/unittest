import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String x = br.readLine();
            String y = br.readLine();
            int sum = calculator.add(Integer.parseInt(x), Integer.parseInt(y));
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
