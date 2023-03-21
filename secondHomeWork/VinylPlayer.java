public class VinylPlayer extends Player{

    VinylPlayer(){
        model = "Vinyl Player";
    }

    @Override
    public void playMusic(Object object){

        if (object instanceof VinylRecord){
            System.out.println(model + ", Author: " + ((VinylRecord) object).getMusic().getAuthor()
                    + ", Name of song: " + ((VinylRecord) object).getMusic().getSong() );
        }else{
            System.out.println("Incorrect type of Music Carrier");
        }

    }
}
