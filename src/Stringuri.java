public class Stringuri {

    public static void str01() {
        // ============================================================
        // STR 01 - LUNGIME
        // ============================================================
        // Declara un String. Afiseaza cate caractere are.
        //
        // Hint: s.length() — ATENTIE cu paranteze, nu .length ca la array.
        //
        // Exemplu output (s = "salut"):
        //   salut are 5 caractere
        // ============================================================

        // TODO

        String s = "test";
        System.out.println(s.length());
    }

    public static void str02() {
        // ============================================================
        // STR 02 - LITERA CU LITERA
        // ============================================================
        // Declara un String. Afiseaza fiecare caracter pe o linie.
        //
        // Hint:
        //   for (int i = 0; i < s.length(); i++) {
        //       char c = s.charAt(i);
        //       System.out.println(c);
        //   }
        //
        // Exemplu output (s = "salut"):
        //   s
        //   a
        //   l
        //   u
        //   t
        // ============================================================

        // TODO

        String s = "test";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);           //“String, please give me the character at position i”
            System.out.println(c);
        }
    }

    public static void str03() {
        // ============================================================
        // STR 03 - CONCATENARE
        // ============================================================
        // Declara doua variabile String: prenume si nume. Afiseaza:
        //   Salut, X Y!
        //
        // Exemplu output (prenume = "Ana", nume = "Popescu"):
        //   Salut, Ana Popescu!
        // ============================================================

        // TODO

        String nume = "Dumitru";
        String prenume = "Alexandru";

        System.out.println("Salut, " + nume + " " +prenume);
    }

    public static void str04() {
        // ============================================================
        // STR 04 - LITERE MARI / LITERE MICI
        // ============================================================
        // Declara un String. Afiseaza-l cu litere mari, apoi cu litere
        // mici.
        //
        // Hint: s.toUpperCase(), s.toLowerCase().
        //
        // Exemplu output (s = "Salut"):
        //   SALUT
        //   salut
        // ============================================================

        // TODO
    }

    public static void str05() {
        // ============================================================
        // STR 05 - CONTAINS
        // ============================================================
        // Declara un String. Verifica daca contine "Java" si afiseaza:
        //   - "Da, contine Java" daca da
        //   - "Nu contine Java"  daca nu
        //
        // Hint: s.contains("Java") returneaza boolean.
        //
        // Exemplu output (s = "Invat Java de la zero"):
        //   Da, contine Java
        // ============================================================

        // TODO
    }

    public static void str06() {
        // ============================================================
        // STR 06 - INCEPE/SE TERMINA CU
        // ============================================================
        // Declara un String `fisier`. Verifica:
        //   - daca incepe cu "img_"  -> afiseaza "imagine"
        //   - daca se termina cu .txt -> afiseaza "text"
        //   - altfel                  -> afiseaza "alt tip"
        //
        // Hint: s.startsWith("..."), s.endsWith("...").
        //
        // Exemplu output (fisier = "img_001.jpg"):
        //   imagine
        // Exemplu output (fisier = "note.txt"):
        //   text
        // ============================================================

        // TODO
    }

    public static void str07() {
        // ============================================================
        // STR 07 - NUMARA O LITERA
        // ============================================================
        // Declara un String si o variabila char `litera`. Numara de
        // cate ori apare litera in String si afiseaza numarul.
        //
        // Exemplu output (s = "programare", litera = 'r'):
        //   r apare de 2 ori
        // ============================================================

        // TODO

        int ct = 0;

        String test = "test-test";
        char litera = 't';

        for(int i=0; i<test.length(); i++){
            if(test.charAt(i) == litera){
                ct+=1;
            }
        }

        System.out.println(litera + " apare de "+ct +" ori");

    }

    public static void str08() {
        // ============================================================
        // STR 08 - INVERSEAZA UN STRING
        // ============================================================
        // Declara un String. Afiseaza-l in ordine inversa.
        //
        // Hint: parcurgi de la i = s.length() - 1 pana la 0 si
        //       concatenezi caracterele intr-un String nou.
        //
        // Exemplu output (s = "Java"):
        //   avaJ
        // ============================================================

        // TODO

        var var = "";

        String test = "qwerty";
        for(int i=test.length()-1; i>-1; i--){
            var = var + test.charAt(i);
        }

        System.out.println(var);
    }

    public static void str09() {
        // ============================================================
        // STR 09 - PALINDROM
        // ============================================================
        // Declara un String. Verifica daca e palindrom (citit invers
        // da acelasi cuvant — ignora majuscule/minuscule).
        //
        // Hint: foloseste rezolvarea de la str08 sau compara caracterele
        //       cu i si s.length()-1-i. Foloseste toLowerCase() inainte.
        //
        // Exemplu output (s = "Anitalavalatina"):
        //   Anitalavalatina este palindrom
        // Exemplu output (s = "Java"):
        //   Java nu este palindrom
        // ============================================================

        // TODO

        String test = "ana";
        String invers = "";

        for(int i=0,j=test.length()-1; i<test.length()&j>=0; i++,j--){
         if(test.charAt(i) == test.charAt(j)){
             System.out.println("OK");
         }
        }

//        1, 2, 3, 4, 3, 2, 1
//        length = 7
        //i = 2;

    }

    public static void str10() {
        // ============================================================
        // STR 10 - SUBSTRING
        // ============================================================
        // Declara un String reprezentand un email (ex: "ana@gmail.com").
        // Extrage si afiseaza:
        //   - partea de dinainte de @
        //   - partea de dupa @
        //
        // Hint: s.indexOf('@') iti da pozitia. s.substring(0, poz) si
        //       s.substring(poz + 1).
        //
        // Exemplu output (s = "ana@gmail.com"):
        //   utilizator: ana
        //   domeniu:    gmail.com
        // ============================================================

        // TODO
    }
}
