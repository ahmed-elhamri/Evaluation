package exercice2.dao;

import exercice1.entities.Produit;
import exercice2.entities.Employe;
import exercice2.entities.Projet;
import exercice2.entities.Tache;

import java.util.Date;
import java.util.List;

public interface IEmployeDao extends IDao<Employe> {
    List<Tache> findTachesRealiseesByEmploye(int idEmploye);
    List<Projet> findProjetsGeresByEmploye(int idEmploye);
}