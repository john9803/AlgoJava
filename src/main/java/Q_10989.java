import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Q_10989 {

    public static void main(String[] args) throws  IOException{

//        mySol();
        teacherSol();

    }
    public static void mySol() throws IOException{
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

    public static void teacherSol() throws IOException{
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for (int i=0;i<N; i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i=1; i<=10000; i++){
            while(cnt[i]-- > 0){
//                System.out.println(i);
                bw.write(i+"\n");
            }
            bw.flush();

        }




    }
}
