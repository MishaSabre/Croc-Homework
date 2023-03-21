/*
Just abstract parent class for other music carrier
 */

public abstract class MusicCarrier {
    Music music;

    MusicCarrier(){}

    MusicCarrier(Music music){
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
