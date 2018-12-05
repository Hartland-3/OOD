import java.util.ArrayList;
import java.util.List;
/**This class allows a band to be created with a list of members and open positions. 
It does this by using the composite design pattern to create a list of producers and musicians.*/
public class Band extends Artist{
	List<Artist> members;
	List<String> OpenPositions;
	public Band(String name, String Bio, String Location, List<Artist> members, List<String> openPositions,List<Song> Songs,List <Album> Albums){
		super(name,Location,Bio,Songs,Albums);
		this.members = members;
		this.OpenPositions = openPositions;
	}
}