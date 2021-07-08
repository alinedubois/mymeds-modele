import java.time.LocalDate;

public class Medicament {
    private String nom;
    private LocalDate dateExpiration;
    private Forme forme;

    public Medicament(String nom, LocalDate dateExpiration, Forme forme) {
        this.nom = nom;
        this.dateExpiration = dateExpiration;
        this.forme = forme;
    }

    public String nom() {
        return this.nom;
    }
}
