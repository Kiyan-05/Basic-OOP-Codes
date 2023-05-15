public class Song
{
	private String title;
	private String artist;
	private String album;
	private String genre;
	private int duration;

	public Song(String title, String artist, String album, String genre, int duration)
	{
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		int min = 1;
		if(duration > min)
			this.duration = duration;
		this.duration = min;
	}

	public String getTitle(){ return this.title;}
	public String getArtist(){ return this.artist;}
	public String getAlbum(){ return this.album;}
	public String getGenre(){ return this.genre;}
	public int getDuration(){ return this.duration;}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public void setAlbum(String album)
	{
		this.album = album;
	}

	public int setDuration(int duration)
	{
		int min = 1;
		if(duration > 1)
			min = duration;
		return min;
	}

	@Override
	public String toString()
	{
		String res = "\n" + this.title + " by " + this.artist + "| " +this.duration + "min(s) |" + "\nAlbum: " + this.album + "\tGenre: " + this.genre;
		return res;
	}
}