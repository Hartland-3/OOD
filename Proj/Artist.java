import java.util.ArrayList;
import java.util.List;
/**This is the main class used to build profiles, it allows an artist or band or producer
to add their name, location, bio, songs, and albums*/
public abstract class Artist{
	String name;
	String Location;
	String Bio;
	List<Song> Songs;
	List<Album> Albums;
	public Artist(String name, String Location, String Bio,List<Song> Songs,List<Album> Albums){
	this.name = name;
	this.Location = Location;
	this.Bio = Bio;
	this.Songs = Songs;
	this.Albums = Albums;
	}
}