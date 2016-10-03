package Module6;

public class UserUtils {

    User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[users.length];
        System.arraycopy(users, 0, uniqueUsers, 0, users.length);
        for (int i = 0; i < uniqueUsers.length; i++) {
            for (int k = 0; k < uniqueUsers.length; k++) {
                if (i == k) {
                    k++;
                }
                if (k == uniqueUsers.length)
                    break;
                if (uniqueUsers[i] == null || uniqueUsers[k] == null) {
                    continue;
                }
                if (uniqueUsers[i].equals(uniqueUsers[k])) {
                    uniqueUsers[k] = null;
                }
            }
        }

        return uniqueUsers;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] conditionalBalance = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                conditionalBalance[i]=users[i];
            }
        }
        return conditionalBalance;
    }

    final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }


    final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < usersId.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    User[] deleteEmptyUsers(User[] users) {
        User[] emptyUsers = new User[users.length];
        User empty = new User();
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(empty)) ;
            continue;
            emptyUsers[i]=users[i];
        }
        return emptyUsers;
    }
}
