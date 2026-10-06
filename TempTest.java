import java.util.*;

public class TempTest {

    public static void main(String[] args) {

        int[] nums ={2,-1,2};
        int k=3;
        System.out.println(shortestSubarray(nums, k));                                                                           
    }

    public static List<List<String>> shuffle(List<List<String>> songs) {

        // YOUR CODE HERE
        List<List<String>> ans = new ArrayList<>();

        Map<String, Queue<List<String>>> hm = new LinkedHashMap<>();

        for (List<String> song : songs) {
            String artist = song.get(1);

            hm.putIfAbsent(artist, new LinkedList<>());
            hm.get(artist).add(song);
        }

        List<String> artists = new ArrayList<>(hm.keySet());
        System.out.println("***");
        System.out.println(artists);

        while (ans.size() < songs.size()) {
            String currArtist = null;
            for (String artist : artists) {

            }
        }

        return null;
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int max = 0;

        while (r < s.length()) {

            while (set.contains(s.charAt(r))) {
                l++;
            }

            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }

    public static int shortestSubarray(int[] nums, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        int n=nums.length;

        long[] pre=new long[n+1];
        for(int i=0; i<n; i++){
            pre[i+1]=pre[i]+nums[i];
        }

        int min=Integer.MAX_VALUE;

        for(int i=0; i<=n; i++){
            while(!q.isEmpty() && pre[i] - pre[q.peekFirst()] >= k){
                min=Math.min(min, i- q.pollFirst());
            }

            while(!q.isEmpty() && pre[i] <= pre[q.peekLast()]){
                q.pollLast();
            }

            q.addLast(i);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}