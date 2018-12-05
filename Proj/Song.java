/**This class is used to reference a song, it contains the song name, and classpath*/
public class Song implements Player{
	String Name;
	String Path;
	public Song(String name, String path){
		this.Name = name;
		this.Path = path;
	}
}