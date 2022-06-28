import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ConnexionJpa {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");

    public static void main(String[] args) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        Adresse adresse = new Adresse(1,"test1" , 56000,"test1");

        List<Client> clientList = new ArrayList<>();


        Client client1 = new Client("test1" , "test1" , LocalDate.now() ,adresse, new ArrayList<Compte>() ,new Banque("test1" ,new ArrayList<Client>()) );
        Client client2 = new Client("test2" , "test2" , LocalDate.now(), adresse, new ArrayList<Compte>() ,new Banque("test2" ,new ArrayList<Client>())  );
        clientList.add(client1);
        clientList.add(client2);

        List<Operation> operationList = new ArrayList<>();

        Compte compte1 = new Compte("1" , 100d,clientList,  operationList);

        Compte compte2 = new Compte("2" , 200d,clientList,  operationList);

        List<Compte> compteList = new ArrayList<>();
        compteList.add(compte1);
        compteList.add(compte2);

        Banque banque = new Banque();
        banque.setNom("best banque");

        Client clientAvec2Compte = new Client( "alchami" , "waseem" , LocalDate.of(1999,1,10) , new Adresse(1,"bougainville" , 56000,"vannes"),compteList,banque);

        clientAvec2Compte.setBanque(banque);

        compte1.getClients().add(clientAvec2Compte);
        compte2.getClients().add(clientAvec2Compte);

        List<Client> clientsAssuranceEtLivreta = new ArrayList<>();
        clientsAssuranceEtLivreta.add(clientAvec2Compte);

        List<Operation> operationsAssuranceEtLivreta = new ArrayList<>();



        AssuranceVie assuranceVie = new AssuranceVie("assuranceVie1" , 100d,clientsAssuranceEtLivreta,  operationsAssuranceEtLivreta, LocalDate.now().plusDays(5) , 2.1d);


        LivretA livretA = new LivretA("livretA1" , 100d,clientsAssuranceEtLivreta,  operationsAssuranceEtLivreta , 2.0d);

        clientAvec2Compte.getComptes().add(assuranceVie);
        clientAvec2Compte.getComptes().add(livretA);

        Operation operation = new Operation(LocalDate.now() , 100d , "why not 1");

        Virement virement = new Virement(LocalDate.now() , 100d , "why not 1" , "waseem");

        compte1.getOperations().add(operation);
        compte1.getOperations().add(virement);

        operation.setCompte(compte1);
        virement.setCompte(compte1);

        em.persist(client1);
        em.persist(client2);
        em.persist(banque);
        em.persist(compte1);
        em.persist(compte2);
        em.persist(assuranceVie);
        em.persist(operation);
        em.persist(virement);
        em.persist(livretA);
        em.persist(clientAvec2Compte);



        em.getTransaction().commit();


        for (Compte compte : clientAvec2Compte.getComptes()) {
            System.out.println(compte.getClients());
        }

        System.out.println("####################");

        for (Operation compte1Operation : compte1.getOperations()) {
            System.out.println(compte1Operation.toString());
        }

    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
