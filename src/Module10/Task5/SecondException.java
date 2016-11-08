package Module10.Task5;


public class SecondException extends Exception {

    public SecondException (String kitten){
        super(kitten);
        System.out.println("Cat became mommy");
    }
}
