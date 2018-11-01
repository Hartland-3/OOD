public class Song implements Player{
	String Name;
	String Path;
	public Song(String name, String path){
		this.Name = name;
		this.Path = path;
	}
	public static void main(String[] args) {
		Song meh = new Song("Thang","Is here");
		meh.Play(meh.Path);
	}
}