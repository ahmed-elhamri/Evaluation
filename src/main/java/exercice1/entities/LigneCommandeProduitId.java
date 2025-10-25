package exercice1.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LigneCommandeProduitId implements Serializable {

    @Column(name = "commande_id")
    private int commandeId;

    @Column(name = "produit_id")
    private int produitId;

    public LigneCommandeProduitId() {}

    public LigneCommandeProduitId(int commandeId, int produitId) {
        this.commandeId = commandeId;
        this.produitId = produitId;
    }

    public int getCommandeId() { return commandeId; }
    public void setCommandeId(int commandeId) { this.commandeId = commandeId; }

    public int getProduitId() { return produitId; }
    public void setProduitId(int produitId) { this.produitId = produitId; }

    @Override
    public int hashCode() {
        return Objects.hash(commandeId, produitId);
    }
}
