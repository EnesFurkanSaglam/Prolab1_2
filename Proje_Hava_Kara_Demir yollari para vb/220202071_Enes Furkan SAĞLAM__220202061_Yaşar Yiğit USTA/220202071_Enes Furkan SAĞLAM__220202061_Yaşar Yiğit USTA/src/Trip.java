/*
Seferleri temsil eden bir classtır. Her seferin bir aracı, guzergahı,zamanı, fiyatı gibi bilgiler bulunmalıdır.
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.*;


public class Trip {




    ArrayList<String[]> kucret = new ArrayList<String[]>();
    ArrayList<String[]> ducret = new ArrayList<String[]>();
    ArrayList<String[]> hucret = new ArrayList<String[]>();


    public void addKucret() {
        kucret.add(new String[]{"Istanbul","Kocaeli","50"});
        kucret.add(new String[]{"Istanbul","Ankara","300"});
        kucret.add(new String[]{"Istanbul","Eskisehir","150"});
        kucret.add(new String[]{"Istanbul","Konya","150"});
        kucret.add(new String[]{"Kocaeli", "Istanbul", "50"});
        kucret.add(new String[]{"Kocaeli", "Ankara", "400"});
        kucret.add(new String[]{"Kocaeli", "Eskisehir", "100"});
        kucret.add(new String[]{"Kocaeli", "Konya", "250"});
        kucret.add(new String[]{"Ankara", "Istanbul", "300"});
        kucret.add(new String[]{"Ankara", "Kocaeli", "400"});
        kucret.add(new String[]{"Eskisehir", "Istanbul", "150"});
        kucret.add(new String[]{"Eskisehir", "Kocaeli", "100"});
        kucret.add(new String[]{"Eskisehir", "Konya", "150"});
        kucret.add(new String[]{"Konya", "Istanbul", "300"});
        kucret.add(new String[]{"Konya", "Kocaeli", "250"});
        kucret.add(new String[]{"Konya", "Eskisehir", "150"});
    }

    public void addDucret() {

        ducret.add(new String[]{"Istanbul", "Kocaeli", "50"});
        ducret.add(new String[]{"Istanbul", "Bilecik", "150"});
        ducret.add(new String[]{"Istanbul", "Ankara", "250"});
        ducret.add(new String[]{"Istanbul", "Eskisehir", "200"});
        ducret.add(new String[]{"Istanbul", "Konya", "300"});
        ducret.add(new String[]{"Kocaeli", "Istanbul", "50"});
        ducret.add(new String[]{"Kocaeli", "Bilecik", "50"});
        ducret.add(new String[]{"Kocaeli", "Ankara", "200"});
        ducret.add(new String[]{"Kocaeli", "Eskisehir", "100"});
        ducret.add(new String[]{"Kocaeli", "Konya", "250"});
        ducret.add(new String[]{"Bilecik", "Istanbul", "150"});
        ducret.add(new String[]{"Bilecik", "Kocaeli", "50"});
        ducret.add(new String[]{"Bilecik", "Ankara", "150"});
        ducret.add(new String[]{"Bilecik", "Eskisehir", "50"});
        ducret.add(new String[]{"Bilecik", "Konya", "200"});
        ducret.add(new String[]{"Bilecik", "Konya", "200"});
        ducret.add(new String[]{"Ankara", "Istanbul", "250"});
        ducret.add(new String[]{"Ankara", "Kocaeli", "200"});
        ducret.add(new String[]{"Ankara", "Bilecik", "150"});
        ducret.add(new String[]{"Ankara", "Eskisehir", "100"});
        ducret.add(new String[]{"Eskisehir", "Istanbul", "200"});
        ducret.add(new String[]{"Eskisehir", "Kocaeli", "100"});
        ducret.add(new String[]{"Eskisehir", "Bilecik", "50"});
        ducret.add(new String[]{"Eskisehir", "Ankara", "100"});
        ducret.add(new String[]{"Eskisehir", "Konya", "150"});
        ducret.add(new String[]{"Konya", "Istanbul", "300"});
        ducret.add(new String[]{"Konya", "Kocaeli", "250"});
        ducret.add(new String[]{"Konya", "Bilecik", "200"});
        ducret.add(new String[]{"Konya", "Eskisehir", "150"});
    }

    public void addHucret() {
        hucret.add(new String[]{"Istanbul", "Ankara", "1000"});
        hucret.add(new String[]{"Istanbul", "Konya", "1200"});
        hucret.add(new String[]{"Ankara", "Istanbul", "1000"});
        hucret.add(new String[]{"Konya", "Istanbul", "1200"});
    }

}
