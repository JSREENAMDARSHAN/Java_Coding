

class dog implements Innersampleinterface{
    @Override
    public void makeSound(){
        System.out.println("Dogs bark");
    }
}
public class sampleinterface {
    public static void main(String[] args){
        Innersampleinterface dg = new dog();
        dg.makeSound();
    }
}
