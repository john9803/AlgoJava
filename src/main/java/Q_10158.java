import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.BindException;
import java.util.Scanner;

public class Q_10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 전체 공간 크기입력받기
        String[] wandh = bf.readLine().split(" ");
        int w = Integer.parseInt(wandh[0]);
        int h = Integer.parseInt(wandh[1]);

        // 초기 좌표 입력받기
        String[] pandq = bf.readLine().split(" ");
        int p = Integer.parseInt(pandq[0]);
        int q = Integer.parseInt(pandq[1]);

        // 총 이동하는 시간 (*n 하게되는 수)
        int t = Integer.parseUnsignedInt(bf.readLine());

        // 연산자
        int currentX = (t+p)%(2*w);
        int currentY = (t+q)%(2*h);

//        System.out.println("p: "+p+", q: "+q +", currentX : "+currentX+", currentY: "+currentY);

        // 시간당 이동연산-> 하면 시간초과 나니깐 아예 규칙성으로 연산수 줄여버리기
        if(currentX > w){
            currentX=w-currentX%w;
        }
        if(currentY > h){
            currentY=h-currentY%h;
        }


//        System.out.println("p: "+p+", q: "+q +", currentX : "+currentX+", currentY: "+currentY);


        // 출력값
        System.out.println(currentX+" "+currentY);
    }
}
