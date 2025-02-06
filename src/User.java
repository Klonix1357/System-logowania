public class User
{
    private String username;
    private String password;
    private String email;
    private long phoneNumber;
    private int token;

    public User (String username, String password, String email, long phoneNumber, int token)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.token = token;
    }

    public void getAccessLevel()
    {
        System.out.println("Użytkownik nie posiada żadnych uprawnień");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getToken() {
        return token;
    }
}