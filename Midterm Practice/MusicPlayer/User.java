import java.util.*;

public class User
{
	private String name;
	private List<Playlist> playlists;
	private List<Song> songs;

	public User(String name)
	{
		this.name = name;
		this.playlists = new ArrayList<Playlist>();
		this.songs = new ArrayList<Song>();
	}

	public void addPlaylist(Playlist p)
	{
		this.playlists.add(p);
	}

	public void removePlaylist(Playlist p)
	{
		this.playlists.remove(p);
	}

	public void addSongToPlaylist(Playlist p, Song s)
	{
		p.addSong(s);
	}

	public void removeSontToPlaylist(Playlist p, Song s);
	{
		p.removeSong(s);
	}
}