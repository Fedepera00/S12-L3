package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    // COSTRUTTORE
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // AREA
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // PERIMETRO
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Rettangolo:");
        System.out.println("Altezza: " + altezza + ", Larghezza: " + larghezza);
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    // STAMPO AREA E PERIMETRO DI ENTRAMBI
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Dettagli del primo rettangolo:");
        r1.stampaRettangolo();
        System.out.println("Dettagli del secondo rettangolo:");
        r2.stampaRettangolo();
        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}