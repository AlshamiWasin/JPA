package DAL;


import BO.*;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

public class ProduitDAO{

    private EntityManager em;

    public ProduitDAO(EntityManager em) {
        this.em = em;
    }

    public void createProduit(Produit produit){
        em.getTransaction().begin();
        em.persist(produit);
        em.getTransaction().commit();
    }
    public Allergene createAllergene(Allergene allergene){
        em.getTransaction().begin();
        em.persist(allergene);
        em.getTransaction().commit();
        return allergene;
    }
    public void createCategorie(Categorie categorie){
        em.getTransaction().begin();
        em.persist(categorie);
        em.getTransaction().commit();
    }
    public void createMarque(Marque Marque){
        em.getTransaction().begin();
        em.persist(Marque);
        em.getTransaction().commit();
    }
    public Additif createAdditif(Additif additif){
        em.getTransaction().begin();
        em.persist(additif);
        em.getTransaction().commit();
        return additif;
    }

    public Ingredient createIngredient(Ingredient ingredient){
        em.getTransaction().begin();
        em.persist(ingredient);
        em.getTransaction().commit();
        return ingredient;
    }



    public Additif findAdditif(Additif additif){

        TypedQuery<Additif> query = em.createQuery("SELECT a FROM Additif a WHERE a.code = :code", Additif.class);
        query.setParameter("code", additif.getCode());
        List<Additif>reqAdditif = query.getResultList();

        System.out.println(reqAdditif);

        if (reqAdditif.isEmpty()){
            return null;
        }else {
            return reqAdditif.get(0);
        }

    }

    public Allergene findAllergene(Allergene allergene){

        TypedQuery<Allergene> query = em.createQuery("SELECT a FROM Allergene a WHERE a.nom = :nom", Allergene.class);
        query.setParameter("nom", allergene.getNom());
        List<Allergene>reqAllergene = query.getResultList();

        if (reqAllergene.isEmpty()){
            return null;
        }else {
            return reqAllergene.get(0);
        }
    }

    public Categorie findCategorie(Categorie categorie){

        TypedQuery<Categorie> query = em.createQuery("SELECT a FROM Categorie a WHERE a.nom = :nom", Categorie.class);
        query.setParameter("nom", categorie.getNom());
        List<Categorie>reqCategorie = query.getResultList();

        if (reqCategorie.isEmpty()){
            return null;
        }else {
            return reqCategorie.get(0);
        }

    }

    public Ingredient findIngredient(Ingredient ingredient){

        TypedQuery<Ingredient> query = em.createQuery("SELECT i FROM Ingredient i WHERE i.nom = :nom", Ingredient.class);
        query.setParameter("nom", ingredient.getNom());
        System.out.println(ingredient.getNom());
        List<Ingredient>reqIngredient = query.getResultList();

        if (reqIngredient.isEmpty()){
            return null;
        }else {
            return reqIngredient.get(0);
        }

    }

    public Marque findMarque(Marque marque){

        TypedQuery<Marque> query = em.createQuery("SELECT a FROM Marque a WHERE a.nom = :nom", Marque.class);
        query.setParameter("nom", marque.getNom());
        List<Marque>reqMarque = query.getResultList();

        if (reqMarque.isEmpty()){
            return null;
        }else {
            return reqMarque.get(0);
        }

    }



}
