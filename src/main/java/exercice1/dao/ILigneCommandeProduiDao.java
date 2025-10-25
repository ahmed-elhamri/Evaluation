package exercice1.dao;

import exercice1.entities.LigneCommandeProduit;
import exercice1.entities.LigneCommandeProduitId;

public interface ILigneCommandeProduiDao extends IDao<LigneCommandeProduit> {
    LigneCommandeProduit findById(LigneCommandeProduitId id);
}
