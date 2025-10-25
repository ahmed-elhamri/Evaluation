package exercice2.presentation;

import exercice1.dao.IDao;
import exercice1.dao.IProduitDao;
import exercice1.entities.Categorie;
import exercice1.entities.Commande;
import exercice1.entities.LigneCommandeProduit;
import exercice1.entities.Produit;
import exercice2.dao.IEmployeDao;
import exercice2.dao.IEmployeTacheDao;
import exercice2.dao.IProjetDao;
import exercice2.dao.ITacheDao;
import exercice2.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

import java.util.Date;
import java.util.List;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IEmployeDao employeService = context.getBean("employeServcie", IEmployeDao.class);
        IProjetDao projetService = context.getBean("projetService", IProjetDao.class);
        ITacheDao tacheService = context.getBean("tacheService", ITacheDao.class);
        IEmployeTacheDao employeTacheService = context.getBean("employeTacheService", IEmployeTacheDao.class);

//        // ---- Employes ----
//        Employe e1 = new Employe();
//        e1.setNom("Elhamri");
//        e1.setPrenom("Ahmed");
//        e1.setTelephone("0600000000");
//
//        Employe e2 = new Employe();
//        e2.setNom("Bennani");
//        e2.setPrenom("Youssef");
//        e2.setTelephone("0600000000");
//
//        employeService.create(e1);
//        employeService.create(e2);
//
//
//        // ---- Projets ----
//        Projet p1 = new Projet();
//        p1.setNom("Système RH");
//        p1.setDateDebut(new Date());
//        p1.setDateFin(new Date());
//        p1.setChef(e1);
//
//        projetService.create(p1);
//
//        // ---- Tâches ----
//        Tache t1 = new Tache();
//        t1.setNom("Backend API");
//        t1.setNom("Développer l’API du module RH");
//        t1.setDateDebut(new Date());
//        t1.setDateFin(new Date());
//        t1.setPrix(200);
//        t1.setProjet(p1);
//
//        Tache t2 = new Tache();
//        t2.setNom("Frontend React");
//        t2.setDateDebut(new Date());
//        t2.setDateFin(new Date());
//        t2.setPrix(200);
//        t2.setProjet(p1);
//
//        tacheService.create(t1);
//        tacheService.create(t2);
//
//        // ---- EmployeTache ----
//        EmployeTache et1 = new EmployeTache();
//        et1.setDateDebutReelle(new Date());
//        et1.setDateFinReelle(new Date());
//        et1.setEmploye(e2);
//        et1.setTache(t1);
//        et1.setId(new EmployeTacheId(e1.getId(), t1.getId()));
//        employeTacheService.create(et1);
//
//        EmployeTache et2 = new EmployeTache();
//        et2.setDateDebutReelle(new Date());
//        et2.setDateFinReelle(new Date());
//        et2.setEmploye(e2);
//        et2.setTache(t2);
//        et2.setId(new EmployeTacheId(e2.getId(), t2.getId()));
//        employeTacheService.create(et2);

        // ---- findTachesRealiseesByEmploye ----
        Employe employe2 = employeService.findById(2);
        List<Tache> taches = employeService.findTachesRealiseesByEmploye(employe2.getId());
        System.out.println("==== Taches Realisees par " + employe2.getNom() + " ====");
        for (Tache tache : taches) {
            System.out.println(tache.getNom());
        }

        // ---- findProjetsGeresByEmploye ----
//        Employe employe1 = employeService.findById(1);
//        List<Projet> projets = employeService.findProjetsGeresByEmploye(employe1.getId());
//        System.out.println("==== Projets Geres par " + employe1.getNom() + " ====");
//        for (Projet projet : projets) {
//            System.out.println(projet.getNom());
//        }

        // findTachesPlanifieesByProjet
        Projet projet1 = projetService.findById(1);
//        System.out.println("==== Taches Planifiees par " + projet1.getNom() + " ====");
//        List<Tache> taches1 = projetService.findTachesPlanifieesByProjet(projet1.getId());
//        for (Tache tache : taches1) {
//            System.out.println(tache.getNom());
//        }

        // findTachesRealiseesByProjet
//        System.out.println("==== Taches Realisees par " + projet1.getNom() + " ====");
//        List<Tache> taches2 = projetService.findTachesRealiseesByProjet(projet1.getId());
//        for (Tache tache : taches2) {
//            System.out.println(tache.getNom());
//        }

        // findTachesPrixSup1000
        System.out.println("==== Prix Des Taches Superieur a 1000 ====");
        List<Tache> taches3 = tacheService.findTachesPrixSup1000();
        for (Tache tache : taches3) {
            System.out.println(tache.getNom());
        }

        // findTachesRealiseesEntreDates
//        System.out.println("==== Taches Entre Deux Dates ====");
//        List<Tache> taches4 = tacheService.findTachesRealiseesEntreDates(new Date(2025, 10, 1, 0, 0, 0), new Date(2025, 10, 30, 0, 0, 0));
//        for (Tache tache : taches4) {
//            System.out.println(tache.getNom());
//        }

        // Exemple d’affichage
//        System.out.println("==== Exemple d’affichage ====");
//        System.out.println("Projet: " + projet1.getId() + "\t Nom: " + projet1.getNom() + "\t Date debut: " + projet1.getDateDebut());
//        System.out.println("Liste des taches: ");
//        System.out.println("Num \t Nom \t Date Debut Reelle \t Date Fin Reelle");
//        for (Tache tache : projetService.findTachesRealiseesByProjet(projet1.getId())) {
//            System.out.println(tache.getId() + " \t " + tache.getNom() + " \t " + tache.getDateDebut() + " \t " + tache.getDateFin());
//        }
    }
}
