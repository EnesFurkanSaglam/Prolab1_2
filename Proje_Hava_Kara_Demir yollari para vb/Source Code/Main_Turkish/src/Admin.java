/*
User classından turetilmis¸ ve admine ozgu islevleri yerine getirecek sınıftır.
Extend edilen classtan metotlar override edilmelidir.
 */
public class Admin extends User {

    private int hizmetBedeli = 1000;


    public Admin(String username, String password) {
        super(username,password);
    }

    // Admin'e özgü işlemleri tanımla
    public void performAdminAction() {
        System.out.println("Admin action performed by: " + super.getUsername());
    }

    public int getHizmetBedeli() {
        return hizmetBedeli;
    }

    public void setHizmetBedeli(int hizmetBedeli) {
        this.hizmetBedeli = hizmetBedeli;
    }
}

