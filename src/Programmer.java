public class Programmer extends User
{
    public Programmer (String username, String password, String email, long phoneNumber, int token)
    {
        super(username, password, email, phoneNumber, token);
    }

    @Override
    public void getAccessLevel()
    {
        System.out.println("Programista posiada dostęp do kodu, ale nie posiada dostępu do ustawień");
    }
}