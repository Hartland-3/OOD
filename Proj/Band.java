import java.util.ArrayList;
import java.util.List;
public class Band{
	String name;
	String Location;
	List<Musician> members;
	List<String> OpenPositions;
	public Band(String name, String Location, List<Musician> members, List<String> openPositions){
		this.name = name;
		this.Location = Location;
		this.members = members;
		this.OpenPositions = openPositions;
	}
	public String toString(){
		Musician mem = this.members.get(0);
		return("Hi I am " + mem.name +" I am in the band " + this.name);
	}
	public static void main(String[] args) {
		List<Musician> mems = new ArrayList<Musician>();
		Musician me = new Musician("Hartland", "Boulder, CO", "I'm awesome", "Bass");
		mems.add(me);
		Band BSL = new Band("Boulder Sound Lab", "Boulder", mems, null);
		System.out.println(BSL.toString());

	}
}