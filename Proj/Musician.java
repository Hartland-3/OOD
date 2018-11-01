public class Musician extends Artist{
	String Instrument;

	public Musician(String name,String Location, String Bio, String Instrument){
		super(name,Location,Bio);
		this.Instrument = Instrument;
	}

	public String toString(){
		return("Hi I am " + this.name);
	}
	public static void main(String[] args) {
		Musician me = new Musician("Hartland", "Boulder, CO", "I'm awesome", "Bass");
		System.out.println(me.toString());
	}
}