package exercice2.dao;

import exercice1.entities.LigneCommandeProduit;
import exercice2.entities.EmployeTache;
import exercice2.entities.EmployeTacheId;

public interface IEmployeTacheDao extends  IDao<EmployeTache> {
    EmployeTache findById(EmployeTacheId id);
}
