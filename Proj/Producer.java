public class Producer extends Artist{
	public Producer(String name, String Location, String Bio){
		super(name,Location,Bio);
	}
	public String toString(){
		return("Hi I am " + this.name);
	}
	public static void main(String[] args) {
		Producer me = new Producer("Trat", "Somewhere", "So cool am I yes");
		System.out.println(me.toString());
	}
}