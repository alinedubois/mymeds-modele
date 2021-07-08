import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pharmacie {
    private List<Medicament> medicaments;

    public Pharmacie() {
        this.medicaments = new ArrayList<>();
    }

    public void ajouterMedicament (String nom, LocalDate dateExpiration, String forme){
        Medicament medicament=new Medicament(nom, dateExpiration, new Forme(forme));
        medicaments.add(medicament);
    }

    public boolean contient(String nomMedicament){
        return medicaments.stream().anyMatch(medicament -> medicament.nom().equals(nomMedicament));
    }
}
