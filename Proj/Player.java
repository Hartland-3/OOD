import java.util.ArrayList;
import java.util.List;
public interface Player{

	public default void Play(String path){
		System.out.println("Play "+ path);
	}
	public default void PlayA(List<Song> songs){
		// System.out.println("Play "+ path);
		for (int i = 0; i < songs.size() ; i++) {
			Song song = songs.get(i);
			System.out.println("Play "+ song.Path);
		}
	}
}