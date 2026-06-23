import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiCombinate {

    public static void ex01() {

        // TO DO

        String[] elevi = {"Ana", "Ion", "Maria", "Vlad", "Diana", "George", "Ioana", "Radu", "Elena", "Mihai"};
        int[] note = {7, 4, 9, 5, 10, 3, 8, 6, 9, 4};


        int ctPromovati = 0;
        int ctCorigenti = 0;

        for (int i = 0; i < elevi.length; i++) {
            if (note[i] >= 5 && note[i] < 7) {
                System.out.println(elevi[i] + " => Suficient");
                ctPromovati = ctPromovati + 1;
            } else if (note[i] >= 7 && note[i] < 9) {
                System.out.println(elevi[i] + " => Bine");
                ctPromovati = ctPromovati + 1;
            } else if (note[i] >= 9) {
                System.out.println(elevi[i] + " => Excelent");
                ctPromovati = ctPromovati + 1;
            } else if (note[i] < 5) {
                System.out.println(elevi[i] + " => Insuficient");
                ctCorigenti = ctCorigenti + 1;
            }
        }

        System.out.println("Promovati: " + ctPromovati);
        System.out.println("Corigenti: " + ctCorigenti);
        System.out.println("Procent promovati: " + ((ctPromovati / (double) elevi.length) * (double) 100));
    }

    public static void ex02() {

        int[] v = {1234, 56, 7890, 11, 4321, 99, 100200, 7};

        int maxSum = 0;
        int bestNum = 0;
        int total = 0;

        for (int i = 0; i < v.length; i++) {

            int num = v[i];
            int sum = 0;


            while (num > 0) {
                int digit = num % 10;   //store the digit
                num = num / 10;         // remove the last digit from the num
                sum = sum + digit;

            }

            total = total + sum;

            if (sum > maxSum) {
                maxSum = sum;
                bestNum = v[i];
            }
            System.out.println("suma lui " + v[i] + " este => " + sum);

        }

        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (Math.abs(v[i]) >= 1000) {
                arr3.add(v[i]);
            }
        }

        double mediaSum = (double) ((double) total) / ((double) v.length);

        System.out.println("Suma maxima: " + bestNum + " cu suma cifrelor " + maxSum);
        System.out.println(total);
        System.out.println("media sumelor = " + mediaSum);
        System.out.println("Numerele cu peste 3 cifre: " + arr3);


    }

    public static void ex05() {

        String[] jucator1 = {"piatra", "hartie", "foarfeca", "piatra", "hartie",
                "foarfeca", "piatra", "hartie", "foarfeca", "piatra"};
        String[] jucator2 = {"foarfeca", "hartie", "piatra", "hartie", "foarfeca",
                "foarfeca", "piatra", "piatra", "hartie", "foarfeca"};


        //declara un String pentru fiecare iteratie, e.g. String jucator1

        int draw = 0;
        int j1win = 0;
        int j2win = 0;

        for (int i = 0; i < jucator1.length; i++) {
            String jucatorA = jucator1[i];
            String jucatorB = jucator2[i];

            if (jucatorA.equals(jucatorB)) {
                draw += 1;
                System.out.println("Egalitate");
            } else if (
                    (jucatorA.equals("piatra") && jucatorB.equals("foarfeca")) ||
                            (jucatorA.equals("hartie")) && jucatorB.equals(("piatra")) ||
                            (jucatorA.equals("foarfeca")) && jucatorB.equals(("hartie"))
            ) {
                j1win += 1;
                System.out.println("Jucatorul 1 castiga runda.");
            } else {
                j2win += 1;
                System.out.println("Jucatorul 2 castiga runda.");
            }
        }

        System.out.println("Scor: J1 = " + j1win + ", J2 = " +j2win + ", Egal = " + draw);

        if(j1win > j2win){
            System.out.println("Castigator: Jucatorul 1");
        } else if (j1win == j2win) {
            System.out.println("Rezultatul: Egalitate");
        } else{
            System.out.println("Castigator: Jucatorul 2");
        }
    }


    public static void ex06(){


        String cuvant1 = "testz";
        String cuvant2 = "tetsa";

        if(cuvant1.length() != cuvant2.length()){
            System.out.println("Cuvintele nu au acelasi numar de litere");
        }

        boolean[] found = new boolean[26];      //all values are false;
        int[] count = new int[26];  //all values are 0;

        for(int i=0; i< cuvant1.length(); i++){     // MUST loop over the WORD, not the array
            char c = cuvant1.charAt(i);
            // char c = int ()
            int index = c - 'a';

            found[index] = true;
            count[index] ++;
        }


        for(int i=0; i<cuvant2.length(); i++){
            char c = cuvant2.charAt(i);
            int index = c - 'a';

            count[index] --;
        }

        boolean isAnagram = true;

        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                isAnagram = false;
            }
        }

        if(isAnagram){
            System.out.println("Cuvintele: " +cuvant1 + " si " +cuvant2 + " sunt anagrame.");
        } else{
            System.out.println("Cuvintele nu sunt anagrame");
        }
    }



    public static void ex07(){

        String cnp = "190315123456";
        boolean isValid = true;

        char first = cnp.charAt(0);

        if (cnp.length() != 13) {
            System.out.println("CNP-ul este prea scurt");
            isValid = false;
        }

        for(int i =0; i<cnp.length(); i++){
            if(cnp.charAt(i) < '0' || cnp.charAt(i) > '9'){
                System.out.println("CNP contine caractere non-digit\n");
                isValid = false;
            }
        }

        if(first != '1' || first !='2' && first != '5' && first != '6'){
            System.out.println("Prima cifra trebuie sa fie 1,2, 5 sau 6");
            isValid = false;
        }

        if(isValid){
            System.out.println("CNP valid");
        }
    }


    public static void ex08(){


        ArrayList<Integer> castigatoare = new ArrayList<>(
                Arrays.asList(7, 14, 23, 35, 41)
        );

        ArrayList<Integer> bileteleMele = new ArrayList<> (
                Arrays.asList(3, 14, 22, 41, 50, 7, 11)
        );

        ArrayList<Integer> numereleCastigate = new ArrayList<>(
                Arrays.asList()
        );

        int ct = 0;

        for (int i=0; i<castigatoare.size(); i++){


            for(int j=0; j<bileteleMele.size(); j++){
                if(castigatoare.get(i).equals(bileteleMele.get(j)) ){
                    ct++;
                    numereleCastigate.add(bileteleMele.get(j));
                }
            }

        }

        System.out.println(ct);
        System.out.println(numereleCastigate);
        System.out.printf("Procent castig: %.2f%%",((double) ct / (double) bileteleMele.size()) * (double) 100);

    }

    public static void ex09(){

        String text = "Salut, eu invat Java in 2025!, , ";

        int totalChar = 0;
        int numSpatii = 0;
        int numFaraSpatii = 0;
        int numVocale = 0;
        int numCons = 0;
        int numCifre = 0;
        int numCuvinte = 0;
        int totalLitere = 0;



        for(int i=0; i<text.length(); i++){
            totalChar ++;                     //numar caractere total

            if(text.charAt(i) == ' '){      //numar spatii
                numSpatii++;
                numCuvinte++;
            } else if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                numVocale++;
            } else if(text.charAt(i) < '0' || text.charAt(i) > '9' ){
                numCons++;
            } else {
                numCifre++;
            }

        }

        numFaraSpatii = totalChar - numSpatii;
        totalLitere = numVocale + numCons;
        double procentVocale = ((double) numVocale / (double) totalLitere) * (double) 100;

        System.out.println("Caractere total: " + totalChar);
        System.out.println("Caractere fara spatii: " + numFaraSpatii);
        System.out.println("Vocale: " + numVocale);
        System.out.println("Consoane: " + numCons);
        System.out.println("Cifre:" + numCifre);
        System.out.println("Cuvinte: " + (numCuvinte + 1));
        System.out.printf("Procent vocale: %.1f%%", procentVocale);
    }


    public static void ex10(){

        int[] v = {7, 7, 7, 8, 8, 9};

        int ct = 1;
        int max = 0;
        int ch = 0;

        for(int i=0, j=1; j< v.length; i++, j++){
            if(v[i] == v[j]){
                ct++;

                if(max < ct){
                    max = ct;
                    ch = v[i];
                }
            } else {
                ct = 1;
            }
        }
        System.out.println("Cea mai lunga serie: " +max + " de " +ch);
    }

    public static void ex11(){

        String[] echipe   = {"Steaua", "Dinamo", "Rapid", "CFR", "FCSB", "UTA"};
        int[] victorii    = {12,        10,       8,       11,    9,      6};
        int[] egaluri     = {4,         5,        8,       3,     6,      9};
        int[] infrangeri  = {2,         3,        2,       4,     3,      3};

        //Reguli: victorie = 3 puncte, egal = 1 punct, infrangere = 0 puncte.

        int[] puncte = new int[echipe.length];


        for(int i=0; i<echipe.length; i++){
            puncte[i] = (victorii[i] * 3) + egaluri[i];
            System.out.println(echipe[i] + ": " + puncte[i]);
        }
    }
}