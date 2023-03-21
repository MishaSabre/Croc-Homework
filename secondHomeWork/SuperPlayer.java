public class SuperPlayer extends Player{
    SuperPlayer(){
        model = "Universal Player";
    }

    @Override
    public void playMusic(Object object){

        if (object instanceof VinylRecord){
            System.out.println(model + ", Author: " + ((VinylRecord) object).getMusic().getAuthor()
                    + ", Name of song: " + ((VinylRecord) object).getMusic().getSong() );
        }else if (object instanceof Disk){
            System.out.println(model + ", Author: " + ((Disk) object).getMusic().getAuthor()
                    + ", Name of song: " + ((Disk) object).getMusic().getSong() );
        }else if (object instanceof FlashDrive){
            System.out.println(model + " Author: " + ((FlashDrive) object).getMusic().getAuthor()
                    + ", Name of song: " + ((FlashDrive) object).getMusic().getSong() );
        }else{
            System.out.println("Incorrect type of Music Carrier");
        }

    }
}
