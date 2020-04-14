package dataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {
    //Exista mai multe feluri de lists, noi o sa discutam despre 3 cele mai folosite: array, array list si map

    public static void exempleDeLists() {
        //1. Array

        String[] masini = {"ford", "opel", "audi"};
        String[] cuvinte = "o propozitie cu mai multe cuvinte".split(" ");
        int numarulCuvintelor = cuvinte.length;
        String alDoileaCuvant = cuvinte[1];

        int[] numere = {1, 2};

        boolean[] booleanArray = {true, false};


        //2. Array List

        List<String> listaDeCuvinte = new ArrayList<>();
        listaDeCuvinte.add("ceva text");
        listaDeCuvinte.add("alt text");
        listaDeCuvinte.set(0, "modificam primul index");
        listaDeCuvinte.contains("alt text");
        listaDeCuvinte.get(1);
        listaDeCuvinte.clear();

        //3. Map

        //un map e o lista de tip cheie-valoare
        //nu poate sa contina decat o singura cheie de acelasi fel

        Map<String, String> carCountry = new HashMap<>();
        carCountry.put("Audi", "German");
        carCountry.put("Skoda", "Czech");
        carCountry.get("Skoda");

        Map<String, List<String>> carModels = new HashMap<>();

        List<String> audiModels = new ArrayList<>();
        List<String> skodaModels = new ArrayList<>();

        audiModels.add("a4");
        audiModels.add("a5");
        audiModels.add("a6");
        audiModels.add("a7");

        skodaModels.add("fabia");
        skodaModels.add("octavia");

        carModels.put("Audi", audiModels);
        carModels.put("Skoda", skodaModels);

        carModels.get("Audi").contains("a3");


    }

}
