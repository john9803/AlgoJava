import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        BigInteger factorialedNum = factorialFunc(n);

//        System.out.print("factorialedNum : " + factorialedNum + "str" + String.valueOf(factorialedNum));

        countZero(String.valueOf(factorialedNum));
    }

    private static BigInteger factorialFunc(int n){
        BigInteger result = new BigInteger("1");

        while(n!=0){
            result = result.multiply(BigInteger.valueOf(n));
            n -= 1;
        }
        return result;
    }

    private static void countZero(String factorialedStr){
        int collectedZeroCnt = 0;

        for(int i=1 ; i< factorialedStr.length(); i+=1  ){
            if (String.valueOf(factorialedStr.toCharArray()[factorialedStr.length()-i]).equals("0")){
                collectedZeroCnt+=1;
            }
            else{
                break;
            }
        }
        System.out.println(collectedZeroCnt);
    }

}
