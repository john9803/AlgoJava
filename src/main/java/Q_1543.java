import java.util.Scanner;

public class Q_1543 {
    public static void main(String[] args){
//        mySolution();
        masterSolution();
    }
    public static void mySolution(){
        Scanner sc = new Scanner(System.in);
        String searchStr = sc.nextLine();
        String keywordStr = sc.nextLine();

        int emergeIdx = 0;

        for(int i=0; i<=searchStr.length()-keywordStr.length(); i++){
            String tempSearch = searchStr.substring(i, i+keywordStr.length());
            if(tempSearch.equals(keywordStr)){
                i+=keywordStr.length()-1;
                emergeIdx+=1;
            }

        }
        System.out.println(emergeIdx);
    }
    public static void masterSolution(){
        Scanner sc = new Scanner(System.in);
        String searchStr = sc.nextLine();
        String keywordStr = sc.nextLine();

        int emergeIdx = 0;
        int currentIndex = 0;

        while(currentIndex<=(searchStr.length()-keywordStr.length())){
            int searchedIndex = searchStr.indexOf(keywordStr,currentIndex);
            if(searchedIndex>=0){
                emergeIdx += 1;
                currentIndex =  (searchedIndex + keywordStr.length());
            }
            else{
                currentIndex+=1;
            }

        }
        System.out.println(emergeIdx);
    }
}
