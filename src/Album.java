import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean findSong(String title)
    {
        for(Song s:songs)
        {
            if(s.getTitle().equals(title))
                return true;
        }
        return false;
    }
    public void addSongtoAlbum(String title,double duration)
    {
        Song s=new Song(title,duration);

        if(findSong(s.getTitle())==true)
        {
            System.out.println("song all ready present");
        }
        else {
            songs.add(s);
            System.out.println("New song has been added");
        }
    }

    public void addToPlaylistFromAlbum(String title, LinkedList<Song> playlist)
    {
if(findSong(title)==true)
{
    for(Song song:songs)
    {
        if(song.getTitle().equals(title))
        {
            playlist.add(song);
            System.out.println("song has been added to playlist");
            break;
        }
    }
}
else {
    System.out.println(" song not present in album");
}
    }
    public void addToPlaylistFromAlbum(int tracNo,LinkedList<Song> playlist)
    {
        int index=tracNo-1;
        if(index>=0&&index<songs.size())
        {
            System.out.println("Songs has been added to playlist");
            playlist.add(songs.get(index));
        }
        else {
            System.out.println("Invalid track number");
        }
        return;
    }

//    public void deleteFromAlbum(int tracNo,LinkedList<Song> playlist)
//    {
//        int index=tracNo-1;
//        if(index>=0&&index<songs.size())
//        {
//            System.out.println("Songs has been deleted to playlist");
//            playlist.remove(songs.get(index));
//        }
//        else {
//            System.out.println("Invalid track number");
//        }
//        return;
//    }


    public void deleteSongFromAlbum(String title,double duration)
    {
        Song s=new Song(title,duration);

        if(findSong(s.getTitle())==true)
        {
            System.out.println("song has been deleted");
            songs.remove(s);
        }
        else {
            System.out.println("song is allready not present in album");
        }
    }

}
