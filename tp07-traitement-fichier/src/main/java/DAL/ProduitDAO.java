package DAL;


import BO.Produit;

import javax.persistence.EntityManager;

public class ProduitDAO{

    private EntityManager em;

    public ProduitDAO(EntityManager em) {
        this.em = em;
    }

    public void createProduit(Produit produit){

        em.persist(produit);

    }


}
