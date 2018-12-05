import java.util.ArrayList;
import java.util.List;
/**This class simply extends the artist class as there is no difference between it and a Producer*/
public class Producer extends Artist{
	public Producer(String name,String Location, String Bio,List<Song> Songs,List<Album> Albums){
		super(name,Location,Bio,Songs,Albums);
	}
}