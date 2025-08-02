import java.util.*;

class Test{
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(subarraySum(arr, 3));
    }
    public static int subarraySum(int[] arr, int k) {
        int sum=0;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == k) {
                    c++;
                }
            }
        }
        return c;
    }
}