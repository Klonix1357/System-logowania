public class Manager extends User
{
    public Manager (String username, String password, String email, long phoneNumber, int token)
    {
        super(username, password, email, phoneNumber, token);
    }

    @Override
    public void getAccessLevel()
    {
        System.out.println("Menadżer posiada dostęp do raportów");
    }
}
