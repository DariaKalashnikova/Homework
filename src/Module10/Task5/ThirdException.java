package Module10.Task5;


public class ThirdException extends Exception{

    public ThirdException(String dog){
        super(dog);
        System.out.println("These hoomans now have a dog too");
    }
}
