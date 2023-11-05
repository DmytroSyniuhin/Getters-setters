public class Program {
    public static void main(String[] args) {
        System.out.println("Користувач № 1:");
        Account messi = new Account("Ліонель", 24, 6, 1987, "leomessi@gmail.com", "+5495280313969", "Мессі", 72.0, 120, 15000);

        messi.printAccountInfo();

        messi.setSteps(12000);
        messi.setWeight(70.5);

        System.out.println();
        System.out.println("Зі змінами кількості шагів та ваги:");

        messi.printAccountInfo();

        System.out.println();

        System.out.println();

        System.out.println("Користувач № 2:");
        Account lebron = new Account("Джеймс", 30, 11, 1984, "kingjames@gmail.com", "+195209236349", "Леброн", 113.0, 115, 8000);

        lebron.printAccountInfo();

        lebron.setSteps(20000);
        lebron.setPressure(135);

        System.out.println();
        System.out.println("Зі змінами кількості шагів та тиску:");

        lebron.printAccountInfo();

        System.out.println();

        System.out.println();

        System.out.println("Користувач № 3:");
        Account serena = new Account("Серена", 26, 9, 1981, "champofwimbledon@gmail.com", "+19803342032", "Вільямс", 72.0, 118, 10000);

        serena.printAccountInfo();

        serena.setSurname("Вільямс-Оганян");
        serena.setPressure(120);

        System.out.println();
        System.out.println("Зі змінами прізвища та тиску:");

        serena.printAccountInfo();
    }
}
