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
/**this controller is used by guiTwo to help create the band view, it listens for the button clicks and performs the required action*/
public class guiTwoController implements ActionListener{
	private AudioStream audio;
	private Band band;
	public guiTwoController(Band _band){
		band = _band;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
		String[] split = action.split("\\s+");
		if(split[0].equals("Play")){
			for(Song song : band.Songs){
				if(song.Name.contains(split[1])){
					try{
						InputStream music = new FileInputStream(new File(song.Path));
		        		audio = new AudioStream(music);
		        		song.play(audio);
	        		}
	        		catch(Exception e)
	    			{
	        			JOptionPane.showMessageDialog(null,"Error");
	    			}
				}
			}
		}
		else if (split[0].equals("Artist")) {
			for (Artist artist : band.members) {
				String[] n = artist.name.split("\\s+");
				System.out.println(n[0]);
				if(n[0].equals(split[1])){
					System.out.println(split[1]);
					guiOne profile = new guiOne(artist);
				}
			}
		}
		else if (split[0].equals("Stop")) {
			System.out.println(split[0]);
			AudioPlayer.player.stop(audio);
		}
		
	}
}