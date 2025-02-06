public class Tester extends User
{
    public Tester (String username, String password, String email, long phoneNumber, int token)
    {
        super(username, password, email, phoneNumber, token);
    }

    @Override
    public void getAccessLevel()
    {
        System.out.println("Tester posiada dostęp do środowiska testowego");
    }
}
