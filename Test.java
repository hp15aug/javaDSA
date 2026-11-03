import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
String[] words = {"hello123", "admin@123", "welcome2026", "securePass1", "mytest123", "random#789"};
String[] commonWord = {"hello","admin","welcome","test"};

        String[] ans = f(words, commonWord);
        System.out.println(Arrays.toString(ans));
    }
    private static String[] f(String[] words, String[] commonWords){
        String[] ans = new String[words.length];
        Set<String> set = new HashSet<>(Arrays.asList(commonWords));
        for (int i = 0; i < words.length; i++) {
            if(isStrong(words[i], set)){
                ans[i]="strong";
            }else{
                ans[i]="weak";
            }
        }
        return ans;
    }
    private static boolean isStrong(String word, Set<String> set){
        if(word.length() < 6)
            return false;

        int countCapital = 0;
        int countSmall = 0;
        int countNumber = 0;

        int n= word.length();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if( ch>='A' && ch<='Z'){
                countCapital++;
            }else if(ch>='a' && ch<='z'){
                countSmall++;
            }else{
                countNumber++;
            }
        }
        if(countCapital == n || countNumber == n || countSmall == n ){
            return false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if(set.contains(word.substring(i, j))){
                    return false;
                }
            }
        }
        return true;
    }
}