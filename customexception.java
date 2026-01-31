class NamemismatchException extends Exception {
    public NamemismatchException(String message){
        super(message);
    }
}

public class customexception {
    public static void nameperson(String name) throws NamemismatchException{
        if(!name.equalsIgnoreCase("Darshan")){
            throw new NamemismatchException("Name must be darshan");
        }
        System.out.println("Welcome");
    }
    public static void main(String[] args)  {
        try{    
            nameperson("darsha");
        }
        catch(NamemismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
