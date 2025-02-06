import java.util.Scanner;

public class Main
{
    static LoginService ls = new LoginService();

    static Admin admin = new Admin(
            "admin",
            "admin123",
            "admin@email.com",
            111222333,
            9090
    );

    static Programmer programmer = new Programmer(
            "korposzczur",
            "k0rp05z€zur",
            "korposzczur@o2.pl",
            555111555,
            5555
    );

    static Tester tester = new Tester(
            "retset",
            "qwerty111",
            "retset@gmail.com",
            234234234,
            2025
    );

    static Manager manager = new Manager(
            "",
            "",
            "",
            0,
            0
    );

    private static void logowanie1()
    {
        String username = getLine("Wpisz nazwę użytkownika: ");
        String password = getLine("Wpisz hasło: ");
        ls.login(username, password);
    }

    private static void logowanie2()
    {
        String username = getLine("Wpisz nazwę użytkownika: ");
        String email = getLine("Wpisz e-mail: ");
        String password = getLine("Wpisz hasło: ");
        ls.login(username, email, password);
    }

    private static void logowanie3()
    {

    }

    private static void logowanie4()
    {

    }

    public static void main(String[] args)
    {
        // Prymitywna rejestracja użytkowników
        ls.addUser(admin);
        ls.addUser(programmer);
        ls.addUser(tester);
        ls.addUser(manager);

        // menu
        int wybor = 0;
        while(wybor != 5)
        {
            System.out.println("Witaj w systemie logowania\n");
            System.out.println("Wybierz sposób logowania:");
            System.out.println("1. Nazwa użytkownika + hasło");
            System.out.println("2. Nazwa użytkownika + e-mail + hasło");
            System.out.println("3. Nazwa użytkownika + token");
            System.out.println("4. Numer telefonu + hasło");
            System.out.println("5. Wyjdź z systemu");
            wybor = getInt("Wybierz opcję: ");

            switch (wybor)
            {
                case 1:
                    logowanie1();
                    break;

                case 2:
                    logowanie2();
                    break;

                case 3:
                    logowanie3();
                    break;

                case 4:
                    logowanie4();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }

        }
    }

    private static int getInt(String pytanie)
    {
        System.out.print(pytanie);
        int in = new Scanner(System.in).nextInt();
        System.out.println();
        return in;
    }

    private static String getLine(String pytanie)
    {
        System.out.print(pytanie);
        String in = new Scanner(System.in).nextLine();
        System.out.println();
        return in;
    }
}