import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// ASCII코드 적극활용하기

public class Q_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputFirst = br.readLine().toCharArray();
        char[] inputSecond = br.readLine().toCharArray();
        String isInTheStr = "";

        // 겹치는 부분 찾기
        loop1: for(int i=0; i<inputFirst.length; i++){
            loop2: for(int j=0; j<inputSecond.length; j++){
                if(inputFirst[i] == inputSecond[j]){

                    isInTheStr += String.valueOf(inputFirst[i]);
                    inputSecond[j] = '0';
                    break loop2;
                }
            }
        }
        System.out.println(inputFirst.length+inputSecond.length-2*isInTheStr.length());

    }
}
