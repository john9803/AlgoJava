import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10816 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(readLine());

        int[] inputOne = Arrays.stream(readLine().split(" ")).mapToInt(Integer::parseInt).toArray();







    }

    public static String readLine() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return bf.readLine();
    }
}
