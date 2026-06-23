public class Conditionale {

    public static void cond01() {
        // ============================================================
        // CONDITIONAL 01 - POZITIV / NEGATIV / ZERO
        // ============================================================
        // Declara o variabila int `numar`. Afiseaza:
        //   - "pozitiv" daca este > 0
        //   - "negativ" daca este < 0
        //   - "zero" altfel
        //
        // Exemplu output (daca numar = -3):
        //   negativ
        // ============================================================

        // TODO
        int numar=12;
        if(numar>0){
            System.out.println("este pozitiv");
        }else if(numar<0){
            System.out.println("este negativ");
        }else{
            System.out.println("zero");
        }
    }

    public static void cond02() {
        // ============================================================
        // CONDITIONAL 02 - PAR SAU IMPAR
        // ============================================================
        // Declara o variabila int `numar`. Afiseaza:
        //   - "X este par"   daca este par
        //   - "X este impar" daca este impar
        //
        // Exemplu output (daca numar = 7):
        //   7 este impar
        // ============================================================

        // TODO

        int numar = 13;
        if(numar % 2 == 0){
            System.out.println("numarul este par");
        } else if(numar % 2 == 1){
            System.out.println("numarul este impar");
        } else {
            System.out.println("numarul este zero");
        }

    }

    public static void cond03() {
        // ============================================================
        // CONDITIONAL 03 - MAXIMUL DINTRE 2 NUMERE
        // ============================================================
        // Declara doua variabile int `a` si `b`. Afiseaza maximul
        // dintre ele.
        //
        // Exemplu output (daca a = 5, b = 12):
        //   Maxim = 12
        // ============================================================

        // TODO

        int a = 5;
        int b = 10;

        if(a < b){
            System.out.println("Maxim = "+b);
        } else if(a > b){
            System.out.println("Maxim ="+a);
        } else {
            System.out.println("numerele sunt egale.");
        }

    }

    public static void cond04() {
        // ============================================================
        // CONDITIONAL 04 - MAXIMUL DINTRE 3 NUMERE
        // ============================================================
        // Declara trei variabile int `a`, `b`, `c`. Afiseaza maximul
        // dintre cele trei.
        //
        // Exemplu output (daca a = 4, b = 9, c = 7):
        //   Maxim = 9
        // ============================================================

        // TODO

        // declara maximul de la cel mai mic nr.

        int a = 4;
        int b = 9;
        int c = 7;

        int maxim = a;

        if(b > maxim) {
//            b = maxim;      // X - b = 4
            maxim = b;
        }

        if(c > maxim){
            maxim = c;
        }

        System.out.println("Maximul este " +maxim);

    }

    public static void cond05() {
        // ============================================================
        // CONDITIONAL 05 - CALIFICATIV PE BAZA NOTEI/
        // ============================================================
        // Declara o variabila int `nota` cu o valoare intre 1 si 10.
        // Afiseaza calificativul:
        //   - nota >= 9  -> "Excelent"
        //   - nota >= 7  -> "Bine"
        //   - nota >= 5  -> "Suficient"
        //   - altfel     -> "Insuficient"
        //
        // Exemplu output (daca nota = 8):
        //   Nota 8 => Bine
        // ============================================================

        // TODO

        int nota = 6;
        if(nota>=9){
            System.out.println("excelent");
        } else if(nota >=7){
            System.out.println("bine");
        } else if(nota >=5){
            System.out.println("suficient");
        } else if(nota < 5){
            System.out.println("insuficient");
        }
    }

    public static void cond06() {
        // ============================================================
        // CONDITIONAL 06 - CATEGORII DE VARSTA
        // ============================================================
        // Declara o variabila int `varsta`. Afiseaza categoria:
        //   - sub 13         -> "copil"
        //   - intre 13 si 17 -> "adolescent"
        //   - intre 18 si 64 -> "adult"
        //   - peste 64       -> "varstnic"
        //
        // Exemplu output (daca varsta = 30):
        //   adult
        // ============================================================

        // TODO

        int varsta = 64;
        if(varsta<13){
            System.out.println("copil");
        } else if (varsta > 13 && varsta <18) {
            System.out.println("adolescent");
        } else if (varsta >= 18 && varsta < 65 ){
            System.out.println("adult");
        } else if (varsta > 65){
            System.out.println("varstnic");
        }
    }

    public static void cond07() {
        // ============================================================
        // CONDITIONAL 07 - LOGIN
        // ============================================================
        // Definite in cod doua variabile cu datele corecte:
        //   String utilizatorCorect = "admin";
        //   String parolaCorecta    = "1234";
        // Definite alte doua variabile cu datele "introduse" de
        // utilizator (le pui tu in cod). Verifica daca AMBELE
        // potrivesc si afiseaza:
        //   - "Login OK"      daca da
        //   - "Date invalide" altfel
        //
        // Hint: foloseste .equals() pentru String, nu == .
        //
        // Exemplu output (daca utilizator = "admin", parola = "abcd"):
        //   Date invalide
        // ============================================================

        // TODO

        String utilizatorCorect = "admin";
        String parolaCorecta = "1234dasds";

        String utilizator = "admin";
        String parola = "1234";

        if(utilizator.equals(utilizatorCorect) && parola.equals(parolaCorecta)){
            System.out.println("Login OK");
        } else {
            System.out.println("Date Invalide");
        }


    }

    public static void cond08() {
        // ============================================================
        // CONDITIONAL 08 - ANOTIMP DUPA LUNA
        // ============================================================
        // Declara o variabila int `luna` (1-12). Afiseaza anotimpul:
        //   - 12, 1, 2  -> "iarna"
        //   - 3, 4, 5   -> "primavara"
        //   - 6, 7, 8   -> "vara"
        //   - 9, 10, 11 -> "toamna"
        // Pentru o luna invalida (< 1 sau > 12) afiseaza "luna invalida".
        //
        // Exemplu output (daca luna = 4):
        //   primavara
        // ============================================================

        // TODO

        int luna = 3;
        if(luna > 11 || luna<3){
            System.out.println("iarna");
        } else if(luna>=3 && luna < 6){
            System.out.println("primavara");
        } else if(luna>=6 && luna <9){
            System.out.println("vara");
        } else System.out.println("toamna");
    }

    public static void cond09() {
        // ============================================================
        // CONDITIONAL 09 - TRIUNGHI VALID
        // ============================================================
        // Declara trei variabile int `a`, `b`, `c` (laturile unui
        // triunghi). Verifica daca cele 3 lungimi pot forma un
        // triunghi valid si afiseaza:
        //   - "triunghi valid"   daca da
        //   - "triunghi invalid" altfel
        //
        // Regula: orice latura trebuie sa fie mai mica decat suma
        // celorlalte doua.
        //
        // Exemplu output (daca a = 3, b = 4, c = 5):
        //   triunghi valid
        // Exemplu output (daca a = 1, b = 1, c = 10):
        //   triunghi invalid
        // ============================================================

        // TODO


    }

    public static void cond10() {
        // ============================================================
        // CONDITIONAL 10 - AN BISECT
        // ============================================================
        // Declara o variabila int `an`. Afiseaza:
        //   - "X este bisect"    daca este an bisect
        //   - "X nu este bisect" altfel
        //
        // Regula an bisect:
        //   - se imparte la 4
        //   - SI nu se imparte la 100
        //   - SAU se imparte la 400
        // (ex: 2000 si 2024 sunt bisecti, 1900 si 2023 nu)
        //
        // Exemplu output (daca an = 2024):
        //   2024 este bisect
        // ============================================================

        // TODO

        int an = 2024;

        boolean isDivide4=an%4==0;
        boolean notDivide100=an%100 == 1;
        boolean isDivide400= an%400 == 0;

        boolean isBisect= isDivide400||(isDivide4&&notDivide100);

//        if(an % 4 == 0 && an % 100==0 || an % 400 == 0){
//            System.out.println("an bisect");
//        } else System.out.println("NOT an bisect");

        if(isBisect){
            System.out.println("Bisect");
        } else{
            System.out.println("NOT bisect");
        }
    }

    public static void cond11() {
        // ============================================================
        // CONDITIONAL 11 - OPERATOR TERNAR
        // ============================================================
        // Declara o variabila int `numar` (presupune ca nu este 0).
        // Folosind operatorul ternar ( conditie ? a : b ), declara
        // o variabila String `semn` care sa fie "pozitiv" sau
        // "negativ" si afiseaza:
        //   X este Y
        //
        // Exemplu output (daca numar = -5):
        //   -5 este negativ
        // ============================================================

        // TODO

        int numar = 0;
        String semn = "";

        boolean conditie = numar >0;
//        if(conditie){
//            semn = "pozitiv";
//            System.out.println(numar + " este " + semn);
//        }
//        else {
//            semn = "negativ";
//            System.out.println(numar + " este " + semn);
//        }

        semn=conditie?"pozitiv":"negativ";

        System.out.println(numar + " este " +semn);
    }

    public static void cond12() {
        // ============================================================
        // CONDITIONAL 12 - PRET CU REDUCERE
        // ============================================================
        // Declara doua variabile:
        //   double  pretInitial
        //   boolean areCard
        // Calculeaza pretul final dupa regula:
        //   - daca are card SI pretul initial > 200 -> reducere 30%
        //   - daca are card                          -> reducere 20%
        //   - altfel                                  -> reducere 10%
        // Afiseaza pretul final cu 2 zecimale:
        //   Pret final: X.XX
        //
        // Hint: System.out.printf("Pret final: %.2f%n", pretFinal);
        //
        // Exemplu output (daca pretInitial = 250.0, areCard = true):
        //   Pret final: 175.00
        // ============================================================

        // TODO
        double pretInitial = 1000;
        boolean areCard = true;
        double pretFinal = 0;

        if(areCard && pretInitial >200){
            pretFinal = pretInitial * 0.7;
        } else if (areCard){
            pretFinal = pretInitial * 0.8;
        } else {
            pretFinal = pretInitial * 0.9;
        }

        System.out.println("Pret final: "+ "$"+ pretFinal );
    }
}
