package fr.diginamic;

public class ConnexionJpa {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaTp02");
        EntityManager em = entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        Livre livre = em.find(Livre.class, 1);

        System.out.println(livre.toString());

        em.getTransaction().commit();
    }

}
