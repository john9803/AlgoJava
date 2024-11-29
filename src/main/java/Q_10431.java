import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Q_10431 {
    public static void main(String[] args){
//        mySol();
        teacherSol();

    }
//    public static void mySol(){
//        Scanner sc = new Scanner(System.in);
//
//        int P = Integer.parseInt(sc.nextLine());
//
//        // P 만큼 순회
//        for(int i=0; i<P;i++) {
//            String[] line = sc.nextLine().split(" ");
//
//            int testCaseCnt = Integer.parseInt(line[0]);
//
//            // 새로 서게될 줄
//            List<String> rightLine = new ArrayList<>();
//
//            // 뒤로 밀려난 횟수
//            int moveBackCnt = 0;
//
//            // 순서대로 학생검증
//            for (int l = 1; l < line.length; l++) {
//                int currentStudentH = Integer.parseInt(line[l]);
//
////                boolean isMaxOfRightLine = false;
//
//                int candIndex = 0;
//
//                if(rightLine.isEmpty()){
//                    rightLine.add(candIndex, line[l]);
//                }
//
//                for(String cand: rightLine){
//                    int candStudentH = Integer.parseInt(cand);
//                    if (candStudentH > currentStudentH) {
//                        rightLine.add(candIndex, line[l]);
//                        moveBackCnt += rightLine.size() - candIndex;
//                        break;
//                    } else {
//                        rightLine.addLast(line[l]);
//                    }
//                    candIndex++;
//                }
//                System.out.println("rightLine: " +rightLine);
//
//                // 줄서기
////                for (int r = 0; r < rightLine.size(); r++) {
////
////                }
//            }
//            System.out.println(testCaseCnt+" "+moveBackCnt);
//        }
//    }
    public static void teacherSol(){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while(P-- > 0 ){ // == for(int i =0; i<P; i++) 와 동일한 의미
            int T = sc.nextInt();
            int[] h = new int[20];
            for(int i =0; i<20; i++){
                h[i] = sc.nextInt();
            }
            int cnt = 0;
            int[] sorted = new int[20];
            for(int i=0; i <20; i++){
                // 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
                boolean find = false;
                for(int j=0; j < i; j++){
                    if(sorted[j] > h[i]) {
                        // 2. 찾았다면, 그 학생의 앞에 선다.
                        // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        find = true;
                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }
            if (!find) sorted[i] = h[i];
            }
            System.out.println(T+" "+cnt);
        }
    }
}
