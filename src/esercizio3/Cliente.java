package esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    // MI CHIAMO IL COSTRUTTORE
    public Cliente(String codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    // GET
    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    // DETTAGLI NOME , EMAIL , CODICE CLIENTE, DATA D'ISCRIZIONE.
    public void stampaDettagli() {
        System.out.println("Codice Cliente: " + codiceCliente);
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Email: " + email);
        System.out.println("Data Iscrizione: " + dataIscrizione);
    }
}