package Module4;


public class Main {
    public static void main(String[] args) {
        Bank BankOfAmerica = new USBank(5245897, "USA", Currency.USD, 800, 4500, 2, 900802150);
        Bank Citibank = new USBank(1224897, "USA", Currency.EUR, 750, 5200, 1, 875429994);

        Bank Piraeus = new EUBank(458756, "Greece", Currency.EUR, 500, 3600, 10, 859432118);
        Bank Jyske = new EUBank(356251, "Denmark", Currency.USD, 420, 5800, 5, 1000500068);

        Bank HuaXia = new ChinaBank(212356, "China", Currency.EUR, 900, 8520, 15, 2005480001);
        Bank BankOfChina = new ChinaBank(145876, "China", Currency.USD, 600, 7350, 11, 400587321);

        BankSystemImpl bankSystemImpl = new BankSystemImpl();

        User userBankOfAmerica = new User();
        userBankOfAmerica.setName("Harvey");
        userBankOfAmerica.setBalance(555423);
        userBankOfAmerica.setMonthsOfEmployment(28);
        userBankOfAmerica.setCompanyName("Cherfull Grove");
        userBankOfAmerica.setSalary(3500);
        userBankOfAmerica.setBank(BankOfAmerica);
        userBankOfAmerica.setId(5245);

        User userCitibank = new User();
        userCitibank.setName("Mr. Pibody");
        userCitibank.setBalance(897564);
        userCitibank.setMonthsOfEmployment(54);
        userCitibank.setCompanyName("Peabody Energy Corporation");
        userCitibank.setSalary(88000);
        userCitibank.setBank(Citibank);
        userCitibank.setId(222124);

        User userPirarus = new User();
        userPirarus.setName("Stavros");
        userPirarus.setBalance(5541);
        userPirarus.setMonthsOfEmployment(32);
        userPirarus.setCompanyName("Minotaur");
        userPirarus.setSalary(2000);
        userPirarus.setBank(Piraeus);
        userPirarus.setId(2412);

        User userJyske = new User();
        userJyske.setName("Bent");
        userJyske.setBalance(8790);
        userJyske.setMonthsOfEmployment(11);
        userJyske.setCompanyName("Bluepack");
        userJyske.setSalary(7000);
        userJyske.setBank(Jyske);
        userJyske.setId(1155);

        User userHuaXia = new User();
        userHuaXia.setName("Lee");
        userHuaXia.setBalance(32564);
        userHuaXia.setMonthsOfEmployment(44);
        userHuaXia.setCompanyName("Xiaomi");
        userHuaXia.setSalary(897);
        userHuaXia.setBank(HuaXia);
        userHuaXia.setId(98452);

        User userBankOfChina = new User();
        userBankOfChina.setName("Luna");
        userBankOfChina.setBalance(5551);
        userBankOfChina.setMonthsOfEmployment(22);
        userBankOfChina.setCompanyName("PiuPiu");
        userBankOfChina.setSalary(2541);
        userBankOfChina.setBank(BankOfChina);
        userBankOfChina.setId(1474);

        bankSystemImpl.withdrawOfUser(userBankOfAmerica, 50);
        bankSystemImpl.withdrawOfUser(userCitibank, 300);
        bankSystemImpl.fundUser(userBankOfAmerica, 420);
        bankSystemImpl.fundUser(userCitibank, 120);
        bankSystemImpl.transferMoney(userBankOfAmerica, userCitibank, 300);
        bankSystemImpl.transferMoney(userCitibank, userBankOfAmerica, 745);
        bankSystemImpl.paySalary(userBankOfAmerica);
        bankSystemImpl.paySalary(userCitibank);

        bankSystemImpl.withdrawOfUser(userPirarus, 120);
        bankSystemImpl.withdrawOfUser(userJyske, 900);
        bankSystemImpl.fundUser(userPirarus, 358);
        bankSystemImpl.fundUser(userJyske, 654);
        bankSystemImpl.transferMoney(userPirarus, userJyske, 854);
        bankSystemImpl.transferMoney(userJyske, userPirarus, 380);
        bankSystemImpl.paySalary(userPirarus);
        bankSystemImpl.paySalary(userJyske);

        bankSystemImpl.withdrawOfUser(userHuaXia, 800);
        bankSystemImpl.withdrawOfUser(userBankOfChina, 970);
        bankSystemImpl.fundUser(userHuaXia, 100);
        bankSystemImpl.fundUser(userBankOfChina, 250);
        bankSystemImpl.transferMoney(userBankOfChina, userHuaXia, 280);
        bankSystemImpl.transferMoney(userHuaXia, userBankOfChina, 400);
        bankSystemImpl.paySalary(userBankOfChina);
        bankSystemImpl.paySalary(userHuaXia);

        System.out.println(userBankOfAmerica.toString());
        System.out.println(userCitibank.toString());
        System.out.println(userPirarus.toString());
        System.out.println(userJyske.toString());
        System.out.println(userHuaXia.toString());
        System.out.println(userBankOfChina.toString());
    }
}
