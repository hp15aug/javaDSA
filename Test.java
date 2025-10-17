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

    public static String addBinary(String a, String b) { // 100  11

        int l=a.length()-1;  // 2
        int r=b.length()-1;  // 1

        if(r > l )
            return addBinary(b, a);

        StringBuilder sb=new StringBuilder();
        int s=0;
        int c=0;
        while(r>=0 && l>=0){
            char aa=a.charAt(l);
            char bb=b.charAt(r);

            if(aa == '0' && bb == '0') {
                sb.append(c);
                c=0;
            }

            else if(((aa == '0' && bb == '1') || (aa == '1' && bb == '0')) && c==0) {
                sb.append('1');
            }

            else if(((aa == '0' && bb == '1') || (aa == '1' && bb == '0'))){
                sb.append('0');
            }
            else if( aa == '1' && bb == '1' && c==0){
                sb.append('0');
                c=1;
            }
            else if( aa == '1' && bb == '1'){
                sb.append('1');
            }
            r--;
            l--;
        }
        while(l>=0){
            char aa=a.charAt(l);
            if(c==1 && aa=='1') {
                sb.append(0);
            }else if(c == 1 && aa == '0'){
                sb.append(1);
                c=0;
            }
            else if(c==0){
                sb.append(aa);
            }
            l--;
        }
        if(c == 1)
            sb.append(c);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }
}