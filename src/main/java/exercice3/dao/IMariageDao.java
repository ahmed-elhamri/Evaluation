package exercice3.dao;

import exercice3.entities.Mariage;
import exercice3.entities.MariageId;

public interface IMariageDao extends IDao<Mariage> {
    Mariage findById(MariageId id);
}
