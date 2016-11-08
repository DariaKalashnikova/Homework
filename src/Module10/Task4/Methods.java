package Module10.Task4;


public class Methods {

    static void g()throws Exception {
        String cat;
        cat = "Donkey";
        if (cat.endsWith("y"))throw new Exception("Unknown breed");
    }

    static void f(){
        try {
            g();
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Mixing impossible");
        }
    }
}
