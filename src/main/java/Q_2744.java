// ASCII 를 이용해서  a 보다 작거나 큰지에 대해서 판단해서 대소문자 바꾸기 로직 만들었음
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String result = "";

        for(int i = 0; i< input.length(); i++){
            String temp = String.valueOf(input.charAt(i));
            if( input.charAt(i)>= 'a'){
                result += temp.toUpperCase();
            }
            else{
                result += temp.toLowerCase();
            }
        }
        System.out.println(result);
    }
}
