import java.util.ArrayList;
import java.util.List;

public class LoginService
{
    List<User> users = new ArrayList<User>();

    public void addUser(User user)
    {
        users.add(user);
    }

    public boolean login(String username, String password)
    {

    }

    public boolean login(String email, String password)
    {

    }

    public boolean login(String username, String token)
    {
        
    }

    public boolean login(long phoneNumber, String password)
    {

    }
}