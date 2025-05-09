package InterfacesEx.multipleInheritance;

public class smartphone implements MusicPlayer , Phone {



    @Override
    public void endcall() {
        System.out.println("this is end call");
        
    }

    @Override
    public void playMusic() {
        System.out.println("this is play music");
        
    }

    @Override
    public void stopmusic() {
        
        System.out.println("this is stop music ");
    }

    @Override
    public void makeCall(int num) {
        
       System.out.println("this is make call");
    }

}
