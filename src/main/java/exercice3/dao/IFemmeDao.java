package exercice3.dao;

import exercice3.entities.Femme;

import java.util.Date;
import java.util.List;

public interface IFemmeDao extends IDao<Femme> {
    int countEnfantsEntreDates(int femmeId, Date dateDebut, Date dateFin);
    List<Femme> findFemmesMarieesDeuxFois();
    public Femme findFemmeLaPlusAgee();
}
