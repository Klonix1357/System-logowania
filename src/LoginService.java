import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginService
{
    private List<User> users = new ArrayList<User>();

    public void addUser(User user)
    {
        users.add(user);
    }

    public void login(String username, String password)
    {
        boolean znalezionoKonto = false;
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getUsername().equals(username))
            {
                znalezionoKonto = true;
                if (users.get(i).getPassword().equals(password))
                {
                    details(i);
                }
                else
                {
                    System.out.println("Błędne hasło");
                }
            }

        }
        if (!znalezionoKonto)
        {
            System.out.println("Taka nazwa użytkownika nie istnieje");
        }
    }

    public void login(String username, String email, String password)
    {
        boolean znalezionoKonto = false;
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getUsername().equals(username))
            {
                znalezionoKonto = true;
                if (users.get(i).getEmail().equals(email))
                {
                    if (users.get(i).getPassword().equals(password))
                    {
                        details(i);
                    }
                    else
                    {
                        System.out.println("Błędne hasło");
                    }
                }
                else
                {
                    System.out.println("Błędny adres email");
                }
            }
        }

        if (!znalezionoKonto)
        {
            System.out.println("Taka nazwa użytkownika nie istnieje");
        }
    }

    public void login(String username, int token)
    {
        boolean znalezionoKonto = false;
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getUsername().equals(username))
            {
                znalezionoKonto = true;
                if (users.get(i).getToken() == token)
                {
                    details(i);
                }
                else
                {
                    System.out.println("Błędny token");
                }
            }
        }

        if (!znalezionoKonto)
        {
            System.out.println("Taka nazwa użytkownika nie istnieje");
        }
    }

    public void login(long phoneNumber, String password)
    {
        boolean znalezionoNumer = false;
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getPhoneNumber() == phoneNumber)
            {
                znalezionoNumer = true;
                if (users.get(i).getPassword().equals(password))
                {
                    details(i);
                }
                else
                {
                    System.out.println("Błędne hasło");
                }
            }
        }

        if (!znalezionoNumer)
        {
            System.out.println("Taki numer telefonu nie został znaleziony");
        }
    }

    private void details(int index)
    {
        System.out.println("Udało się zalogować na konto: " + users.get(index).getUsername());
        int wybor = 0;

        while(wybor != 2)
        {
            System.out.println("\n\nCo chcesz zrobić na tym koncie?");
            System.out.println("1. Zobaczyć poziom dostępu tego konta");
            System.out.println("2. Wylogować się");
            wybor = getInt("Wybierz opcję: ");

            switch (wybor)
            {
                case 1:
                    users.get(index).getAccessLevel();
                    break;

                case 2:
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
}