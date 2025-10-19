package exercice3.dao;

import exercice3.entities.Femme;
import exercice3.entities.Homme;

import java.util.Date;
import java.util.List;

public interface IHommeDao extends IDao<Homme> {
    List<Femme> findEpouses(int hommeId);
    List<Object[]> findMariagesDetails(int hommeId);
    List<Object[]> findMariagesEchoues(int hommeId);
    List<Homme> countHommesMarieQuatreFemmesEntreDates(Date dateDebut, Date dateFin);
}