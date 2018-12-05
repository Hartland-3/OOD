import java.util.ArrayList;
import java.util.List;
/**Extends the artist class with the added feature of specifiying an instrument*/
public class Musician extends Artist{
	String Instrument;

	public Musician(String name,String Location, String Bio, String Instrument,List<Song> Songs,List<Album> Albums){
		super(name,Location,Bio,Songs,Albums);
		this.Instrument = Instrument;
	}
}