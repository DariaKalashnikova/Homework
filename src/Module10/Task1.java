package Module10;

public class Task1 {

    public static void main(String[] args) throws Exception {

        Object o;
        Object o1;

        try {
            o = "Cat";
            o1 = null;
            o.toString();
            o1.toString();
        }catch (Exception e){
            System.out.println("Empty object");
        }finally {
            System.out.println("Done");
        }

    }
}
