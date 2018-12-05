import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/** This class is used to to play songs using the AudioPlayer class in java*/
public interface Player{


	public default void play(AudioStream audio)
	{
	    try
	    {
	        AudioPlayer.player.start(audio);


	    }
	    catch(Exception e)
	    {
	        JOptionPane.showMessageDialog(null,"Error");
	    }
	}
	public default void stop(AudioStream audio){
	    AudioPlayer.player.stop(audio);
	}
	  

}