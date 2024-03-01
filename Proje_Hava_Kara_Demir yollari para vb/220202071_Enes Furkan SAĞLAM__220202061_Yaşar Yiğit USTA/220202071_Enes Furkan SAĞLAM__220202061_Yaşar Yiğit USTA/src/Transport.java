import java.util.ArrayList;

/*
Bu Sınıf tasıma secenekleri hakkında bilgileri iceren bir class olacaktır.
Bu class icinde sirketler, araclar, seyahat bilgileri, koltuk bilgileri yer almaktadır.
Ayrıca Koltuk durum bilgisi ve koltukların rezervasyon foksiyonları yer almalıdır.
 */
public class Transport {

    private String firmaAdi;
    private String vasita;
    private int no;
    private int koltukSayisi1;
    private int koltukSayisi2;
    private int koltukSayisi3;
    private int koltukSayisi4;
    private int koltukSayisi5;
    private int koltukSayisi6;
    private int koltukSayisi7;
    private int koltukSayisi21;
    private int koltukSayisi22;
    private int koltukSayisi23;
    private int koltukSayisi24;
    private int koltukSayisi25;
    private int koltukSayisi26;
    private int koltukSayisi27;

    private int sefer;

    ArrayList<Transport> transportArrayList = new ArrayList<>();

    public Transport() {
        // Boş yapıcı metod
    }

    public Transport(String firmaAdi, String vasita, int no,int sefer, int koltukSayisi1,int koltukSayisi2,int koltukSayisi3,int koltukSayisi4,int koltukSayisi5,int koltukSayisi6,int koltukSayisi7, int koltukSayisi21,int koltukSayisi22,int koltukSayisi23,int koltukSayisi24,int koltukSayisi25,int koltukSayisi26,int koltukSayisi27) {
        this.firmaAdi = firmaAdi;
        this.vasita = vasita;
        this.no = no;
        this.setKoltukSayisi1(koltukSayisi1);
        this.setKoltukSayisi2(koltukSayisi2);
        this.setKoltukSayisi3(koltukSayisi3);
        this.setKoltukSayisi4(koltukSayisi4);
        this.setKoltukSayisi5(koltukSayisi5);
        this.setKoltukSayisi6(koltukSayisi6);
        this.setKoltukSayisi7(koltukSayisi7);
        this.setKoltukSayisi21(koltukSayisi21);
        this.setKoltukSayisi22(koltukSayisi22);
        this.setKoltukSayisi23(koltukSayisi23);
        this.setKoltukSayisi24(koltukSayisi24);
        this.setKoltukSayisi25(koltukSayisi25);
        this.setKoltukSayisi26(koltukSayisi26);
        this.setKoltukSayisi27(koltukSayisi27);
        this.sefer = sefer;
    }

