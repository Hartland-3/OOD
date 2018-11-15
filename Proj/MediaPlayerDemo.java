import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class MediaPlayerDemo
{ 
  public static void main(String[] args) {
      String bip = "/home/hartland/Music/one.mp3";
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(MediaPlayerDemo.class.getResource(bip));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
  }
}