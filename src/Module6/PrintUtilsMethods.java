package Module6;


public class PrintUtilsMethods {

    static void printMethods(User[] users) {
        User user = new User();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null || users[i].equals(user))
                continue;
            System.out.println(users[i]);
        }
    }

    static void printLongId(long[] userId) {
        for (int i = 0; i < userId.length; i++) {
            if (userId[i] != 0) {
                System.out.print(userId[i] + " , ");
            }
        }

    }
}
