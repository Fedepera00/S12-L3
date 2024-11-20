import esercizio1.Rettangolo;
import esercizio2.SIM;
import esercizio3.Articolo;
import esercizio3.Cliente;
import esercizio3.Carrello;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Da quale esercizio vogliamo partire:?");
        System.out.println("1 - Rettangolo");
        System.out.println("2 - SIM");
        System.out.println("3 - E-commerce");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1 -> {
                Rettangolo rettangolo1 = new Rettangolo(5, 10);
                Rettangolo rettangolo2 = new Rettangolo(7, 3);
                Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
            }
            case 2 -> {
                SIM miaSim = new SIM("3354856578_mioNumero");
                miaSim.aggiungiChiamata("3374596478", 10);
                miaSim.aggiungiChiamata("3362145687", 5);
                miaSim.aggiungiChiamata("3388447496", 3);
                miaSim.aggiungiChiamata("3365489574", 20);
                miaSim.aggiungiChiamata("33625987416", 15);
                miaSim.aggiungiChiamata("32554874188", 8);
                miaSim.stampaDatiSIM();
            }
            case 3 -> {
                Cliente cliente = new Cliente("C1", "Federico", "Peralta", "federico.peralta91@gmail.com", LocalDate.now());
                Articolo articolo1 = new Articolo("A1", "Macbook", 1000.0, 5);
                Articolo articolo2 = new Articolo("A2", "Tastiera", 20.0, 10);
                Carrello carrello = new Carrello(cliente);
                carrello.aggiungiArticolo(articolo1, 1);
                carrello.aggiungiArticolo(articolo2, 2);
                carrello.stampaDettagli();
            }
            default -> System.out.println("Scelta non valida");
        }

        scanner.close();
    }
}