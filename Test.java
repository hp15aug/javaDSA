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
    public static int[] f(int[] arr) {
        int mul=1;
        int mul_zero=1;
        int count=0;

        for(int num: arr){
            if(num != 0)
                mul_zero*=num;
            count++;
            mul*=num;
        }
        int[] ans=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(mul == 0){
                if(arr[i] == 0 && count == 1)
                    ans[i]=mul_zero;
                else
                    ans[i]=0;
            }else{
                ans[i]=mul/arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ans=join(s);
        int l=0; int r=ans.length()-1;
        while(l<r){
            if(ans.charAt(l) != ans.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    private static String join(String s){
        String ans="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
        return ans;
    }
    private static int minSubArrayLen(int target, int[] nums) {

        int sum=0;
        int l=0;
        int r=0;
        int min=nums.length;

        while (r < nums.length) {

            if (sum < target) {
                sum += nums[r];
                r++;
            } else if (sum > target) {
                sum -= nums[l];
                l++;
            } else { // sum == target
                min = Math.min(min, r - l + 1);
                sum+=nums[r];
                r++;
            }
        }
        return min;
    }

    private static int triangularSum(int [] arr){
        int n=arr.length;
        int x=f(arr, n );
        return x;
    }
    private static int f(int[] arr, int n){
        if(n == 1)
            return arr[0];

        for(int i=0; i<n-1; i++){
            arr[i] = (arr[i]+arr[i+1])%10;
        }
        System.out.println(Arrays.toString(arr));
        return f(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr={5, 4, 3, 2, 1};
        System.out.println(triangularSum(arr));
    }
}