/*
Rezervasyon islemi yapılırken yolcu bilgileri icin bir class olusturulmalıdır.
Bu class Person’dan extend alacaktır.
 */

import java.util.ArrayList;

public class Passanger extends Person{

    private String ad;
    private String soyad;
    private String dogumTarihi;
    private int tcKimlik;

    ArrayList<Passanger> passangerArrayList = new ArrayList<>();
    ArrayList <Passanger> passangerArrayListGecici = new ArrayList<>();

    @Override
    public String getAd() {
        return this.ad;
    }

    @Override
    public String getSoyad() {
        return this.soyad;
    }

    @Override
    public int gettcKimlik() {
        return this.tcKimlik;
    }

    @Override
    public String getdogumTarihi() {
        return this.dogumTarihi;
    }

    @Override
    public void setAd(String ad){
        this.ad = ad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public void settcKimlik(int tcKimlik) {
        this.tcKimlik = tcKimlik;

    }

    @Override
    public void setdogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;

    }
}
