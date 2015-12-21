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
		m_songName = songName;
	}
	public void setRanking(int ranking)
	{
		m_ranking = ranking;
	}
	
	public void setArtist(String artist)
	{
		m_artist = artist;
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