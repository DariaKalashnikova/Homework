package Module4;


public class Main {
    public static void main(String[] args) {
        Bank bankOfAmerica = new USBank(5245897, "USA", Currency.USD, 800, 4500, 2, 900802150);
        Bank citibank = new USBank(1224897, "USA", Currency.EUR, 750, 5200, 1, 875429994);

        Bank piraeus = new EUBank(458756, "Greece", Currency.EUR, 500, 3600, 10, 859432118);
        Bank jyske = new EUBank(356251, "Denmark", Currency.USD, 420, 5800, 5, 1000500068);

        Bank huaXia = new ChinaBank(212356, "China", Currency.EUR, 900, 8520, 15, 2005480001);
        Bank bankOfChina = new ChinaBank(145876, "China", Currency.USD, 600, 7350, 11, 400587321);


        User userbankOfAmerica = new User();
        userbankOfAmerica.setName("Harvey");
        userbankOfAmerica.setBalance(555423);
        userbankOfAmerica.setMonthsOfEmployment(28);
        userbankOfAmerica.setCompanyName("Cherfull Grove");
        userbankOfAmerica.setSalary(3500);
        userbankOfAmerica.setBank(bankOfAmerica);
        userbankOfAmerica.setId(5245);

        User usercitibank = new User();
        usercitibank.setName("Mr. Pibody");
        usercitibank.setBalance(897564);
        usercitibank.setMonthsOfEmployment(54);
        usercitibank.setCompanyName("Peabody Energy Corporation");
        usercitibank.setSalary(88000);
        usercitibank.setBank(citibank);
        usercitibank.setId(222124);

        User userpirarus = new User();
        userpirarus.setName("Stavros");
        userpirarus.setBalance(5541);
        userpirarus.setMonthsOfEmployment(32);
        userpirarus.setCompanyName("Minotaur");
        userpirarus.setSalary(2000);
        userpirarus.setBank(piraeus);
        userpirarus.setId(2412);

        User userjyske = new User();
        userjyske.setName("Bent");
        userjyske.setBalance(8790);
        userjyske.setMonthsOfEmployment(11);
        userjyske.setCompanyName("Bluepack");
        userjyske.setSalary(7000);
        userjyske.setBank(jyske);
        userjyske.setId(1155);

        User userhuaXia = new User();
        userhuaXia.setName("Lee");
        userhuaXia.setBalance(32564);
        userhuaXia.setMonthsOfEmployment(44);
        userhuaXia.setCompanyName("Xiaomi");
        userhuaXia.setSalary(897);
        userhuaXia.setBank(huaXia);
        userhuaXia.setId(98452);

        User userbankOfChina = new User();
        userbankOfChina.setName("Luna");
        userbankOfChina.setBalance(5551);
        userbankOfChina.setMonthsOfEmployment(22);
        userbankOfChina.setCompanyName("PiuPiu");
        userbankOfChina.setSalary(2541);
        userbankOfChina.setBank(bankOfChina);
        userbankOfChina.setId(1474);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(userbankOfAmerica, 150);
        bankSystem.withdrawOfUser(usercitibank, 300);
        bankSystem.fundUser(userbankOfAmerica, 420);
        bankSystem.fundUser(usercitibank, 120);
        bankSystem.transferMoney(userbankOfAmerica, usercitibank, 300);
        bankSystem.transferMoney(usercitibank, userbankOfAmerica, 745);
        bankSystem.paySalary(userbankOfAmerica);
        bankSystem.paySalary(usercitibank);

        bankSystem.withdrawOfUser(userpirarus, 120);
        bankSystem.withdrawOfUser(userjyske, 900);
        bankSystem.fundUser(userpirarus, 358);
        bankSystem.fundUser(userjyske, 654);
        bankSystem.transferMoney(userpirarus, userjyske, 854);
        bankSystem.transferMoney(userjyske, userpirarus, 380);
        bankSystem.paySalary(userpirarus);
        bankSystem.paySalary(userjyske);

        bankSystem.withdrawOfUser(userhuaXia, 250);
        bankSystem.withdrawOfUser(userbankOfChina, 190);
        bankSystem.fundUser(userhuaXia, 100);
        bankSystem.fundUser(userbankOfChina, 250);
        bankSystem.transferMoney(userbankOfChina, userhuaXia, 280);
        bankSystem.transferMoney(userhuaXia, userbankOfChina, 400);
        bankSystem.paySalary(userbankOfChina);
        bankSystem.paySalary(userhuaXia);

        System.out.println(userbankOfAmerica.toString());
        System.out.println(usercitibank.toString());
        System.out.println(userpirarus.toString());
        System.out.println(userjyske.toString());
        System.out.println(userhuaXia.toString());
        System.out.println(userbankOfChina.toString());

    }
}
