package exercice2.dao;

import exercice2.entities.Projet;
import exercice2.entities.Tache;

import java.util.List;

public interface IProjetDao extends IDao<Projet> {
    public List<Tache> findTachesPlanifieesByProjet(int idProjet);
    public List<Tache> findTachesRealiseesByProjet(int idProjet);
}
