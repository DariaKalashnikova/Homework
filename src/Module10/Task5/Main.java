package Module10.Task5;


public class Main {

    public static void main(String[] args) {
        UsageOfExceptions usageOfExceptions = new UsageOfExceptions();
        try {
            usageOfExceptions.shelter("Kitten");
        } catch (Exception first) {
            first.toString();
        }
        try {
            usageOfExceptions.shelter("Dog");
        }catch (Exception second){
            second.toString();
        }
    }
}
