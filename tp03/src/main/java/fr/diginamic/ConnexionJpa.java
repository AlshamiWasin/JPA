package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConnexionJpa {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaTp02");


    public static void main(String[] args) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        // TP-02
//        Livre livre = new Livre();
//        livre.setAuteur("auteur");
//        livre.setTitre("le titre");
//        em.persist(livre);


//        Client client = em.find(Client.class, 1);
//        if (client != null) {
//            Emprunt emprunt = new Emprunt(
//                    LocalDateTime.now(),
//                    LocalDateTime.now().plusWeeks(2L),
//                    10,
//                    client
//            );
//            em.persist(emprunt);
//        }


        // Réaliser une requête qui permet d’extraire un emprunt en fonction son id.
        Emprunt emprunt = em.find(Emprunt.class, 1);

        // Affichez tous les livres associés
        System.out.println("Livres associés à l'emprunt 1");
        emprunt.getLivres().forEach(System.out::println);

        // Réaliser une requête qui permet d’extraire tous les emprunts d’un client donné.
        System.out.println("emprunts du client 1");
        TypedQuery<Emprunt> empruntsDunClient = em.createQuery("select e from Emprunt e where client=:id", Emprunt.class);
        Client toFind = new Client();
        toFind.setID(1);
        empruntsDunClient.setParameter("id", toFind);
        List<Emprunt> emprunts = empruntsDunClient.getResultList();
        emprunts.forEach(System.out::println);

        em.getTransaction().commit();
    }
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
