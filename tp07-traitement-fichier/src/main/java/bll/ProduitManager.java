package bll;

import BO.*;
import DAL.ProduitDAO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
                System.out.println(ingredient);
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

        List<Additif> additifList = new ArrayList<>();
        for (Additif additifFromCsv : produit.getAdditifs()) {
            Additif additifFromDb = impl.findAdditif(additifFromCsv);
            if (additifFromDb != null) {
                additifList.add(additifFromDb);
            } else {
                additifList.add(impl.createAdditif(additifFromCsv));
            }
        }
        produit.setAdditifs(additifList);


        List<Ingredient> ingredientList = new ArrayList<>();
        for (Ingredient ingredientFromCsv : produit.getIngredients()) {
            Ingredient ingredientFromDb = impl.findIngredient(ingredientFromCsv);
            if (ingredientFromDb != null) {
                ingredientList.add(ingredientFromDb);
            } else {
                ingredientList.add(impl.createIngredient(ingredientFromCsv));
            }
        }
        produit.setIngredients(ingredientList);



        List<Allergene> allergeneList = new ArrayList<>();
        for (Allergene allergeneFromCsv : produit.getAllergenes()) {
            Allergene allergeneFromDb = impl.findAllergene(allergeneFromCsv);
            if (allergeneFromDb != null) {
                allergeneList.add(allergeneFromDb);
            } else {
                allergeneList.add(impl.createAllergene(allergeneFromCsv));
            }
        }
        produit.setAllergenes(allergeneList);


        if(impl.findCategorie(produit.getCategorie()) == null){
            impl.createCategorie(produit.getCategorie());
        }else {
            produit.setCategorie(impl.findCategorie(produit.getCategorie()));
        }
        produit.getCategorie().getProduits().add(produit);


        if(impl.findMarque(produit.getMarque()) == null){
            impl.createMarque(produit.getMarque());
        }else {
            produit.setMarque(impl.findMarque(produit.getMarque()));
        }

        produit.getMarque().getProduits().add(produit);

        impl.createProduit(produit);

    }

}
