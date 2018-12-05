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
/**This is the band view, used to view a band, it is the main view in my
project. This view lists a bands members, which can be clicked on to access their profiles.
It also lists the bands songs, albums, name, location, and bio*/
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
	private Band _band;
	private AudioStream audio;
	public guiTwo(Band band){
		x=0;
		y=0;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Profile Page");
		_band=band;
		guiTwoController controller = new guiTwoController(_band);
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
		for(Artist member : band.members){
			memsBand = new JButton(member.name);
			memsBand.addActionListener(controller);
			memsBand.setActionCommand("Artist "+member.name);
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
			allSongs.addActionListener(controller);
			allSongs.setActionCommand("Play "+song.Name);
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