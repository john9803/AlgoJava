import java.util.Scanner;

public class Q_13223 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String addTime = sc.nextLine();

        int convertedTime =  convertTime(time);
        int convertedAddTime = convertTime(addTime);

        int calculateTime = convertedAddTime-convertedTime;

        if(calculateTime<=0){
            calculateTime += 3600*24;
        }

        restoreTime(calculateTime);
    }

    public static int convertTime(String time){
        int hour = Integer.parseInt(time.substring(0,2));
        int min = Integer.parseInt(time.substring(3,5));
        int sec = Integer.parseInt(time.substring(6,8));

//        System.out.println("hour:"+hour+","+"min:"+min+","+"min:"+sec);

        return ((hour)*3600 + min*60 + sec);
    }

    public static void restoreTime(int time){
        int convertedHour = 0;
        int convertedMin = 0;
        int convertedSec = 0;

        convertedHour = time/3600;
        convertedMin = (time - convertedHour*3600)/60;
        convertedSec = time - convertedHour*3600 - convertedMin*60;

        String strHour = String.valueOf(convertedHour);
        String strMin = String.valueOf(convertedMin);
        String strSec = String.valueOf(convertedSec);

        if(strHour.length()<2){
            strHour = "0"+strHour;
        }
        if(strMin.length()<2){
            strMin = "0"+strMin;
        }
        if(strSec.length()<2){
            strSec = "0"+strSec;
        }

//        System.out.println(String.format("hour:%H,"+"min:"+convertedMin+","+"min:"+convertedSec));
         System.out.println(strHour+":"+strMin+":"+strSec);
    }
}
