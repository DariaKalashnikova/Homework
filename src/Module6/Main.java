package Module6;


public class Main {
    public static void main(String[] args) {

        User captainAmerica = new User(88, "Steve", "Rogers", 8000, 150000);
        User falcon = new User(177, "Jim", "Wilson", 7800, 44800);
        User wildCard = new User(177, "Jim", "Wilson", 7800, 44800);
        User blackWidow = new User(52, "Natalia", "Alianovna", 9800, 155897);
        User bucky = new User(1996, "Rick", "Jones", 8000, 150000);
        User nomad = new User(180, "Edward", "Ferbel", 10000, 235489);
        User sharonCarter = new User(13, "Sharon", "Carter", 18000, 10000000);
        User freeSpirit = new User(431, "Cathy", "Webster", 23000, 55555555);
        User jackFlag = new User(434, "Jack", "Harrison", 9980, 55577788);
        User shield = new User();

        User[] heroes = {captainAmerica, falcon, wildCard, blackWidow, bucky, nomad, sharonCarter, freeSpirit, jackFlag, shield};


        UserUtils methods = new UserUtils();

        System.out.println("Unique users: ");
        PrintUtilsMethods.printMethods(methods.uniqueUsers(heroes));
        System.out.println("Users with conditional balances: ");
        PrintUtilsMethods.printMethods(methods.usersWithContitionalBalance(heroes, 150000));
        System.out.println("Salary paid to heroes: ");
        PrintUtilsMethods.printMethods(methods.paySalaryToUsers(heroes));
        System.out.println("Users IDs: ");
        PrintUtilsMethods.printLongId(methods.getUsersId(heroes));
        System.out.println();
        System.out.println("Empty users deleted: ");
        PrintUtilsMethods.printMethods(methods.deleteEmptyUsers(heroes));
    }
}
