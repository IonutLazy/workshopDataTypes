package dataTypes;

public class StringExamples {

    public static void exempleDeString(){
        String example = "the brown fox jumps over the lazy dog";

        //Un String e o colectie de char-uri

        //Exista mai multe metode pe care le putem apela pe un String:
        //ca sa aflam cat de lung e:
        System.out.println("Stringul are o lungime de " +example.length());

        //putem afla si ce caracter se afla la un index anume (primul caracter e index 0)
        System.out.println("Caracterul de la index 0: " + example.charAt(0));
        System.out.println("Caracterul de la index 2: " + example.charAt(2));

        //sau la ce index incepe o fraza
        System.out.println(example.indexOf("fox"));

        //putem concatena (lipi) mai multe stringuri
        String primulString = "the brown fox";
        String alDoileaString = "jumps";
        String alTreileaString = "over the lazy dog";
        System.out.println(primulString + " " + alDoileaString + " " + alTreileaString);

        //sau sa impartim un string in functie de ce dorim:
        //dupa spatiu
        String[] cuvinte = example.split(" ");
        for (String cuvant : cuvinte){
            System.out.println(cuvant);
        }

        //dupa un cuvant sau serie anume de caractere:
        String[] fraze = example.split("jumps");
        for (String fraza : fraze){
            System.out.println(fraza);
        }

        //sau putem curata un String de spatiu mort (spatiu ca prim caracter sau ca ultim caracter)
        String spatiiInutile = "    spatii inutile    ";
        System.out.println(spatiiInutile.trim());

        //putem de asemenea sa inlaturam caracterele care nu ne intereseaza:
        String diacritice = "a,b,c,d,e";
        System.out.println(diacritice.replace(",", ""));
    }



}
