import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q_3273 {
    public static void main(String[] args) throws IOException {
//        mySol();
//        gptSol();
        teacherSol();

    }
    public static void mySol() throws  IOException{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(bf.readLine());

//        String[] series = bf.readLine().split(" "); // old logic
            String series = bf.readLine(); //new

            int X = Integer.parseInt(bf.readLine());

            int numMatchCnt = 0;

            // 시간초과 로직

//        for(int i=0; i<series.length;i++){
//            for(int j=0; j<series.length;j++){
//                if(i>=j){continue;}
////                System.out.println("sum: "+(Integer.parseInt(series[i])+Integer.parseInt(series[j])));
//                if(Integer.parseInt(series[i])+Integer.parseInt(series[j]) == X){
//                    numMatchCnt++;
//                }
//
//            }
//
//        }
//        bw.write(String.valueOf(numMatchCnt));
//        bw.flush();


//        System.out.println(numMatchCnt);

            // new logic


            int[] intlizedSeries = new int[N];
            String[] seriesArr = series.split(" ");

            for(int i=0;i<intlizedSeries.length;i++){
                intlizedSeries[i] = Integer.parseInt(seriesArr[i]);
            }


            Arrays.sort(intlizedSeries);
            int maxNum = intlizedSeries[N-1];

            int[] numCnt = new int[X];

            System.out.println("maxNum: "+maxNum);

            for(int i =0;i<intlizedSeries.length;i++){
                for(int k =0;k<maxNum;k++){
                    if(k == intlizedSeries[i]){
                        numCnt[k]++;
                    }
                }
            }

            System.out.println("numCnt: "+ Arrays.toString(numCnt));


            for(int k =0;k<X;k++){
                int i = 1+k;
                int j = X-1-k;


                if(i>=j){continue;}

                System.out.println("series" +series);
                System.out.println("i: "+i+", j: "+j+", i+j: "+(i+j));

                if(series.contains(String.valueOf(i))&&series.contains(String.valueOf(j))){
                    System.out.println("i is present? -> "+ series.contains(String.valueOf(i))+ "j is present? ->" + series.contains(String.valueOf(j)));
                    System.out.println("numMatchCnt: "+numMatchCnt);
                    numMatchCnt += (numCnt[i]+numCnt[j]);
                }
            }
            bw.write(String.valueOf(numMatchCnt));
            bw.flush();
    }

    public static void gptSol() throws  IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        String series = bf.readLine();
        int X = Integer.parseInt(bf.readLine());

        int[] intlizedSeries = new int[N];
        String[] seriesArr = series.split(" ");

        // 입력 배열을 정수 배열로 변환
        for(int i = 0; i < N; i++) {
            intlizedSeries[i] = Integer.parseInt(seriesArr[i]);
        }

        Arrays.sort(intlizedSeries);

        // 투 포인터 사용
        int left = 0;
        int right = N - 1;
        int numMatchCnt = 0;

        while(left < right) {
            int sum = intlizedSeries[left] + intlizedSeries[right];

            if(sum == X) {
                numMatchCnt++;
                left++;
                right--;
            }
            else if(sum < X) {
                left++;
            }
            else {
                right--;
            }
        }

        bw.write(String.valueOf(numMatchCnt));
        bw.flush();
    }

    public static void teacherSol() throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a= new int[N];
        for(int i=0;i <N; i++){
            a[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for (int i=0;i < N; i++){
            exist[a[i]] = true;
        }

        int ans = 0;
//        for(int i =0; i< N; i++){
//            int pairValue = X-a[i];
//            if(0 <= pairValue && pairValue <= 1000000){
//                ans += exist[pairValue] ? 1:0;
//            }
//        }
//        System.out.println(ans/2);

        // 다른방식
        for (int i=1; i<=(X-1)/2; i++){
            if (i <= 1000000 && X-i <= 1000000){
                ans += (exist[i] && exist[X-i]) ? 1:0;
            }
        }

        System.out.println(ans);


    }
}
