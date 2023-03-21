public class Music {
    private String author;
    private String song;

    Music(String author, String song){
        this.author = author;
        this.song = song;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAuthor() {
        return author;
    }

    public String getSong() {
        return song;
    }
}
