import java.util.*;

public class Playlist
{
	private String name;
	private List<Song> songs;

	public Playlist(String name)
	{
		this.name = name;
		this.songs = new ArrayList<Song>();
	}

	public void addSong(Song song)
	{
		this.songs.add(song);
	}

	public void removeSong(Song song)
	{
		this.songs.remove(song);
	}

	@Override
	public String toString()
	{
		return res +=  "\n"+ this.name + ": \n" + this.songs;
	}
}