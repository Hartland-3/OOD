import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class guiTwo extends JFrame{
    
    private JLabel Name;
	private JLabel Bio;
	private JLabel Instruments;
	private JButton memsBand;
	private JButton allSongs;
	private JButton searchB;
	private JTextField search;
	private int y;
	private int x;
	public guiTwo(Band band){
		x=0;
		y=0;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Profile Page");
		JPanel layout = new JPanel (new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		Name = new JLabel("Name: "+band.name);
		c.gridy = y;
		c.gridx = x;
		y++;
		layout.add(Name,c);

		Bio = new JLabel("Members of the band:");
		c.gridy = y;
		y++;
		layout.add(Bio,c);
		for(Musician member : band.members){
			memsBand = new JButton(member.name);
			c.gridy=y;
			y++;
			layout.add(memsBand,c);
		}

		Bio = new JLabel("These are our songs");
		c.gridy = y;
		y++;
		layout.add(Bio,c);
		for( Song song : band.Songs){
			c.gridy = y;
			y++;
			allSongs = new JButton(song.Name);
			layout.add(allSongs,c);
		}
		Bio = new JLabel("These are our Albums");
		c.gridy = y;
		y++;
		layout.add(Bio,c);
		for(Album album : band.Albums){
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
		search = new JTextField("Search for members");
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
		List<Musician> mems = new ArrayList<Musician>();
		mems.add(hart);
		Band bsl = new Band("Boulder Sound Lab", "Boulder", mems, null,songs,albums);
		guiTwo profile = new guiTwo(bsl);
	}
}