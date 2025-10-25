package exercice3.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Mariage {
    @EmbeddedId
    private MariageId id;

    private Date dateDebut;
    private Date dateFin;
    private int nbrEnfant;

    @MapsId("hommeId")
    @ManyToOne
    @JoinColumn(name = "homme_id")
    private Homme homme;

    @MapsId("femmeId")
    @ManyToOne
    @JoinColumn(name = "femme_id")
    private Femme femme;

    public Mariage() {
    }

    public MariageId getId() {
        return id;
    }

    public void setId(MariageId id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public Homme getHomme() {
        return homme;
    }

    public void setHomme(Homme homme) {
        this.homme = homme;
    }

    public Femme getFemme() {
        return femme;
    }

    public void setFemme(Femme femme) {
        this.femme = femme;
    }
}
