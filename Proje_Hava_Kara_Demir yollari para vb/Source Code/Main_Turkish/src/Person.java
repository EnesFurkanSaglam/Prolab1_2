/*
Person Adında bir abstract class olusturulacaktır. Bu classta Ad
ve soyad bilgileri icermelidir.
 */

public abstract class Person {
    public abstract String getAd();
    public abstract String getSoyad();

    public abstract int gettcKimlik();
    public abstract String getdogumTarihi();
    public abstract void setAd(String ad);
    public abstract void setSoyad(String soyad);

    public abstract void settcKimlik(int tcKimlik);
    public abstract void setdogumTarihi(String dogumTarihi);
}
