import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WeakPasswords {
    public static void main(String[] args) {
String[] words = {"hello123", "admin@123", "welcome2026", "securePass1", "mytest123", "random#789"};
String[] commonWord = {"hello","admin","welcome","test"};

        String[] ans = f(words, commonWord);
        System.out.println(Arrays.toString(ans));
    }
    private static String[] f(String[] arr, String[] common){
        String[] res = new String[arr.length];
        Set<String> set = new HashSet<>(Arrays.asList(common));

        for (int i = 0; i < res.length; i++) {
            if(isStrong(arr[i], set)){
                res[i]="strong";
            }else{
                res[i]="weak";
            }
        }

        return res;
    }
    private static boolean isStrong(String password, Set<String> set){
        if(password.length() < 6){
            return false;
        }

        int isCapital = 0;
        int isSmall = 0;
        int isNumber = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(ch>= 'a' && ch<= 'z'){
                isSmall++;
            }else if(ch>='A' && ch<='Z'){
                isCapital++;
            }else if(ch>='0' && ch<='9'){ 
                isNumber++;
            }
        }
        if(isSmall == password.length() || isCapital==password.length() || isNumber==password.length()){
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            for (int j = i+1; j <= password.length(); j++) {
                if(set.contains(password.substring(i,j))){
                    return false;
                }
            }
        }
        return true;
    }
}
