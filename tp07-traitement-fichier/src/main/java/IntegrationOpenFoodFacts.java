import BO.*;
import DAL.ProduitDAO;
import bll.ProduitManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IntegrationOpenFoodFacts {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
    static ProduitManager produitManager = new ProduitManager(new ProduitDAO(getEntityManager()));

    public static final String delimiter = "\\|";

    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        String csvFile = "D:\\Mohammas wasin\\Documents\\diginamic\\cours\\JPA\\tp\\JPA\\tp07-traitement-fichier\\src\\main\\java\\DAL\\open-food-facts.csv";

        em.getTransaction().begin();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                if (tempArr.length == 30){

                    System.out.println(produitManager.read(tempArr));

                    System.out.println("###########################################");
                    System.out.println("###########################################");

                }
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }






        em.getTransaction().commit();
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
