package DAL;

import BO.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static final String delimiter = "\\|";
    public static void read(String csvFile) {

        Produit produit = new Produit();

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                if (tempArr.length == 30){
                    Categorie categorie = new Categorie(tempArr[0]);
                    Marque marque = new Marque(tempArr[1]);

                    List<Ingredient> ingredientList = new ArrayList<>();
                    String[] ingredients =  tempArr[4].split(",");
                    for (String s : ingredients) {
                        String[] ingredient_info = s.split("-");
                        if (ingredient_info[0] != ""){
                            Ingredient ingredient = new Ingredient(ingredient_info[0]);
                            ingredientList.add(ingredient);
                        }
                    }

                    List<Allergene> allergeneList = new ArrayList<>();
                    String[] allergenes =  tempArr[28].split(",");
                    for (String allergeneFromList : allergenes) {
                        if (allergenes[0] != ""){
                            Allergene allergene = new Allergene(allergenes[0]);
                            allergeneList.add(allergene);
                        }

                    }

                    List<Additif> additifListList = new ArrayList<>();
                    String[] additifs =  tempArr[29].split(",");
                    for (String s : additifs) {
                        String[] additif_info = s.split("-");
                        if (additif_info.length == 2){
                            Additif additif = new Additif(additif_info[0],additif_info[1]);
                            additifListList.add(additif);
                        }
                    }

                    produit = new Produit(categorie,marque,tempArr[2],tempArr[3],ingredientList,tempArr[5],tempArr[6],tempArr[7],tempArr[8],tempArr[9],tempArr[10],tempArr[11],tempArr[12],tempArr[13],tempArr[14],tempArr[15],tempArr[16],tempArr[17],tempArr[18],tempArr[19],tempArr[20],tempArr[21],tempArr[22],tempArr[23],tempArr[24],tempArr[25],tempArr[26],tempArr[27],allergeneList,additifListList);

                    System.out.println("##################################################");
                    System.out.println("##################################################");
                    System.out.println(produit.toString());
                    System.out.println("##################################################");
                    System.out.println("##################################################");


                }
            }


            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // csv file to read
        String csvFile = "D:\\Mohammas wasin\\Documents\\diginamic\\cours\\JPA\\tp\\JPA\\tp07-traitement-fichier\\src\\main\\java\\DAL\\open-food-facts.csv";
        read(csvFile);
    }



}
