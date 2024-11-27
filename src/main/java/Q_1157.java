import java.util.Scanner;


public class Q_1157 {
    public static void main(String[] args){
        // ASCII 적극이용
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // 일괄 대문자처리

        int[] alphabets = new int[26];
        int maxValueCnt = 0;
        int maxIndex = 0;
        int maxValue = 0;

        // 글자별 개수 세기
        for(int i =0; i<str.length();i++){
            alphabets[str.charAt(i) - 'A']++;
        }

        // 가장 많은 수 뽑기
        for(int i=0; i< alphabets.length;i++){
            if(alphabets[i]> maxValue){
                maxValue = alphabets[i];
                maxIndex = i;
            }
        }

        for(int i=0; i<alphabets.length;i++){
            if(alphabets[i] == maxValue){
                maxValueCnt ++;
            }
        }

        if(maxValueCnt>1){
            System.out.println("?");
        }
        else{
            System.out.println((char)('A'+maxIndex));
        }

    }
}
