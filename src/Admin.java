public class Admin extends User
{
    public Admin (String username, String password, String email, long phoneNumber, int token)
    {
        super(username, password, email, phoneNumber, token);
    }

    @Override
    public void getAccessLevel()
    {
        System.out.println("Administrator posiada pełne uprawnienia");
    }
}