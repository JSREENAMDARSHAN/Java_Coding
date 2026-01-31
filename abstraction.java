abstract class Tv{
    abstract void turnon();
    abstract void turnoff();
}
class TvRemote extends Tv{
    @Override
    void turnon(){
        System.out.println("Turning on the tv");
    }

    @Override
    void turnoff(){
        System.out.println("Turning off the tv");
    }

}
public class abstraction {
    public static void main(String[] args) {
        TvRemote ob = new TvRemote();
        ob.turnon();;
        ob.turnoff();
    }
}
