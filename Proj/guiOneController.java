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
/**this controller is used by guiOne to help create the artist view, it listens for the button clicks and performs the required action*/
public class guiOneController implements ActionListener{
	private AudioStream audio;
	private Artist artist;
	public guiOneController(Artist _artist){
		artist = _artist;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
		String[] split = action.split("\\s+");
		if(split[0].equals("Play")){
			for(Song song : artist.Songs){
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
		else if (split[0].equals("Stop")) {
			AudioPlayer.player.stop(audio);
		}
	}
}