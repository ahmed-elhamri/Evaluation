package exercice2.dao;

import exercice2.entities.Tache;

import java.util.Date;
import java.util.List;

public interface ITacheDao extends IDao<Tache>{
    public List<Tache> findTachesPrixSup1000();
    public List<Tache> findTachesRealiseesEntreDates(Date dateDebut, Date dateFin);
}
