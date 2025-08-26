import java.util.*;

class Test{
    public static void main(String[] args) {
        int n=3;
        System.out.println(getMin(n));
    }
    public static boolean lemonadeChange(int[] arr) {
        int five=0;
        int ten=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 5){
                five++;
            }else if(arr[i] == 10){
                if(five>0){
                    five--;
                    ten++;
                }else
                    return false;
            }else{
                if(five >= 3){
                    five=five-3;
                }else if(five >0 && ten >0){
                    five--; ten--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static int getMin(int n) {
        // code here
        int c=0; int x=n;
        c+=n/10;

        x = x % 10;

        if(x>=5){
            c+=1;
        }
        x-=5;

        if(x == 1 || x==2){
            c+=1;
        }else if( x == 3 || x==4){
            c+=2;
        }

        return c;
    }
}