import java.util.ArrayList;
import java.util.List;
public class Album implements Player{
	String Name;
	List<Song> Songs;
	public Album(String Name, List<Song> Songs){
		this.Name = Name;
		this.Songs = Songs;
	}
	public static void main(String[] args) {
		Song meh = new Song("Thang","Is here");
		Song meh1 = new Song("Thang","Is here1");
		Song meh2 = new Song("Thang","Is here2");
		Song meh3 = new Song("Thang","Is here3");
		List<Song> S = new ArrayList<Song>();
		S.add(meh);
		S.add(meh1);
		S.add(meh2);
		S.add(meh3);
		Album stang = new Album("Stuff", S);
		stang.PlayA(stang.Songs);
	}
}