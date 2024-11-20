package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente clienteAssociato;
    private List<Articolo> articoli;
    private double costoTotale;

    // MI CHIAMO IL COSTRUTTORE
    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = new ArrayList<>();
        this.costoTotale = 0.0;
    }

    // AGGIUNGERE AL CARRELLO
    public void aggiungiArticolo(Articolo articolo, int quantita) {
        if (articolo.getDisponibilitaMagazzino() >= quantita) {
            articoli.add(articolo);
            costoTotale += articolo.getPrezzo() * quantita;
            articolo.diminuisciDisponibilita(quantita);
            System.out.println("Articolo aggiunto al carrello: " + articolo.getDescrizione() + " (Quantità: " + quantita + ")");
        } else {
            System.out.println("Quantità non disponibile per l'articolo: " + articolo.getDescrizione());
        }
    }

    // STAMPARE I DATI CHE ABBIAMO NEL CARRELO , COSTO TOTALE, CLIENTE , ARTICOLI.
    public void stampaDettagli() {
        System.out.println("Cliente Associato:");
        clienteAssociato.stampaDettagli();
        System.out.println("Articoli nel Carrello:");
        for (Articolo articolo : articoli) {
            articolo.stampaDettagli();
        }
        System.out.println("Costo Totale: " + costoTotale + " EUR");
    }
}