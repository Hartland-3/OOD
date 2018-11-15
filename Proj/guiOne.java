import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class guiOne extends JFrame{
    
    private JLabel Name;
	private JLabel Bio;
	private JLabel Instruments;
	private JButton allSongs;
	private JButton searchB;
	private JTextField search;
	private int x;
	private int y;
	public guiOne(Musician musician){
		x=0;
		y=0;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Profile Page");
		JPanel layout = new JPanel (new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		Name = new JLabel("Name: "+musician.name);
		c.gridy = y;
		c.gridx = x;
		y++;
		layout.add(Name,c);

		Bio = new JLabel("Bio: "+musician.Bio);
		c.gridy = y;
		y++;
		layout.add(Bio,c);

		Bio = new JLabel("These are my songs");
		c.gridy = y;
		y++;
		layout.add(Bio,c);
		for( Song song : musician.Songs){
			c.gridy = y;
			y++;
			allSongs = new JButton(song.Name);
			layout.add(allSongs,c);
		}
		Bio = new JLabel("These are my Albums");
		c.gridy = y;
		y++;
		layout.add(Bio,c);
		for(Album album : musician.Albums){
			Bio = new JLabel(album.Name+":");
			c.gridy = y;
			c.gridx = x;
			y++;
			layout.add(Bio,c);
			int temp = x + 1;
			for(Song song : album.Songs){
				c.gridx = temp;
				temp++;
				allSongs = new JButton(song.Name);
				layout.add(allSongs,c);
			}
		}

		search = new JTextField("Search for Band");
		c.gridy = y;
		c.gridx = x;
		layout.add(search,c);
		searchB = new JButton("Search");
		c.gridy = y;
		c.gridx = x+1;
		y++;
		layout.add(searchB,c);

		this.add(layout);
		this.pack();
	}
	public static void main(String[] args) {
		Song s1 = new Song("MyFirstSong","Path");
		Song s2 = new Song("MySecondSong","Path");
		Song s3 = new Song("MyThirdSong","Path");
		Song s4 = new Song("MyFourthSong","Path");
		List<Song> songs = new ArrayList<Song>();
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		Album a1 = new Album("MyFirstAlbum",songs);
		List<Album> albums = new ArrayList<Album>();
		albums.add(a1);
		Musician hart = new Musician("Hartland", "Boulder, CO", "I'm awesome", "Bass", songs, albums);
		guiOne profile = new guiOne(hart);
	}
}