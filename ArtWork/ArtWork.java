public class ArtWork {
	private String title;
	private String artist;
	private int year;
	
	public ArtWork() {
		title = "";
		artist = "";
		year = 0;
	}
	public void setInfo(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	public String toString() {
		return "Art: " + title + "\nArtist: " + artist + "\nYear: " + year + "\n";
	}
}
