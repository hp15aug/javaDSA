import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt(); // Multiple test cases
        int[] arr=new int[t];
        int max=0;
        int min=1000;
        for (int i = 0; i < t; i++) {
            arr[i]=sc.nextInt();
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        int maxPos=-1;
        int minPos=-1;
        for (int i = 0; i < t; i++) {
            if(min == arr[i])   minPos=i;
        }
        for (int i = 0; i < t; i++) {
            if(max == arr[i]) {
                maxPos = i;
                break;
            }
        }

//        System.out.println(maxPos+" "+ minPos);

        if(maxPos > minPos){
            System.out.println(maxPos+ (t-1-minPos)-1);
        }else{
            System.out.println(maxPos+ (t-1-minPos));
        }

        sc.close();
    }
}