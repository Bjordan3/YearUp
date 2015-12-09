
public class Song 
{
	private String m_songName = "";
	private int m_ranking = 0;
	private String m_artist = "";

	public Song(String songName, int ranking, String artist)
	{
		m_songName = songName;
		m_ranking = ranking;
		m_artist = artist;
	}
	
	public void setSongName(String songName)
	{
		songName = m_songName;
	}
	public void setRanking(int ranking)
	{
		ranking = m_ranking;
	}
	
	public void setArtist(String artist)
	{
		artist = m_artist;
	}
	
	public String getSongName()
	{
		return m_songName;
	}

	public int getRanking()
	{
		return m_ranking;
	}
	
	public String getArtist()
	{
		return m_artist;
	}
}