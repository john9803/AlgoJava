// 3의 배수확인 기능
// 5의 배수확인 기능
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q_28702 {
    public static void main(String[] args) throws Exception{

        discriminateNum(getNextInt());
    }

    public static int getNextInt() throws IOException {
        int nextInt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<3; i++){
            String input = br.readLine();

            if(input.equals("Fizz")||input.equals("Buzz")||input.equals("FizzBuzz")){
                continue;
            }
            else{
            nextInt = Integer.parseInt(input)+(2 - i);
            }
        }
        return nextInt;
    }

    public static void discriminateNum(int input) throws IOException {

        byte typeNum = 0;
        boolean isMultipleOfThree = verifyMultiple(input, 2);
        boolean isMultipleOfFive =  verifyMultiple(input, 5);

        if((isMultipleOfThree)&&(isMultipleOfFive)){
            typeNum = 0;
        }
        if((isMultipleOfThree)&&(!isMultipleOfFive)){
            typeNum = 1;
        }
        if((!isMultipleOfThree)&&(isMultipleOfFive)){
            typeNum = 2;
        }
        if((!isMultipleOfThree)&&(!isMultipleOfFive)){
            typeNum = 3;
        }
        printNum(typeNum,input);
    }

    public static boolean  verifyMultiple(int input, int divideNum){
        boolean isMultiple = false;
        if(input%divideNum==0){
            isMultiple = true;
        }
        return isMultiple;
    }

    public static void printNum(byte typeNum, int input) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        switch(typeNum){
            case 0: bw.write("FizzBuzz");
                break;
            case 1: bw.write("Fizz");
                break;
            case 2: bw.write("Buzz");
                break;
            case 3: bw.write(String.valueOf(input));
                break;
        }
    }
}