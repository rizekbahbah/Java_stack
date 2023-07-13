public class Phone extends Device{
    public void makeCall(){
        System.out.println("You make a phone call.");
        battery -= 8;
        status();
    }

    public void playGame(){
        System.out.println("You play a game.");
        battery -= 10;
        status();
    }

    public void charge(){
        System.out.println("You charge your phone.");
        battery += 40;
        status();
    }
}