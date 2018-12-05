import java.util.ArrayList;
import java.util.List;
/**This class creates albums, it uses a name of the album and a list of songs*/
public class Album{
	String Name;
	List<Song> Songs;
	public Album(String Name, List<Song> Songs){
		this.Name = Name;
		this.Songs = Songs;
	}
}