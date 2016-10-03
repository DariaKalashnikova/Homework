package Module6;


public class Main {
    public static void main(String[] args) {

        User captainAmerica = new User(88, "Steve", "Rogers", 8000, 150000);
        User falcon = new User(177, "Jim", "Wilson", 7800, 44800);
        User wildCard = new User(177, "Jim", "Wilson", 7800, 44800);
        User blackWidow = new User(52, "Natalia", "Alianovna", 9800, 155897);
        User bucky = new User(1996, "Rick", "Jones", 8000, 56487);
        User nomad = new User(180, "Edward", "Ferbel", 10000, 235489);
        User sharonCarter = new User(13, "Sharon", "Carter", 18000, 10000000);
        User freeSpirit = new User(431, "Cathy", "Webster", 23000, 55555555);
        User jackFlag = new User(434, "Jack", "Harrison", 9980, 55577788);
        User shield = new User();

        User[] heroes = {captainAmerica,falcon,wildCard,blackWidow,bucky,nomad,sharonCarter,freeSpirit,jackFlag, shield};


        UserUtils methods = new UserUtils();

        methods.uniqueUsers(heroes);
        methods.usersWithContitionalBalance(heroes,8000);
        methods.getUsersId(heroes);
        methods.paySalaryToUsers(heroes);
        methods.deleteEmptyUsers(heroes);
    }
}
