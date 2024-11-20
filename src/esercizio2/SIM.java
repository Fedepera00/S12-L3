package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;

    // MI CHIAMO IL COSTRUTTORE
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new ArrayList<>();
    }

    // AGGIUNGO CHIAMATA MAX 5 TELEFONATE
    public void aggiungiChiamata(String numeroChiamato, int durata) {
        if (chiamate.size() == 5) {
            chiamate.remove(0);
        }
        chiamate.add(new Chiamata(numeroChiamato, durata));
    }

    // DETTAGLI CREDITO, CHIAMATE, NUMERO DI TELEFONO E EURO DELL SIM TELEFONICA
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito: " + credito + " euro");
        System.out.println("Ultime 5 chiamate:");
        for (Chiamata chiamata : chiamate) {
            chiamata.stampaChiamata();
        }
    }
}