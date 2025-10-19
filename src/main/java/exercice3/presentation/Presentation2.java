package exercice3.presentation;

import exercice3.dao.IDao;
import exercice3.dao.IFemmeDao;
import exercice3.dao.IHommeDao;
import exercice3.entities.Femme;
import exercice3.entities.Homme;
import exercice3.entities.Mariage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

import java.util.Date;
import java.util.List;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IHommeDao hommeService = context.getBean("hommeService", IHommeDao.class);
        IFemmeDao femmeService = context.getBean("femmeService", IFemmeDao.class);
        IDao<Mariage> mariageService = context.getBean("mariageService", IDao.class);

        /*
        // ---- Homme ----
        Homme h1 = new Homme();
        h1.setNom("Amrani");
        h1.setPrenom("Youssef");
        h1.setTelephone("0600000000");
        h1.setAdresse("adresse1");
        h1.setDateNaissance(new Date());
        hommeService.create(h1);

        Homme h2 = new Homme();
        h2.setNom("Fakir");
        h2.setPrenom("Mehdi");
        h2.setTelephone("0600000000");
        h2.setAdresse("adresse2");
        h2.setDateNaissance(new Date());
        hommeService.create(h2);

        Homme  h3 = new Homme();
        h3.setNom("Tazi");
        h3.setPrenom("Anas");
        h3.setTelephone("0600000000");
        h3.setAdresse("adresse3");
        h3.setDateNaissance(new Date());
        hommeService.create(h3);

        Homme  h4 = new Homme();
        h4.setNom("Ouazzani");
        h4.setPrenom("Karim");
        h4.setTelephone("0600000000");
        h4.setAdresse("adresse4");
        h4.setDateNaissance(new Date());
        hommeService.create(h4);

        Homme  h5 = new Homme();
        h5.setNom("Benomar");
        h5.setPrenom("Rachid");
        h5.setTelephone("0600000000");
        h5.setAdresse("adresse5");
        h5.setDateNaissance(new Date());
        hommeService.create(h5);

        // Femme
        Femme f1 = new Femme();
        f1.setNom("Berrada");
        f1.setPrenom("Lina");
        f1.setTelephone("0600000000");
        f1.setAdresse("adresse1");
        f1.setDateNaissance(new Date());
        femmeService.create(f1);

        Femme f2 = new Femme();
        f2.setNom("Mansouri");
        f2.setPrenom("Sofia");
        f2.setTelephone("0600000000");
        f2.setAdresse("adresse2");
        f2.setDateNaissance(new Date());
        femmeService.create(f2);

        Femme f3 = new Femme();
        f3.setNom("Haddad");
        f3.setPrenom("Amal");
        f3.setTelephone("0600000000");
        f3.setAdresse("adresse3");
        f3.setDateNaissance(new Date());
        femmeService.create(f3);

        Femme f4 = new Femme();
        f4.setNom("Cherkaoui");
        f4.setPrenom("Yasmina");
        f4.setTelephone("0600000000");
        f4.setAdresse("adresse4");
        f4.setDateNaissance(new Date());
        femmeService.create(f4);

        Femme f5 = new Femme();
        f5.setNom("Idrissi");
        f5.setPrenom("Salma");
        f5.setTelephone("0600000000");
        f5.setAdresse("adresse5");
        f5.setDateNaissance(new Date());
        femmeService.create(f5);

        Femme f6 = new Femme();
        f6.setNom("Rahimi");
        f6.setPrenom("Nawal");
        f6.setTelephone("0600000000");
        f6.setAdresse("adresse6");
        f6.setDateNaissance(new Date());
        femmeService.create(f6);

        Femme f7 = new Femme();
        f7.setNom("Khatib");
        f7.setPrenom("Laila");
        f7.setTelephone("0600000000");
        f7.setAdresse("adresse7");
        f7.setDateNaissance(new Date());
        femmeService.create(f7);

        Femme f8 = new Femme();
        f8.setNom("Benali");
        f8.setPrenom("Imane");
        f8.setTelephone("0600000000");
        f8.setAdresse("adresse8");
        f8.setDateNaissance(new Date());
        femmeService.create(f8);

        Femme f9 = new Femme();
        f9.setNom("Douiri");
        f9.setPrenom("Amina");
        f9.setTelephone("0600000000");
        f9.setAdresse("adresse9");
        f9.setDateNaissance(new Date());
        femmeService.create(f9);

        Femme f10 = new Femme();
        f10.setNom("Zahraoui");
        f10.setPrenom("Karima");
        f10.setTelephone("0600000000");
        f10.setAdresse("adresse10");
        f10.setDateNaissance(new Date());
        femmeService.create(f10);

        // Mariage
        Mariage m1 = new Mariage();
        m1.setDateDebut(new Date());
        m1.setDateFin(new Date());
        m1.setHomme(h1);
        m1.setFemme(f1);
        m1.setNbrEnfant(2);
        mariageService.create(m1);

        Mariage m2 = new Mariage();
        m2.setDateDebut(new Date());
        m2.setDateFin(new Date());
        m2.setHomme(h2);
        m2.setFemme(f2);
        m2.setNbrEnfant(1);
        mariageService.create(m2);

        Mariage m3 = new Mariage();
        m3.setDateDebut(new Date());
        m3.setDateFin(new Date());
        m3.setHomme(h3);
        m3.setFemme(f3);
        m3.setNbrEnfant(2);
        mariageService.create(m3);

        Mariage m4 = new Mariage();
        m4.setDateDebut(new Date());
        m4.setDateFin(new Date());
        m4.setHomme(h4);
        m4.setFemme(f4);
        m4.setNbrEnfant(1);
        mariageService.create(m4);

        Mariage m5 = new Mariage();
        m5.setDateDebut(new Date());
        m5.setDateFin(new Date());
        m5.setHomme(h5);
        m5.setFemme(f5);
        m5.setNbrEnfant(2);
        mariageService.create(m5);
        */

        System.out.println("==== La liste des femmes ====");
        for (Femme femme : femmeService.findAll()) {
            System.out.println(femme);
        }

        System.out.println("==== La femme la plus âgée ====");
        System.out.println(femmeService.findFemmeLaPlusAgee());

        Homme homme = hommeService.findById(1);
        System.out.println("===== Les épouses de : " + homme.getNom() + " =====");
        for (Femme femme : hommeService.findEpouses(homme.getId())) {
            System.out.println(femme);
        }

        Femme f = femmeService.findById(6);
        System.out.println("==== Le nombre d’enfants de " + f.getNom() + " entre deux dates ====");
        System.out.println(femmeService.countEnfantsEntreDates(f.getId(), new Date(110, 0, 1), new Date(126, 0, 1)));

        System.out.println("====  Les femmes mariées deux fois ou plus =====");
        for (Femme femme : femmeService.findFemmesMarieesDeuxFois()) {
            System.out.println(femme);
        }


        System.out.println("==== Les hommes mariés à quatre femmes entre deux dates ====");
        for (Homme h : hommeService.countHommesMarieQuatreFemmesEntreDates(new Date(110, 0, 1), new Date(126, 0, 1))){
            System.out.println(h);
        }

        System.out.println("==== Les mariages d’un homme avec tous les détails ====");
        System.out.println("Nom: " + homme.getNom() + " " + homme.getPrenom());
        System.out.println("Mariages En Cours :");
        for (Object[] obj: hommeService.findMariagesDetails(homme.getId())) {
            System.out.println("Femme: " + obj[0] + " " + obj[1] + "\t Date Debut: " + obj[2] + "\t Nombre d'enfants: " + obj[3]);
        }
        System.out.println("Mariages échoués :");
        for (Object[] obj: hommeService.findMariagesEchoues(homme.getId())) {
            System.out.println("Femme: " + obj[0] + " " + obj[1] + "\t Date Debut: " + obj[2] + "\t Date Fin: " + obj[3] + "\t Nombre d'enfants: " + obj[4]);
        }

    }
}
