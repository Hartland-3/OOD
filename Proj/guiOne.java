import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
This class is used to create the Artist view, where a single artist can be viewed.
It is, in this implementation, only accessed through the Band View, it populates the view
with the artist, his name, his bio, and his songs as well as albums*/
public class guiOne extends JFrame{
    
    private JLabel Name;
	private JLabel Bio;
	private JLabel Instruments;
	private JButton allSongs;
	private JButton searchB;
	private JTextField search;
	private int x;
	private int y;
	private Artist artist;
	public guiOne(Artist musician){
		x=0;
		y=0;
		artist = musician;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Profile Page");
		JPanel layout = new JPanel (new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		guiOneController controller = new guiOneController(artist);
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
			allSongs.addActionListener(controller);
			allSongs.setActionCommand("Play "+song.Name);
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
				allSongs.addActionListener(controller);
				allSongs.setActionCommand("Play "+song.Name);
				layout.add(allSongs,c);
			}
		}


		searchB = new JButton("Stop Player");
		c.gridy = y;
		c.gridx = x;
		y++;
		searchB.addActionListener(controller);
		searchB.setActionCommand("Stop");
		layout.add(searchB,c);

		this.add(layout);
		this.pack();
	}
}