package Module10;


public class Task3 {

    public static void main(String[] args) {
        Object o = null;
        try {
            o.equals("Gun");
        }catch (Exception e){
            System.out.println("Bam-bam");
        }
    }
}
