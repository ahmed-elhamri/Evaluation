package exercice2.entities;

import exercice1.entities.LigneCommandeProduitId;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EmployeTache {

    @EmbeddedId
    private EmployeTacheId id;
    private Date dateDebutReelle;
    private Date dateFinReelle;

    @MapsId("employeId")
    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    @MapsId("tacheId")
    @ManyToOne
    @JoinColumn(name = "tache_id")
    private Tache tache;

    public EmployeTache() {
    }

    public EmployeTacheId getId() {
        return id;
    }

    public void setId(EmployeTacheId id) {
        this.id = id;
    }

    public Date getDateDebutReelle() {
        return dateDebutReelle;
    }

    public void setDateDebutReelle(Date dateDebutReelle) {
        this.dateDebutReelle = dateDebutReelle;
    }

    public Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }
}