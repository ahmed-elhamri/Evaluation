package exercice3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("HOMME")
public class Homme extends Personne {

    @OneToMany(mappedBy="homme")
    private List<Mariage> mariages;

    public Homme() {
    }

    public List<Mariage> getMariages() {
        return mariages;
    }

    public void setMariages(List<Mariage> mariages) {
        this.mariages = mariages;
    }

}
