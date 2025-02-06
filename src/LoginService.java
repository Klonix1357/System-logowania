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
        for (User user : users)
        {
            if (user.getUsername().equals(username))
            {
                if (user.getPassword().equals(password))
                {
                    // menu2(int index)
                }
            }
        }
    }

    public void login(String username, String email, String password)
    {

    }

    public void login(String username, int token)
    {
        
    }

    public void login(long phoneNumber, String password)
    {

    }

    private void details(int index)
    {
        System.out.println("Udało się zalogować na konto: " + users.get(index).getUsername());
        int wybor = 0;

        while(wybor != 2)
        {
            System.out.println("Co chcesz zrobić na tym koncie?");
            System.out.println("1. Zobaczyć poziom dostępu tego konta");
            System.out.println("2. Wylogować się");
            wybor = getInt("Wybierz opcję: ");

            switch (wybor)
            {
                case 1:
                    System.out.println("\n");
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