/*
Sistemdeki kullanıcıları temsil eden bir class olusturulmalıdır. Bu class Abstract olarak tanımlanmalıdır.
Admin, Company olmak uzere iki ture ayrılacaktır. Admin ve Company sınıfları icin gecerli ortak metot ve
degiskenler bu kısımda tanımlanmalıdır.
 */

public abstract class User implements ILoginable {
    private String username;
    private String password;

    // User oluşturucu
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    // Authenticatable arayüzünden gelen metotları uygula
    @Override
    public boolean login(String enteredUsername, String enteredPassword) {
        // Kullanıcı adı ve şifre doğrulaması yap
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    @Override
    public void logout(){
            // Giriş yapan kullanıcıyı çıkış yap
            System.out.println("Logout successful for user: " + username);
        }
    }
