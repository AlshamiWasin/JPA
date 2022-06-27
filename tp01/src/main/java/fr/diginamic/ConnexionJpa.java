package fr.diginamic;

import javax.persistence.*;

public class ConnexionJpa {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bdjava");
        EntityManager em = entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        ElementChimique elementChimique1 = new ElementChimique();
        elementChimique1.setElNom("test");
        elementChimique1.setElMasseAtomique(100);
        elementChimique1.setElSymbole("Te");
        elementChimique1.setElNumAtomique(1000);

        em.persist(elementChimique1);

        em.getTransaction().commit();

    }

}
