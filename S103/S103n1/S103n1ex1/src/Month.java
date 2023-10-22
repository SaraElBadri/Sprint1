import java.util.List;
import java.util.Objects;

public class Month {
    private String nom;

    public Month(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  nom ;
    }


    // per asegurar que no hi ha duplicats
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(nom, month.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
