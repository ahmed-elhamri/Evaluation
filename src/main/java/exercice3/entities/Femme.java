package exercice3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("FEMME")
@NamedQuery(
        name = "Femme.findMarieesDeuxFois",
        query = "select f from Femme f where size(f.mariages) >= 2"
)
@NamedNativeQuery(
        name = "Femme.countEnfantsEntreDates",
        query = "SELECT SUM(m.nbrEnfant) FROM Mariage m JOIN Personne p WHERE p.id = :femmeId AND m.dateDebut >= :dateDebut AND m.dateDebut <= :dateFin"
)
public class Femme extends Personne {

    @OneToMany(mappedBy="femme")
    private List<Mariage> mariages;

    public Femme() {
    }

    public List<Mariage> getMariages() {
        return mariages;
    }

    public void setMariages(List<Mariage> mariages) {
        this.mariages = mariages;
    }



}