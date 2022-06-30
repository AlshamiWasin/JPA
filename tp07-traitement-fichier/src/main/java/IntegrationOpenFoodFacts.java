import DAL.ProduitDAO;
import bll.ProduitManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IntegrationOpenFoodFacts {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("OpenFoodFacts");


    public static final String delimiter = "\\|";

    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        ProduitManager produitManager = new ProduitManager(new ProduitDAO(em));

        String csvFile = "D:\\Mohammas wasin\\Documents\\diginamic\\cours\\JPA\\tp\\JPA\\tp07-traitement-fichier\\src\\main\\java\\DAL\\open-food-facts.csv";

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            br.readLine();
            while((line = br.readLine()) != null) {

                tempArr = line.split(delimiter);
                if (tempArr.length == 30){

                    System.out.println("###########################################");
                    System.out.println("###########################################");

                    System.out.println(produitManager.read(tempArr));

                    System.out.println("###########################################");

                    produitManager.save(produitManager.read(tempArr));

                    System.out.println("###########################################");
                    System.out.println("###########################################");



                }
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
