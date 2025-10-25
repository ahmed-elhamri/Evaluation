package exercice1.dao;

import exercice1.entities.LigneCommandeProduit;
import exercice1.entities.LigneCommandeProduitId;

import java.util.List;

public interface IDao<T> {
    boolean create(T o);
    boolean delete(T o);
    boolean update(T o);
    T findById(int id);
    List<T> findAll();
}