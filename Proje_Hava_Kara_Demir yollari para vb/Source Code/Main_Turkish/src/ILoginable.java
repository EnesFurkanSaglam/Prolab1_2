/*
Bu Interface, giris yapma yetenegine sahip nesneleri temsil eder. Bu Interface User class’ına implement edilmelidir
 */

public interface ILoginable {
    boolean login(String username, String password);
    void logout();
}
