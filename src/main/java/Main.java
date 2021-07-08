import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Pharmacie pharmacie = new Pharmacie();
        pharmacie.ajouterMedicament("Doliprane", LocalDate.of(2022, Month.JUNE, 5), "gélule");
        pharmacie.ajouterMedicament("Spasfon", LocalDate.of(2022, Month.JUNE, 5), "comprimé");
        System.out.println("La pharmacie contient du Doliprane : " + pharmacie.contient("Doliprane"));
    }
}