    public void initializeTransports() {
        Transport busA1 = new Transport("A", "otobus", 1,3, 20,20,20,20,20,20,20, 20,20,20,20,20,20,20);
        transportArrayList.add(busA1);
        Transport busA2 = new Transport("A", "otobus", 2,3,15,15,15,15,15,15,15,15,15,15,15,15,15,15);
        transportArrayList.add(busA2);
        Transport busB1 = new Transport("B", "otobus", 1, 3,15,15,15,15,15,15,15,15,15,15,15,15,15,15);
        transportArrayList.add(busB1);
        Transport busB2 = new Transport("B", "otobus", 2,4,20,20,20,20,20,20,20,20,20,20,20,20,20,20);
        transportArrayList.add(busB2);
        Transport busC1 = new Transport("C", "otobus", 1,4,20,20,20,20,20,20,20,20,20,20,20,20,20,20);
        transportArrayList.add(busC1);
        Transport airplaneC1 = new Transport("C", "ucak", 1, 5,30,30,30,30,30,30,30,30,30,30,30,30,30,30);
        transportArrayList.add(airplaneC1);
        Transport airplaneC2 = new Transport("C", "ucak", 2,5,30,30,30,30,30,30,30,30,30,30,30,30,30,30);
        transportArrayList.add(airplaneC2);
        Transport trainD1 = new Transport("D", "tren", 1,1,25,25,25,25,25,25,25,25,25,25,25,25,25,25);
        transportArrayList.add(trainD1);
        Transport trainD2 = new Transport("D", "tren", 2, 2,25,25,25,25,25,25,25,25,25,25,25,25,25,25);
        transportArrayList.add(trainD2);
        Transport trainD3 = new Transport("D", "tren", 3, 2,25,25,25,25,25,25,25,25,25,25,25,25,25,25);
        transportArrayList.add(trainD3);
        Transport airplaneF1 = new Transport("F", "ucak", 1,6,30,30,30,30,30,30,30,30,30,30,30,30,30,30);
        transportArrayList.add(airplaneF1);
        Transport airplaneF2 = new Transport("F", "ucak", 2,6,30,30,30,30,30,30,30,30,30,30,30,30,30,30);
        transportArrayList.add(airplaneF2);
    }


    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }


    public String getFirmaAdi() {
        return this.firmaAdi;
    }


    public void setVasita(String vasita) {

        this.vasita = vasita;

    }


    public String getVasita() {
        return this.vasita;
    }


    public void setNo(int no) {
        this.no = no;

    }


    public int getNo() {
        return this.no;
    }





    public void setSefer(int sefer) {
        this.sefer = sefer;
    }


    public int getSefer() {
        return this.sefer;
    }


    public int getKoltukSayisi21() {
        return koltukSayisi21;
    }

    public void setKoltukSayisi21(int koltukSayisi21) {
        this.koltukSayisi21 = koltukSayisi21;
    }

    public int getKoltukSayisi22() {
        return koltukSayisi22;
    }

    public void setKoltukSayisi22(int koltukSayisi22) {
        this.koltukSayisi22 = koltukSayisi22;
    }

    public int getKoltukSayisi23() {
        return koltukSayisi23;
    }

    public void setKoltukSayisi23(int koltukSayisi23) {
        this.koltukSayisi23 = koltukSayisi23;
    }

    public int getKoltukSayisi24() {
        return koltukSayisi24;
    }

    public void setKoltukSayisi24(int koltukSayisi24) {
        this.koltukSayisi24 = koltukSayisi24;
    }

    public int getKoltukSayisi25() {
        return koltukSayisi25;
    }

    public void setKoltukSayisi25(int koltukSayisi25) {
        this.koltukSayisi25 = koltukSayisi25;
    }

    public int getKoltukSayisi26() {
        return koltukSayisi26;
    }

    public void setKoltukSayisi26(int koltukSayisi26) {
        this.koltukSayisi26 = koltukSayisi26;
    }

    public int getKoltukSayisi27() {
        return koltukSayisi27;
    }

    public void setKoltukSayisi27(int koltukSayisi27) {
        this.koltukSayisi27 = koltukSayisi27;
    }
    public int getKoltukSayisi1() {
        return koltukSayisi1;
    }

    public void setKoltukSayisi1(int koltukSayisi1) {
        this.koltukSayisi1 = koltukSayisi1;
    }

    public int getKoltukSayisi2() {
        return koltukSayisi2;
    }

    public void setKoltukSayisi2(int koltukSayisi2) {
        this.koltukSayisi2 = koltukSayisi2;
    }

    public int getKoltukSayisi3() {
        return koltukSayisi3;
    }

    public void setKoltukSayisi3(int koltukSayisi3) {
        this.koltukSayisi3 = koltukSayisi3;
    }

    public int getKoltukSayisi4() {
        return koltukSayisi4;
    }

    public void setKoltukSayisi4(int koltukSayisi4) {
        this.koltukSayisi4 = koltukSayisi4;
    }

    public int getKoltukSayisi5() {
        return koltukSayisi5;
    }

    public void setKoltukSayisi5(int koltukSayisi5) {
        this.koltukSayisi5 = koltukSayisi5;
    }

    public int getKoltukSayisi6() {
        return koltukSayisi6;
    }

    public void setKoltukSayisi6(int koltukSayisi6) {
        this.koltukSayisi6 = koltukSayisi6;
    }

    public int getKoltukSayisi7() {
        return koltukSayisi7;
    }

    public void setKoltukSayisi7(int koltukSayisi7) {
        this.koltukSayisi7 = koltukSayisi7;
    }
}
