import java.util.ArrayList;
import java.util.List;
/**This class is used to run the app, it creates multiple types of artists, loads them into a band class, then launches the gui*/
public class bandly
{
	public static void main(String[] args) {
		String mPath =System.getProperty("user.dir") + "/music/"; 
		System.out.println(mPath);
		List<Song> deadSongs= new ArrayList<Song>();
		List<Song> jSongs = new ArrayList<Song>();
		// Song d1 = new Song("D1", mPath+"D1.wav");
		Song d2 = new Song("D2", mPath+"D2.wav");
		Song d3 = new Song("D3", mPath+"D3.wav");
		Song d4 = new Song("D4", mPath+"D4.wav");
		Song d5 = new Song("D5", mPath+"D5.wav");
		Song d6 = new Song("D6", mPath+"D6.wav");
		Song d7 = new Song("D7", mPath+"D7.wav");
		Song d8 = new Song("D8", mPath+"D8.wav");
		Song d9 = new Song("D9", mPath+"D9.wav");
		Song d10 = new Song("D10", mPath+"D10.wav");
		Song d11 = new Song("D11", mPath+"D11.wav");
		Song d12 = new Song("D12", mPath+"D12.wav");
		Song d13 = new Song("D13", mPath+"D13.wav");
		Song d14 = new Song("D14", mPath+"D14.wav");
		Song d15 = new Song("D15", mPath+"D15.wav");
		Song d16 = new Song("D16", mPath+"D16.wav");
		Song d17 = new Song("D17", mPath+"D17.wav");
		// deadSongs.add(d1);
		deadSongs.add(d2);
		deadSongs.add(d3);
		deadSongs.add(d4);
		deadSongs.add(d5);
		deadSongs.add(d6);
		deadSongs.add(d7);
		deadSongs.add(d8);
		deadSongs.add(d9);
		deadSongs.add(d10);
		deadSongs.add(d11);
		deadSongs.add(d12);
		deadSongs.add(d13);
		deadSongs.add(d14);
		deadSongs.add(d15);
		deadSongs.add(d16);
		deadSongs.add(d17);
		Album dAlbum = new Album("1965",deadSongs);
		Song n1 = new Song("N1", mPath+"N1.wav");
		Song n2 = new Song("N2", mPath+"N2.wav");
		jSongs.add(n1);
		jSongs.add(n2);
		Album jAlbum = new Album("Jerry", jSongs);
		List<Album> d = new ArrayList<Album>();
		List<Album> j = new ArrayList<Album>();
		j.add(jAlbum);
		d.add(dAlbum);
		List<Artist> dMems = new ArrayList<Artist>();
		Artist jerry = new Musician("Jerry Garcia", "Heaven", "I started the Grateful Dead","Guitar", jSongs, j); 
		dMems.add(jerry);
		Song s1 = new Song("S1", mPath+"S1.wav");
		Song s2 = new Song("S2", mPath+"S2.wav");
		Song s3 = new Song("S3", mPath+"S3.wav");
		Song s4 = new Song("S4", mPath+"S4.wav");
		Song s5 = new Song("S5", mPath+"S5.wav");
		List<Song> pSongs= new ArrayList<Song>();
		pSongs.add(s1);
		pSongs.add(s2);
		pSongs.add(s3);
		pSongs.add(s4);
		pSongs.add(s5);
		List<Album> p = new ArrayList<Album>();
		Album pAlbum = new Album("ProducerMan", pSongs);
		p.add(pAlbum);
		Artist pMan = new Producer("ProducerMan", "Wherever", "I produce music with the Dead yall", pSongs, p);
		dMems.add(pMan);
		Band dead = new Band("Grateful Dead", "We Play jam music yall", "USA", dMems, null, deadSongs, d);
		guiTwo profile = new guiTwo(dead);
	}


}