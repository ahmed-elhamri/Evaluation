package exercice1.entities;

import javax.persistence.*;

@Entity
public class LigneCommandeProduit {

    @EmbeddedId
    private LigneCommandeProduitId id;

    private int quantite;

    @MapsId("produitId")
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @MapsId("commandeId")
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    public LigneCommandeProduit() {}

    public LigneCommandeProduit(Commande commande, Produit produit, int quantite) {
        this.commande = commande;
        this.produit = produit;
        this.quantite = quantite;
        this.id = new LigneCommandeProduitId(commande.getId(), produit.getId());
    }

    public LigneCommandeProduitId getId() { return id; }
    public void setId(LigneCommandeProduitId id) { this.id = id; }

    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

    public Produit getProduit() { return produit; }
    public void setProduit(Produit produit) { this.produit = produit; }

    public Commande getCommande() { return commande; }
    public void setCommande(Commande commande) { this.commande = commande; }
}
