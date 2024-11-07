import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;

public class Q_10989 {

    public static void main(String[] args) throws  IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input_text = Integer.parseInt(input.readLine());

        int[] num_list = new int[input_text];

        for(int i=0; i<input_text; i++){
            int text_num = Integer.parseInt(input.readLine());
            num_list[i] = text_num;
        }
        Arrays.sort(num_list);

        for(int temp : num_list){
            bw.write(temp + "\n");
        }
        bw.flush();
        bw.close();
        input.close();
    }
}
