package Module10.Task2;

public class Main {

    public static void main(String[] args) {
        try {
            hungryCatException("meow");
        } catch(SpecialException e) {
            e.toString();
        }
    }
    static void hungryCatException (String cat) throws SpecialException{
        if (cat.contains("meow"))
            throw new SpecialException("British");
    }
}
