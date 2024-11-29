import java.util.Arrays;
import java.util.Scanner;

// TODO 나중에 제대로된 로직으로 수정하기

public class Q_1236 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] inputs  = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[] rowCountX = new int[N];
        int[] colCountX = new int[M];


//        System.out.println("N: "+N+", M: "+M);

        int rowZeroCnt = 0;
        int colZeroCnt = 0;
        int rowOverZeroCnt = 0;

        for(int i =0; i<N; i++){
            String row = sc.nextLine();

            // row check
//            System.out.println("\nX contain: " +row.contains("X")+", row: "+row+", row_index: "+row.indexOf("X"));
            if(row.contains("X")){
                rowCountX[i]++;
            }
//            System.out.println(row +"row_size : "+ row.length());
            for(int j=0; j<row.length(); j++){
                // column check
                if(String.valueOf(row.charAt(j)).equals("X")){
                    colCountX[j]++;
                }
            }
        }
        for(int row: rowCountX){
            if(row==0){
                rowZeroCnt+=1;
            }else{
                rowOverZeroCnt +=1;
            }
        }
        for(int col: colCountX){
            if(col==0){
                colZeroCnt +=1;
            }
        }

        if(rowZeroCnt<colZeroCnt){
            for(int col: colCountX){
                if(col==0){
                    rowZeroCnt +=(colZeroCnt-rowZeroCnt);
                }
            }
        }

//        System.out.println("row: "+Arrays.toString(rowCountX)+", col: "+Arrays.toString(colCountX));
        System.out.println(rowZeroCnt);
    }
}
