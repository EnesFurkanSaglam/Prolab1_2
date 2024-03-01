import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        JFrame ilksayfa = new JFrame();
        ilksayfa.setSize(400, 400);
        ilksayfa.getContentPane().setLayout(new FlowLayout());
        JButton btnadmin = new JButton("Admin Girişi");
        JButton btnkullanici = new JButton("Kullanici Girişi");
        JButton btnfirma = new JButton("Firma Girişi");
        ilksayfa.getContentPane().add(btnadmin);
        ilksayfa.getContentPane().add(btnkullanici);
        ilksayfa.getContentPane().add(btnfirma);
        ilksayfa.setVisible(true);

        Route route = new Route();

        Passanger passanger = new Passanger();


        Transport transport123 = new Transport();


        Trip trip = new Trip();
        trip.addKucret();
        trip.addDucret();
        trip.addHucret();


        Company A = new Company("A", "A");
        Company B = new Company("B", "B");
        Company C = new Company("C", "C");
        Company D = new Company("D", "D");
        Company F = new Company("F", "F");

        ArrayList<Company> companyArrayList = new ArrayList<Company>();



        A.setAdi("A");
        A.setYol("K");
        companyArrayList.add(A);

        B.setAdi("B");
        B.setYol("K");
        companyArrayList.add(B);

        C.setAdi("C");
        C.setYol("K-H");
        companyArrayList.add(C);

        D.setAdi("D");
        D.setYol("D");
        companyArrayList.add(D);

        F.setAdi("F");
        F.setYol("H");
        companyArrayList.add(F);


        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "admin");
        Transport transport1 = new Transport();
        Transport transport3 = new Transport();
        transport1.initializeTransports();

        Route route1 = new Route();
        Train train = new Train();
        Bus bus = new Bus();
        Airplane airplane = new Airplane();


        int AFirmasiGunlukGider = 57000 + 2 * (10 * route.ksefer3km);
        int BFirmasiGunlukGider = 37000 + (5 * route.ksefer3km) + (5 * route.ksefer4km);
        int CFirmasiGunlukGider = 25000 + (6 * route.ksefer4km) + 128000 + 2 * (25 * route.hsefer5km);
        int DFirmasiGunlukGider = 37000 + 2 * (3 * route.dsefer1km) + (3 * route.dsefer2km);
        int FFirmasiGunlukGider = 109000 + 2 * (20 * route.hsefer6km);


        btnadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frmAdmin = new JFrame();

                frmAdmin.setSize(400, 400);
                frmAdmin.getContentPane().setLayout(new FlowLayout());
                JTextField txtAdminKullaniciAdi = new JTextField(10);

                JTextField txtAdminKullaniciSifre = new JTextField(10);

                JButton btnAdminGirisi = new JButton("Giris Yap");

                JLabel lblAdminKullaniciAdi = new JLabel("Kullanici Adi: ");

                JLabel lblAdminKullaniciSifre = new JLabel("Sifre: ");

                frmAdmin.getContentPane().add(lblAdminKullaniciAdi);
                frmAdmin.getContentPane().add(txtAdminKullaniciAdi);
                frmAdmin.getContentPane().add(lblAdminKullaniciSifre);
                frmAdmin.getContentPane().add(txtAdminKullaniciSifre);
                frmAdmin.getContentPane().add(btnAdminGirisi);
                frmAdmin.setVisible(true);


                btnAdminGirisi.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (admin.login(txtAdminKullaniciAdi.getText(), txtAdminKullaniciSifre.getText())) {
                            JFrame frmAdmin2 = new JFrame();
                            frmAdmin2.setSize(400, 400);
                            frmAdmin2.getContentPane().setLayout(new FlowLayout());
                            JPanel adminPaneli2 = new JPanel();
                            frmAdmin2.setLayout(new GridLayout(3, 2));
                            JButton btnSirketEkle = new JButton("Sirket ekle");
                            JButton btnSirketSil = new JButton("Sirket sil");
                            JButton btnSirketGoruntule = new JButton("Sirket Goruntule");
                            JButton btnHizmetBedeli = new JButton("Hizmet bedeli belirle");
                            frmAdmin2.getContentPane().add(btnSirketEkle);
                            frmAdmin2.getContentPane().add(btnSirketSil);
                            frmAdmin2.getContentPane().add(btnSirketGoruntule);
                            frmAdmin2.getContentPane().add(btnHizmetBedeli);
                            frmAdmin2.setVisible(true);
                            btnSirketEkle.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JFrame frmAdminSirketEkle = new JFrame();
                                    frmAdminSirketEkle.setSize(800, 400);
                                    frmAdminSirketEkle.getContentPane().setLayout(new FlowLayout());
                                    JLabel lblKullaniciAdi = new JLabel("Kullanici adi");
                                    JLabel lblKullaniciSifre = new JLabel("Sifre");
                                    JTextField txtKullaniciAdi = new JTextField(10);
                                    JTextField txtSifre = new JTextField(10);
                                    JButton btnFirmaEkle = new JButton("Ekle");
                                    String kullaniciAdi = txtKullaniciAdi.getText();
                                    String sifreSirket = txtSifre.getText();
                                    JLabel lblFirmaAdi = new JLabel("Firma adi");
                                    JTextField txtFirmaAdi = new JTextField(10);
                                    JLabel lblFirmaTur = new JLabel("Firma havayolunu kullanıyorsa H,karayolunu kullanıyorsa K,demiryolunu kullanıyorsa D giriniz, berbaber varsa araya - koyunuz");
                                    JTextField txtFirmaTur = new JTextField(10);
                                    frmAdminSirketEkle.getContentPane().add(lblKullaniciAdi);
                                    frmAdminSirketEkle.getContentPane().add(txtKullaniciAdi);
                                    frmAdminSirketEkle.getContentPane().add(lblKullaniciSifre);
                                    frmAdminSirketEkle.getContentPane().add(txtSifre);
                                    frmAdminSirketEkle.getContentPane().add(lblFirmaAdi);
                                    frmAdminSirketEkle.getContentPane().add(txtFirmaAdi);
                                    frmAdminSirketEkle.getContentPane().add(lblFirmaTur);
                                    frmAdminSirketEkle.getContentPane().add(txtFirmaTur);
                                    frmAdminSirketEkle.getContentPane().add(btnFirmaEkle);
                                    frmAdminSirketEkle.setVisible(true);
                                    btnFirmaEkle.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Company company = new Company(kullaniciAdi, sifreSirket);
                                            company.setAdi(txtFirmaAdi.getText());
                                            transport3.setFirmaAdi(txtFirmaAdi.getText());
                                            transport3.transportArrayList.add(transport3);
                                            company.setYol(txtFirmaTur.getText());
                                            companyArrayList.add(company);
                                            JOptionPane.showMessageDialog(null, "Firma Eklendi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                        }
                                    });
                                }
                            });
                            btnSirketSil.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JFrame frmFirmaSil = new JFrame();
                                    frmFirmaSil.setSize(400, 400);
                                    frmFirmaSil.getContentPane().setLayout(new FlowLayout());
                                    JLabel lblFirmaAdi = new JLabel("Firma Adini Giriniz: ");
                                    JTextField txtFirmaAdi = new JTextField(10);
                                    JButton btnFirmaSil = new JButton("Sil");
                                    btnFirmaSil.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Iterator<Company> iterator = companyArrayList.iterator();
                                            while (iterator.hasNext()) {
                                                Company company = iterator.next();
                                                if (company.getAdi().equals(txtFirmaAdi.getText())) {
                                                    // Şirketi bulduk, sil
                                                    iterator.remove();
                                                    JOptionPane.showMessageDialog(null, "şirketi başarıyla silindi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                }
                                            }
                                        }
                                    });

                                    frmFirmaSil.getContentPane().add(lblFirmaAdi);
                                    frmFirmaSil.getContentPane().add(txtFirmaAdi);
                                    frmFirmaSil.getContentPane().add(btnFirmaSil);
                                    frmFirmaSil.setVisible(true);
                                }
                            });

                            btnSirketGoruntule.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JFrame frmSirketGoruntule = new JFrame();
                                    frmSirketGoruntule.setSize(400, 400);
                                    frmSirketGoruntule.getContentPane().setLayout(new FlowLayout());
                                    for (Company company : companyArrayList) {
                                        JLabel lblSirketGoruntule = new JLabel(company.getAdi() + " ");
                                        frmSirketGoruntule.getContentPane().add(lblSirketGoruntule);
                                    }
                                    frmSirketGoruntule.setVisible(true);
                                }
                            });
                            btnHizmetBedeli.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JFrame frmHizmetBedeli = new JFrame();
                                    frmHizmetBedeli.setSize(400, 400);
                                    frmHizmetBedeli.getContentPane().setLayout(new FlowLayout());
                                    JLabel lblHizmetBedeli = new JLabel("Hizmet Bedeli Giriniz(Şu anki değeri: " + admin.getHizmetBedeli() + " )");
                                    JTextField txtHizmetBedeli = new JTextField(10);
                                    JButton btnHizmetBedeli = new JButton("Güncelle");
                                    frmHizmetBedeli.getContentPane().add(lblHizmetBedeli);
                                    frmHizmetBedeli.getContentPane().add(txtHizmetBedeli);
                                    frmHizmetBedeli.getContentPane().add(btnHizmetBedeli);
                                    frmHizmetBedeli.setVisible(true);
                                    btnHizmetBedeli.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            admin.setHizmetBedeli(Integer.parseInt(txtHizmetBedeli.getText()));
                                            JOptionPane.showMessageDialog(null, "Hizmet Bedeli Güncellendi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                        }
                                    });
                                }
                            });
                        } else {
                            JOptionPane.showMessageDialog(null, "Kullanici adi veya sifre yanlis", "HATA", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                });



            }
        });
        btnfirma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frmFirma = new JFrame();
                frmFirma.setSize(400, 400);
                frmFirma.getContentPane().setLayout(new FlowLayout());
                JLabel lblFirma = new JLabel("Hangi Firma Hakkında islem yapmak İstiyorsun");
                JTextField txtFirma = new JTextField(10);
                JButton btnFirma = new JButton("Devam Et");
                frmFirma.getContentPane().add(lblFirma);
                frmFirma.getContentPane().add(txtFirma);
                frmFirma.getContentPane().add(btnFirma);
                frmFirma.setVisible(true);
                btnFirma.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frmFirmaGiris = new JFrame();
                        frmFirmaGiris.setSize(400, 400);
                        frmFirmaGiris.getContentPane().setLayout(new FlowLayout());
                        JLabel lblFirmaGirisKullaniciAdi = new JLabel("Kullanici Adi");
                        JTextField txtFirmaGirisKullaniciAdi = new JTextField(10);
                        JLabel lblFirmaGirisSifre = new JLabel("Sifre");
                        JTextField txtFirmaGirisSifre = new JTextField(10);
                        JButton btnFirmaGiris =new JButton("Giris Yap");
                        frmFirmaGiris.getContentPane().add(lblFirmaGirisKullaniciAdi);
                        frmFirmaGiris.getContentPane().add(txtFirmaGirisKullaniciAdi);
                        frmFirmaGiris.getContentPane().add(lblFirmaGirisSifre);
                        frmFirmaGiris.getContentPane().add(txtFirmaGirisSifre);
                        frmFirmaGiris.getContentPane().add(btnFirmaGiris);
                        frmFirmaGiris.setVisible(true);



                        btnFirmaGiris.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                for (Company company: companyArrayList){
                                    if (company.login(txtFirmaGirisKullaniciAdi.getText(),txtFirmaGirisSifre.getText())){
                                        JFrame frmFirmaGirdik = new JFrame();
                                        frmFirmaGirdik.setSize(400, 400);
                                        frmFirmaGirdik.getContentPane().setLayout(new FlowLayout());
                                        JButton btnArac = new JButton("Arac ile ilgili islem");
                                        JButton btnSefer = new JButton("Sefer ile ilgili islem");
                                        JButton btnGunlukKar = new JButton("Haftalık kar");
                                        frmFirmaGirdik.getContentPane().add(btnArac);
                                        frmFirmaGirdik.getContentPane().add(btnSefer);
                                        frmFirmaGirdik.getContentPane().add(btnGunlukKar);
                                        frmFirmaGirdik.setVisible(true);

                                        btnArac.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frmArac = new JFrame();
                                                frmArac.setSize(400, 400);
                                                frmArac.getContentPane().setLayout(new FlowLayout());

                                                JButton btnAracEkle =new JButton("Arac ekle");
                                                JButton btnAracSil =new JButton("Arac sil");
                                                frmArac.getContentPane().add(btnAracEkle);
                                                frmArac.getContentPane().add(btnAracSil);
                                                frmArac.setVisible(true);

                                                btnAracEkle.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JFrame frmAracEkle = new JFrame();
                                                        frmAracEkle.setSize(400, 400);
                                                        frmAracEkle.getContentPane().setLayout(new FlowLayout());


                                                        JLabel lblAracGoruntule = new JLabel(company.getAdi() + " firmasının aracları:"+"\n");
                                                        frmAracEkle.getContentPane().add(lblAracGoruntule);

                                                        for (Transport transport : transport1.transportArrayList) {
                                                            if (transport.getFirmaAdi().equals(company.getAdi())) {
                                                                JLabel lblAracGoruntuleme = new JLabel(transport.getFirmaAdi() + " firmasının " + transport.getNo() + " nolu " + transport.getVasita() + " vasitasi " + transport.getSefer() + ". seferi yapıyor");
                                                                frmAracEkle.getContentPane().add(lblAracGoruntuleme);
                                                            }
                                                        }



                                                        Transport transport2 = new Transport();

                                                        JLabel lblAracEkleAdi = new JLabel("Eklemek istediginiz aracın firma adı: ");
                                                        JTextField txtAracEkleAdi = new JTextField(10);

                                                        JLabel lblAracEkleTur = new JLabel("Eklemek istediginiz aracın turu: ");
                                                        JTextField txtAracEkleTur = new JTextField(10);

                                                        JLabel lblAracEkleNo = new JLabel("Eklemek istediginiz aracın nosu: ");
                                                        JTextField txtAracEkleNo = new JTextField(10);

                                                        JLabel lblAracEkleKoltuk = new JLabel("Eklemek istediginiz aracın koltuksayisi: ");
                                                        JTextField txtAracEkleKoltuk = new JTextField(10);

                                                        JLabel lblAracEkleSefer = new JLabel("Eklemek istediginiz aracın sefer nosu: ");
                                                        JTextField txtAracEkleSefer = new JTextField(10);

                                                        JButton btnAracEkle2 = new JButton("ekle");


                                                        frmAracEkle.getContentPane().add(lblAracEkleAdi);
                                                        frmAracEkle.getContentPane().add(txtAracEkleAdi);
                                                        frmAracEkle.getContentPane().add(lblAracEkleTur);
                                                        frmAracEkle.getContentPane().add(txtAracEkleTur);
                                                        frmAracEkle.getContentPane().add(lblAracEkleNo);
                                                        frmAracEkle.getContentPane().add(txtAracEkleNo);
                                                        frmAracEkle.getContentPane().add(lblAracEkleKoltuk);
                                                        frmAracEkle.getContentPane().add(txtAracEkleKoltuk);
                                                        frmAracEkle.getContentPane().add(lblAracEkleSefer);
                                                        frmAracEkle.getContentPane().add(txtAracEkleSefer);
                                                        frmAracEkle.getContentPane().add(btnAracEkle2);

                                                        frmAracEkle.setVisible(true);

                                                        btnAracEkle2.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                transport2.setFirmaAdi(txtAracEkleAdi.getText());
                                                                transport2.setVasita(txtAracEkleTur.getText());
                                                                transport2.setNo(Integer.parseInt(txtAracEkleNo.getText()));
                                                                transport2.setKoltukSayisi1(Integer.parseInt(txtAracEkleKoltuk.getText()));
                                                                transport2.setKoltukSayisi2(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi3(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi4(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi5(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi6(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi7(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi21(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi22(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi23(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi24(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi25(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi26(transport2.getKoltukSayisi1());
                                                                transport2.setKoltukSayisi27(transport2.getKoltukSayisi1());
                                                                transport2.setSefer(Integer.parseInt(txtAracEkleSefer.getText()));
                                                                transport1.transportArrayList.add(transport2);
                                                                JOptionPane.showMessageDialog(null, "Arac Eklendi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);

                                                            }
                                                        });





                                                    }
                                                });

                                                btnAracSil.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JFrame frmAracSilme = new JFrame();
                                                        frmAracSilme.setSize(340, 400);
                                                        frmAracSilme.getContentPane().setLayout(new FlowLayout());

                                                        for (Transport transport : transport1.transportArrayList) {
                                                            if (transport.getFirmaAdi().equals(company.getAdi())) {
                                                                JLabel lblAracGoruntuleme = new JLabel(transport.getFirmaAdi() + " firmasının " + transport.getNo() + " nolu " + transport.getVasita() + " vasitasi " + transport.getSefer() + ". seferi yapıyor");
                                                                frmAracSilme.getContentPane().add(lblAracGoruntuleme);
                                                            }

                                                        }

                                                        System.out.println("Aracın no sunu ve vasitasini giriniz");
                                                        JLabel lblAracNo = new JLabel("Aracın no sunu giriniz");
                                                        JTextField txtAracNo = new JTextField(10);
                                                        JLabel lblAracTur = new JLabel("Aracın turunu giriniz");
                                                        JTextField txtAracTur = new JTextField(10);
                                                        JButton btnAracSil2 =new JButton("Sil");





                                                        frmAracSilme.getContentPane().add(lblAracNo);
                                                        frmAracSilme.getContentPane().add(txtAracNo);

                                                        frmAracSilme.getContentPane().add(lblAracTur);
                                                        frmAracSilme.getContentPane().add(txtAracTur);
                                                        frmAracSilme.getContentPane().add(btnAracSil2);
                                                        frmAracSilme.setVisible(true);




                                                        btnAracSil2.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                for (Transport transport : transport1.transportArrayList) {
                                                                    if (transport.getNo() == Integer.parseInt(txtAracNo.getText()) && txtAracTur.getText().equals(transport.getVasita())) {
                                                                        transport.transportArrayList.remove(transport); // burda sıkıntı çıkabilir çıkarsa transport1 nesnesi kullanılacak
                                                                        JOptionPane.showMessageDialog(null, "Arac Silindi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                                    }
                                                                }

                                                            }
                                                        });

                                                    }
                                                });



                                            }
                                        });

                                        btnSefer.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                JFrame frmSefer = new JFrame();
                                                frmSefer.setSize(400, 400);
                                                frmSefer.getContentPane().setLayout(new FlowLayout());

                                                JButton btnSeferEkle = new JButton("Sefer degisiklilgi");
                                                JButton btnSeferSil = new JButton("Sefer Sil");

                                                frmSefer.getContentPane().add(btnSeferEkle);
                                                frmSefer.getContentPane().add(btnSeferSil);
                                                frmSefer.setVisible(true);

                                                btnSeferEkle.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        JFrame frmSeferEkle = new JFrame();
                                                        frmSeferEkle.setSize(360, 400);
                                                        frmSeferEkle.getContentPane().setLayout(new FlowLayout());


                                                        for (Transport transport : transport1.transportArrayList) {
                                                            if (transport.getFirmaAdi().equals(company.getAdi())) {
                                                                JLabel lblAracGoruntuleme = new JLabel(transport.getFirmaAdi() + " firmasının " + transport.getNo() + " nolu " + transport.getVasita() + " vasitasi " + transport.getSefer() + ". seferi yapıyor");
                                                                frmSeferEkle.getContentPane().add(lblAracGoruntuleme);
                                                            }

                                                        }


                                                        JLabel lblSeferEkleNo = new JLabel("Aracın no sunu giriniz");
                                                        JTextField txtSeferEkleNo = new JTextField(10);
                                                        JLabel lblSeferEkleTur = new JLabel("Aracın turunu giriniz");
                                                        JTextField txtSeferEkleTur = new JTextField(10);
                                                        JLabel lblSeferEkleSefer = new JLabel("Aracın yeni seferini giriniz");
                                                        JTextField txtSeferEkleSefer = new JTextField(10);
                                                        JButton btnSeferEkle2 = new JButton("Sefer Guncelle");
                                                        btnSeferEkle2.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                for (Transport transport : transport1.transportArrayList) {
                                                                    if (transport.getNo() == Integer.parseInt(txtSeferEkleNo.getText()) && txtSeferEkleTur.getText().equals(transport.getVasita())) {
                                                                        transport.setSefer(Integer.parseInt(txtSeferEkleSefer.getText())); // burda sıkıntı çıkabilir çıkarsa transport1 nesnesi kullanılacak

                                                                    }

                                                                }
                                                                JOptionPane.showMessageDialog(null, "Sefer Güncellendi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                            }
                                                        });

                                                        frmSeferEkle.getContentPane().add(lblSeferEkleNo);
                                                        frmSeferEkle.getContentPane().add(txtSeferEkleNo);
                                                        frmSeferEkle.getContentPane().add(lblSeferEkleTur);
                                                        frmSeferEkle.getContentPane().add(txtSeferEkleTur);
                                                        frmSeferEkle.getContentPane().add(lblSeferEkleSefer);
                                                        frmSeferEkle.getContentPane().add(txtSeferEkleSefer);
                                                        frmSeferEkle.getContentPane().add(btnSeferEkle2);
                                                        frmSeferEkle.setVisible(true);

                                                    }
                                                });

                                                btnSeferSil.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JFrame frmSeferSil = new JFrame();
                                                        frmSeferSil.setSize(360, 400);
                                                        frmSeferSil.getContentPane().setLayout(new FlowLayout());

                                                        for (Transport transport : transport1.transportArrayList) {
                                                            if (transport.getFirmaAdi().equals(company.getAdi())) {
                                                                JLabel lblAracGoruntuleme = new JLabel(transport.getFirmaAdi() + " firmasının " + transport.getNo() + " nolu " + transport.getVasita() + " vasitasi " + transport.getSefer() + ". seferi yapıyor");
                                                                frmSeferSil.getContentPane().add(lblAracGoruntuleme);
                                                            }

                                                        }

                                                        JLabel lblSeferSilNo = new JLabel("Aracın no sunu giriniz");
                                                        JTextField txtSeferSilNo = new JTextField(10);
                                                        JLabel lblSeferSilTur = new JLabel("Aracın turunu giriniz");
                                                        JTextField txtSeferSilTur = new JTextField(10);
                                                        JButton btnSeferSil2 = new JButton("Sefer Sil");
                                                        btnSeferSil2.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                for (Transport transport : transport1.transportArrayList) {
                                                                    if (transport.getNo() == Integer.parseInt(txtSeferSilNo.getText()) && transport.getVasita().equals(txtSeferSilTur.getText())) {
                                                                        transport.setSefer(0); // burda sıkıntı çıkabilir çıkarsa transport1 nesnesi kullanılacak
                                                                    }
                                                                }
                                                                JOptionPane.showMessageDialog(null, "Sefer Silindi", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                            }
                                                        });
                                                        frmSeferSil.getContentPane().add(lblSeferSilNo);
                                                        frmSeferSil.getContentPane().add(txtSeferSilNo);
                                                        frmSeferSil.getContentPane().add(lblSeferSilTur);
                                                        frmSeferSil.getContentPane().add(txtSeferSilTur);
                                                        frmSeferSil.getContentPane().add(btnSeferSil2);
                                                        frmSeferSil.setVisible(true);

                                                    }
                                                });

                                            }
                                        });
                                        btnGunlukKar.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frmKar = new JFrame();
                                                frmKar.setSize(360, 400);
                                                frmKar.getContentPane().setLayout(new FlowLayout());

                                                JLabel lblKarZarar = new JLabel("1 haftalık kar-zarar: ");
                                                frmKar.getContentPane().add(lblKarZarar);

                                                if (company.getAdi().equals("A")) {
                                                    int Kar = company.getParaKazanma() - (AFirmasiGunlukGider * 7);
                                                    String a = Integer.toString(Kar);
                                                    JLabel lblKar = new JLabel(a);
                                                    frmKar.getContentPane().add(lblKar);

                                                } else if (company.getAdi().equals("B")) {
                                                    int Kar = company.getParaKazanma() - (BFirmasiGunlukGider * 7);
                                                    String a = Integer.toString(Kar);
                                                    JLabel lblKar = new JLabel(a);
                                                    frmKar.getContentPane().add(lblKar);
                                                } else if (company.getAdi().equals("C")) {
                                                    int Kar = company.getParaKazanma() - (CFirmasiGunlukGider * 7);
                                                    String a = Integer.toString(Kar);
                                                    JLabel lblKar = new JLabel(a);
                                                    frmKar.getContentPane().add(lblKar);

                                                } else if (company.getAdi().equals("D")) {
                                                    int Kar = company.getParaKazanma() - (DFirmasiGunlukGider * 7);
                                                    String a = Integer.toString(Kar);
                                                    JLabel lblKar = new JLabel(a);
                                                    frmKar.getContentPane().add(lblKar);

                                                } else if (company.getAdi().equals("F")) {
                                                    int Kar = company.getParaKazanma() - (FFirmasiGunlukGider * 7);
                                                    String a = Integer.toString(Kar);
                                                    JLabel lblKar = new JLabel(a);
                                                    frmKar.getContentPane().add(lblKar);

                                                }


                                                frmKar.setVisible(true);

                                            }
                                        });

                                    }
                                }






                            }
                        });




                    }
                });



            }
        });
        btnkullanici.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frmKullanici = new JFrame();
                frmKullanici.setSize(670, 400);
                frmKullanici.getContentPane().setLayout(new FlowLayout());

                JLabel lblDemir1 = new JLabel("Demir: ");
                frmKullanici.getContentPane().add(lblDemir1);

                for (int i = 0; i < route.dsefer1.length; i++) {
                    JLabel lblDemir2 = new JLabel(" -> " + route.dsefer1[i]);
                    frmKullanici.getContentPane().add(lblDemir2);

                }

                JLabel lblDemir = new JLabel("Demir: ");
                frmKullanici.getContentPane().add(lblDemir);
                for (int i = 0; i < route.dsefer2.length; i++) {
                    JLabel lblDemir3 = new JLabel(" -> " + route.dsefer2[i]);
                    frmKullanici.getContentPane().add(lblDemir3);
                }
                JLabel lblKara = new JLabel("Kara: ");
                frmKullanici.getContentPane().add(lblKara);

                for (int i = 0; i < route.ksefer3.length; i++) {
                    JLabel lblDemir4 = new JLabel(" -> " + route.ksefer3[i]);
                    frmKullanici.getContentPane().add(lblDemir4);
                }

                JLabel lblKara2 = new JLabel("Kara: ");
                frmKullanici.getContentPane().add(lblKara2);
                for (int i = 0; i < route.ksefer4.length; i++) {
                    JLabel lblDemir5 = new JLabel(" -> " + route.ksefer4[i]);
                    frmKullanici.getContentPane().add(lblDemir5);
                }
                JLabel lblKar = new JLabel("------------------------------");
                frmKullanici.getContentPane().add(lblKar);

                JLabel lblHava = new JLabel("Hava: ");
                frmKullanici.getContentPane().add(lblHava);

                for (int i = 0; i < route.hsefer5.length; i++) {
                    JLabel lblDemir6 = new JLabel(" -> " + route.hsefer5[i]);
                    frmKullanici.getContentPane().add(lblDemir6);
                }
                JLabel lblKar1 = new JLabel("----------------------------------------------------------------------------------------------------");
                frmKullanici.getContentPane().add(lblKar1);

                JLabel lblHava2 = new JLabel("Hava: ");
                frmKullanici.getContentPane().add(lblHava2);
                for (int i = 0; i < route.hsefer6.length; i++) {
                    JLabel lblDemir7 = new JLabel(" -> " + route.hsefer6[i]);
                    frmKullanici.getContentPane().add(lblDemir7);
                }
                JLabel lblKar2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
                frmKullanici.getContentPane().add(lblKar2);

                JButton btnHava = new JButton("Havayolu ile ilgili işlem");
                JButton btnKara = new JButton("Karayolu ile ilgili işlem");
                JButton btnDemir = new JButton("Demiryolu ile ilgili işlem");

                frmKullanici.getContentPane().add(btnHava);
                frmKullanici.getContentPane().add(btnKara);
                frmKullanici.getContentPane().add(btnDemir);



                btnDemir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame frmDemirBilet = new JFrame();
                        frmDemirBilet.setSize(400, 400);
                        frmDemirBilet.getContentPane().setLayout(new FlowLayout());

                        JLabel lblSeferBilgisi = new JLabel("hangi seferi kullanmak istiyorsun");


                        JTextField txtSeferBilgisi = new JTextField(10);

                        String sefer = txtSeferBilgisi.getText();


                        JLabel lblGidenYer = new  JLabel("nereden gitmek istiyorsunuz");
                        JTextField txtGidenYer = new JTextField(10);
                        String nerden = txtGidenYer.getText();

                        JLabel lblGidilenYer = new  JLabel("nereye gitmek istiyorsunuz");
                        JTextField txtGidilenYer = new JTextField(10);
                        String nere = txtGidilenYer.getText();

                        JLabel lblTarih = new  JLabel("hangi tarihte gitmek istiyorsunuz");
                        JButton btnTarih1 = new JButton("4 Aralık");
                        JButton btnTarih2 = new JButton("5 Aralık");
                        JButton btnTarih3 = new JButton("6 Aralık");
                        JButton btnTarih4 = new JButton("7 Aralık");
                        JButton btnTarih5 = new JButton("8 Aralık");
                        JButton btnTarih6 = new JButton("9 Aralık");
                        JButton btnTarih7 = new JButton("10 Aralık");

                        frmDemirBilet.getContentPane().add(lblSeferBilgisi);
                        frmDemirBilet.getContentPane().add(txtSeferBilgisi);
                        frmDemirBilet.getContentPane().add(lblGidenYer);
                        frmDemirBilet.getContentPane().add(txtGidenYer);
                        frmDemirBilet.getContentPane().add(lblGidilenYer);
                        frmDemirBilet.getContentPane().add(txtGidilenYer);
                        frmDemirBilet.getContentPane().add(lblTarih);
                        frmDemirBilet.getContentPane().add(btnTarih1);
                        frmDemirBilet.getContentPane().add(btnTarih2);
                        frmDemirBilet.getContentPane().add(btnTarih3);
                        frmDemirBilet.getContentPane().add(btnTarih4);
                        frmDemirBilet.getContentPane().add(btnTarih5);
                        frmDemirBilet.getContentPane().add(btnTarih6);
                        frmDemirBilet.getContentPane().add(btnTarih7);





                        btnTarih1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);

                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.ducret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });


                        frmDemirBilet.setVisible(true);
                    }
                });
                btnKara.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame frmDemirBilet = new JFrame();
                        frmDemirBilet.setSize(400, 400);
                        frmDemirBilet.getContentPane().setLayout(new FlowLayout());

                        JLabel lblSeferBilgisi = new JLabel("hangi seferi kullanmak istiyorsun");


                        JTextField txtSeferBilgisi = new JTextField(10);

                        String sefer = txtSeferBilgisi.getText();


                        JLabel lblGidenYer = new  JLabel("nereden gitmek istiyorsunuz");
                        JTextField txtGidenYer = new JTextField(10);
                        String nerden = txtGidenYer.getText();

                        JLabel lblGidilenYer = new  JLabel("nereye gitmek istiyorsunuz");
                        JTextField txtGidilenYer = new JTextField(10);
                        String nere = txtGidilenYer.getText();

                        JLabel lblTarih = new  JLabel("hangi tarihte gitmek istiyorsunuz");
                        JButton btnTarih1 = new JButton("4 Aralık");
                        JButton btnTarih2 = new JButton("5 Aralık");
                        JButton btnTarih3 = new JButton("6 Aralık");
                        JButton btnTarih4 = new JButton("7 Aralık");
                        JButton btnTarih5 = new JButton("8 Aralık");
                        JButton btnTarih6 = new JButton("9 Aralık");
                        JButton btnTarih7 = new JButton("10 Aralık");

                        frmDemirBilet.getContentPane().add(lblSeferBilgisi);
                        frmDemirBilet.getContentPane().add(txtSeferBilgisi);
                        frmDemirBilet.getContentPane().add(lblGidenYer);
                        frmDemirBilet.getContentPane().add(txtGidenYer);
                        frmDemirBilet.getContentPane().add(lblGidilenYer);
                        frmDemirBilet.getContentPane().add(txtGidilenYer);
                        frmDemirBilet.getContentPane().add(lblTarih);
                        frmDemirBilet.getContentPane().add(btnTarih1);
                        frmDemirBilet.getContentPane().add(btnTarih2);
                        frmDemirBilet.getContentPane().add(btnTarih3);
                        frmDemirBilet.getContentPane().add(btnTarih4);
                        frmDemirBilet.getContentPane().add(btnTarih5);
                        frmDemirBilet.getContentPane().add(btnTarih6);
                        frmDemirBilet.getContentPane().add(btnTarih7);





                        btnTarih1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);

                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.kucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });


                        frmDemirBilet.setVisible(true);
                    }
                });
                btnHava.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame frmDemirBilet = new JFrame();
                        frmDemirBilet.setSize(400, 400);
                        frmDemirBilet.getContentPane().setLayout(new FlowLayout());

                        JLabel lblSeferBilgisi = new JLabel("hangi seferi kullanmak istiyorsun");


                        JTextField txtSeferBilgisi = new JTextField(10);

                        String sefer = txtSeferBilgisi.getText();


                        JLabel lblGidenYer = new  JLabel("nereden gitmek istiyorsunuz");
                        JTextField txtGidenYer = new JTextField(10);
                        String nerden = txtGidenYer.getText();

                        JLabel lblGidilenYer = new  JLabel("nereye gitmek istiyorsunuz");
                        JTextField txtGidilenYer = new JTextField(10);
                        String nere = txtGidilenYer.getText();

                        JLabel lblTarih = new  JLabel("hangi tarihte gitmek istiyorsunuz");
                        JButton btnTarih1 = new JButton("4 Aralık");
                        JButton btnTarih2 = new JButton("5 Aralık");
                        JButton btnTarih3 = new JButton("6 Aralık");
                        JButton btnTarih4 = new JButton("7 Aralık");
                        JButton btnTarih5 = new JButton("8 Aralık");
                        JButton btnTarih6 = new JButton("9 Aralık");
                        JButton btnTarih7 = new JButton("10 Aralık");

                        frmDemirBilet.getContentPane().add(lblSeferBilgisi);
                        frmDemirBilet.getContentPane().add(txtSeferBilgisi);
                        frmDemirBilet.getContentPane().add(lblGidenYer);
                        frmDemirBilet.getContentPane().add(txtGidenYer);
                        frmDemirBilet.getContentPane().add(lblGidilenYer);
                        frmDemirBilet.getContentPane().add(txtGidilenYer);
                        frmDemirBilet.getContentPane().add(lblTarih);
                        frmDemirBilet.getContentPane().add(btnTarih1);
                        frmDemirBilet.getContentPane().add(btnTarih2);
                        frmDemirBilet.getContentPane().add(btnTarih3);
                        frmDemirBilet.getContentPane().add(btnTarih4);
                        frmDemirBilet.getContentPane().add(btnTarih5);
                        frmDemirBilet.getContentPane().add(btnTarih6);
                        frmDemirBilet.getContentPane().add(btnTarih7);





                        btnTarih1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });
                        btnTarih7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {



                                JFrame frmTarih1 = new JFrame();
                                frmTarih1.setSize(370, 400);
                                frmTarih1.getContentPane().setLayout(new FlowLayout());

                                int sefer = Integer.parseInt(txtSeferBilgisi.getText());

                                for (Transport transport : transport1.transportArrayList) {
                                    if (sefer == transport.getSefer()) {

                                        JLabel lblFirma = new JLabel(transport.getFirmaAdi() + " firmasının");
                                        JLabel lblFirma2 = new JLabel(sefer + ". seferi kullanan firmaların " + transport.getNo() + " 'nolu aracı");
                                        frmTarih1.getContentPane().add(lblFirma);
                                        frmTarih1.getContentPane().add(lblFirma2);

                                    }
                                }

                                JButton btnOdemeSayfasi = new JButton("Odeme sayfasi");


                                JLabel lblFirma3 = new JLabel("Hangi firmayı kullanmak istiyorsun");
                                JTextField txtFirma3 = new JTextField(10);
                                JLabel lblFirma4 = new JLabel("Hangi nolu aracı kullanmak istiyorsun");
                                JTextField txtFirma4 = new JTextField(10);



                                frmTarih1.getContentPane().add(lblFirma3);
                                frmTarih1.getContentPane().add(txtFirma3);
                                frmTarih1.getContentPane().add(lblFirma4);
                                frmTarih1.getContentPane().add(txtFirma4);
                                frmTarih1.getContentPane().add(btnOdemeSayfasi);


                                btnOdemeSayfasi.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame OdemeSayfasi = new JFrame();
                                        OdemeSayfasi.setSize(100, 400);
                                        OdemeSayfasi.getContentPane().setLayout(new FlowLayout());

                                        int nosecme = Integer.parseInt(txtFirma4.getText());


                                        for (Transport transport : transport1.transportArrayList) {

                                            if (txtFirma3.getText().equals(transport.getFirmaAdi()) && nosecme == transport.getNo()) {


                                                for (String[] para : trip.hucret) {
                                                    if (para[0].equals(txtGidenYer.getText()) && para[1].equals(txtGidilenYer.getText())) {
                                                        JLabel lblBiletFiyati = new JLabel("Bilet Fiyatı =  " + para[2]);
                                                        OdemeSayfasi.getContentPane().add(lblBiletFiyati);
                                                        for (Company company1 : companyArrayList) {
                                                            if (transport.getFirmaAdi().equals(company1.getAdi())) {
                                                                company1.setParaKazanma(Integer.parseInt(para[2]));
                                                            }
                                                        }
                                                    }
                                                }

                                                JLabel lblAd =new JLabel("Adiniz");
                                                JTextField txtAd = new JTextField(10);
                                                JLabel lblSoyad =new JLabel("Soyad");
                                                JTextField txtSoyad = new JTextField(10);
                                                JLabel lblTcKimlik =new JLabel("TC kimlik numaranız");
                                                JTextField txtTcKimlik = new JTextField(11);
                                                JLabel lblDogum =new JLabel("Dogum Tarihiniz");
                                                JTextField txtDogum = new JTextField(10);


                                                JButton btnOde = new JButton("Ode");

                                                OdemeSayfasi.getContentPane().add(lblAd);
                                                OdemeSayfasi.getContentPane().add(txtAd);
                                                OdemeSayfasi.getContentPane().add(lblSoyad);
                                                OdemeSayfasi.getContentPane().add(txtSoyad);
                                                OdemeSayfasi.getContentPane().add(lblTcKimlik);
                                                OdemeSayfasi.getContentPane().add(txtTcKimlik);
                                                OdemeSayfasi.getContentPane().add(lblDogum);
                                                OdemeSayfasi.getContentPane().add(txtDogum);
                                                OdemeSayfasi.getContentPane().add(btnOde);




                                                btnOde.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        JOptionPane.showMessageDialog(null, "Bilet Alındı", "BİLGİ", JOptionPane.PLAIN_MESSAGE);
                                                        passanger.setAd(txtAd.getText());
                                                        passanger.setSoyad(txtSoyad.getText());
                                                        passanger.setdogumTarihi(txtDogum.getText());
                                                        passanger.settcKimlik(Integer.parseInt(txtTcKimlik.getText()));

                                                        int a = transport.getKoltukSayisi1() - 1;
                                                        transport.setKoltukSayisi1(a);
                                                        passanger.passangerArrayList.add(passanger);
                                                        passanger.passangerArrayListGecici.add(passanger);


                                                    }


                                                });


                                            }

                                        }


                                        OdemeSayfasi.setVisible(true);
                                    }

                                });


                                frmTarih1.setVisible(true);
                            }


                        });


                        frmDemirBilet.setVisible(true);
                    }
                });

                frmKullanici.setVisible(true);
            }
        });

    }
}