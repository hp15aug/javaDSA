import java.util.*;

public class TempTest {

    public static void main(String[] args) {

        List<List<String>> songs = new ArrayList<>();

        // Ed Sheeran - highest priority
        songs.add(Arrays.asList("Perfect", "Ed Sheeran"));
        songs.add(Arrays.asList("Bad Habits", "Ed Sheeran"));
        songs.add(Arrays.asList("Shape of You", "Ed Sheeran"));
        songs.add(Arrays.asList("Photograph", "Ed Sheeran"));

        // Taylor Swift
        songs.add(Arrays.asList("Blank Space", "Taylor Swift"));

        // The Weeknd
        songs.add(Arrays.asList("Blinding Lights", "The Weeknd"));

        List<List<String>> result = shuffle(songs);

        for (List<String> song : result) {
            System.out.println(song.get(0) + " - " + song.get(1));
        }
    }

    public static List<List<String>> shuffle(List<List<String>> songs) {

        // YOUR CODE HERE
        List<List<String>> ans=new ArrayList<>();

        Map<String, Queue<List<String>>> hm=new LinkedHashMap<>();

        for(List<String> song: songs){
            String artist=song.get(1);

            hm.putIfAbsent(artist, new LinkedList<>());
            hm.get(artist).add(song);
        }

        List<String> artists = new ArrayList<>(hm.keySet());
        System.out.println("***");
        System.out.println(artists);

        while(ans.size() < songs.size()){
            String currArtist=null;
            for(String artist: artists){

            }
        }


        return null;
    }
}