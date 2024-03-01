
/*
User classından turetilmis ve firmaya ozgu islevlere sahip bir class olusturulmalıdır.
Extend edilen classtan metottan override edilmelidir.
 */

import java.util.ArrayList;
import java.util.*;

public class Company extends User implements IProfitable {

    private int para = 0;

    private String adi;
    private String yol;
    private ArrayList<Transport> transportArrayList= new ArrayList<>();
    public Company(String username, String password) {
        super(username, password);
    }
    // Admin'e özgü işlemleri tanımla
    public void performAdminAction() {
        System.out.println("Admin action performed by: " + super.getUsername());
    }
    public String getAdi() {return adi;}
    public void setAdi(String adi) {this.adi = adi;}
    public String getYol() {return yol;}
    public void setYol(String yol) {this.yol = yol;}
    public ArrayList<Transport> getTransportArrayList(){return transportArrayList;}
    public void setTransportArrayList(Transport transport) {this.transportArrayList.add(transport);}


    @Override
    public void setParaKazanma(int para) {
        this.para = this.para + para; // biletlerden kazandığı para
    }

    @Override
    public int getParaKazanma() {
        return this.para;
    }
}




