public class CdPlayer extends Player{

    CdPlayer(){
        model = "CD Player";
    }

    @Override
    public void playMusic(Object object){

        if (object instanceof Disk){
            System.out.println(model + ", Author: " + ((Disk) object).getMusic().getAuthor()
                    + ", Name of song: " + ((Disk) object).getMusic().getSong() );
        }else{
            System.out.println("Incorrect type of Music Carrier");
        }

    }
}
