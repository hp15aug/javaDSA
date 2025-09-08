// User function Template for Java
import java.util.*;
class Test {
    public static int findMinDiff(List<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        System.out.println(arr);
        int l=0;
        int r=m;

        int min=Integer.MAX_VALUE;

        while(r< arr.size()-1){
            min=Math.min(min, arr.get(r) - arr.get(l));
            r++;
            l++;
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12);
        System.out.println(findMinDiff(list, 5));
    }
}