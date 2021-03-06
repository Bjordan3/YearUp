import java.util.*;

public class Playlist {
	static Scanner sc = new Scanner(System.in);
	static List<Song> Songs = new ArrayList<Song>();
	
	public static void main(String[] args)
	{
		InitializePlaylist();
		DisplayPlaylist();
	}

	public static void InitializePlaylist()
	{
		System.out.println("Enter song name or Q to quit.");
		String songName = sc.nextLine();
				while(!songName.equalsIgnoreCase("q"))
				{
					System.out.println("Song Rank?");
					int ranking = sc.nextInt();
					sc.nextLine();
					System.out.println("Artist Name?");
					String artist = sc.next();
					sc.nextLine();
					Song newSong = new Song(songName, ranking, artist);
					Songs.add(newSong);
					System.out.println("Enter song name or Q to quit");
					songName = sc.nextLine();
				}
	}
	public static void DisplayPlaylist()
	{
		for(int i = 0; i < Songs.size(); i++)
		{
			Song current = Songs.get(i);
			System.out.println("Song name: " + current.getSongName() + " Song Rank: " + current.getRanking() + " Artist: " + current.getArtist());
		}
	}
}
