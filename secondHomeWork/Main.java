/**
 * That program model of some music players.
 * There are several sound reproducing devices (vinyl player, CD, universal player, etc.)
 * There are several carriers of musical compositions (vinyl record, CD, flash drive, etc.)
 * There are several songs that have the name of the artist (band) and the name
 * The sound reproducing device should output information to the console about what kind of device is playing the song, its artist and name.
 * If the device cannot play music from the required media, display the appropriate message
 *
 * @author MishaSabre (Sablin Mikhail)
 */

public class Main {

    public static void main(String[] args) {


        Music one = new Music("Bruce Springsteen", "Born to run");
        Music two = new Music("Horus", "Eritrea");
        Music three = new Music("Yelawolf", "Till It's Gone");

        VinylRecord vr = new VinylRecord(one);
        Disk disk = new Disk(two);
        FlashDrive fd = new FlashDrive(three);

        VinylPlayer vp = new VinylPlayer();
        CdPlayer cdp = new CdPlayer();
        SuperPlayer sp = new SuperPlayer();

        vp.playMusic(vr);
        vp.playMusic(disk);

        cdp.playMusic(disk);
        cdp.playMusic(fd);

        sp.playMusic(fd);
        sp.playMusic(vr);

    }

}
