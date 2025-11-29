public class Main {
    public static void main(String[] args) {
        Account account1 = new SimpleAccount(15000);
        Account account2 = new CreditAccount(-15000, -150000);

        System.out.println(account1.add(5000));
        System.out.println(account1.pay(1500));
        System.out.println(account1.pay(20000));
        System.out.println(account1.getBalance());
        System.out.println(account1.transfer(account2,5000));
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        Logger logger = new SimpleLogger();
        logger.log("Привет");
        Logger logger1 = new SmartLogger();
        logger1.log("Дратути");
        logger1.log("Хэп хоп лалалей");
        logger1.log("Опять работать!");
        logger1.log("This is error");




    }
}