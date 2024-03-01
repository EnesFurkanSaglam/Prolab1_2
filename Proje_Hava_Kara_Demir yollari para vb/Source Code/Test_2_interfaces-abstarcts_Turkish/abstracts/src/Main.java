import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //abstarctlar soyuttur classlarla farkı yoktur kullanım farkı vardır



        Scanner scanner = new Scanner(System.in);
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();

        System.out.println("Adinizi giriniz");
        womanGameCalculator.ad(scanner.nextLine());



        womanGameCalculator.hesapla();

    }
}