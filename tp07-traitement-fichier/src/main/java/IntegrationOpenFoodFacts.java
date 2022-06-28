import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IntegrationOpenFoodFacts {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");

    public static void main(String[] args) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();


        em.getTransaction().commit();
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
