package bll;

import BO.*;
import DAL.DAO;
import DAL.ProduitDAO;

import java.util.ArrayList;
import java.util.List;

public class ProduitManager {
    private static volatile ProduitManager instance=null;
    private static ProduitDAO impl;

    public ProduitManager(ProduitDAO dao) {
        this.impl= dao;
    }

    public Produit read(String[] line) {

        Produit produit;

        Categorie categorie = new Categorie(line[0]);
        Marque marque = new Marque(line[1]);

        List<Ingredient> ingredientList = new ArrayList<>();
        String[] ingredients =  line[4].split(",");
        for (String s : ingredients) {
            String[] ingredient_info = s.split("-");
            if (ingredient_info[0] != ""){
                Ingredient ingredient = new Ingredient(ingredient_info[0]);
                ingredientList.add(ingredient);
            }
        }

        List<Allergene> allergeneList = new ArrayList<>();



        String[] allergenes =  line[28].split(",");

        for (String allergeneFromList : allergenes) {
            if (allergenes[0] != ""){
                Allergene allergene = new Allergene(allergenes[0]);
                allergeneList.add(allergene);
            }

        }

        List<Additif> additifListList = new ArrayList<>();
        String[] additifs =  line[29].split(",");
        for (String s : additifs) {
            String[] additif_info = s.split("-");
            if (additif_info.length == 2){
                Additif additif = new Additif(additif_info[0],additif_info[1]);
                additifListList.add(additif);
            }
        }

        produit = new Produit(categorie,marque,line[2],line[3],ingredientList,line[5],line[6],line[7],line[8],line[9],line[10],line[11],line[12],line[13],line[14],line[15],line[16],line[17],line[18],line[19],line[20],line[21],line[22],line[23],line[24],line[25],line[26],line[27],allergeneList,additifListList);


        return produit;
    }


    public void save(Produit produit){

        for (int i = 0; i < produit.getAdditifs().size(); i++) {

            Additif additifToLookFor =impl.findAdditif(produit.getAdditifs().get(i));
            if(additifToLookFor == null){
                impl.createAdditif(produit.getAdditifs().get(i));
            }else {
                produit.getAdditifs().add(additifToLookFor);
                produit.getAdditifs().remove(produit.getAdditifs().get(i));
            }
        }

        for (int i = 0; i <produit.getIngredients().size() ; i++) {
            Ingredient ingredientToLookFor =impl.findIngredient(produit.getIngredients().get(i));
            if(ingredientToLookFor == null){
                impl.createIngredient(produit.getIngredients().get(i));
            }else {
                produit.getIngredients().add(ingredientToLookFor);
                produit.getIngredients().remove(produit.getIngredients().get(i));
            }
        }

        for (int i = 0; i < produit.getAllergenes().size(); i++) {

            Allergene allergeneToLookFor =impl.findAllergene(produit.getAllergenes().get(i));
            if(allergeneToLookFor == null){
                impl.createAllergene(produit.getAllergenes().get(i));
            }else {
                produit.getAllergenes().remove(produit.getAllergenes().get(i));
                produit.getAllergenes().add(allergeneToLookFor);

            }

        }


        if(impl.findCategorie(produit.getCategorie()) == null){
            impl.createCategorie(produit.getCategorie());
        }else {
            produit.setCategorie(impl.findCategorie(produit.getCategorie()));
        }


        if(impl.findMarque(produit.getMarque()) == null){
            impl.createMarque(produit.getMarque());
        }else {

            produit.setMarque(impl.findMarque(produit.getMarque()));
        }

        impl.createProduit(produit);

    }

}
