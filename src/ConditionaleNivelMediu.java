public class ConditionaleNivelMediu {

    public static void med01() {
        // ============================================================
        // MEDIU 01 - MAXIMUL DIN 4 NUMERE
        // ============================================================
        // Declara patru variabile int (a, b, c, d). Afiseaza maximul
        // dintre cele patru.
        //
        // Exemplu output (a = 4, b = 12, c = 8, d = 15):
        //   Maxim = 15
        // ============================================================

        // TODO

        int [] v = {4, 12, 8, 15};
        int max = 0;
        for(int i=0; i<v.length-1; i++){
            if(v[i] < v[i+1]){
                max = v[i+1];
            }
        }

        System.out.println("Maximumul este " + max);
    }

    public static void med02() {
        // ============================================================
        // MEDIU 02 - MEDIANA DIN 3 NUMERE
        // ============================================================
        // Declara trei variabile int (a, b, c) cu valori distincte.
        // Afiseaza mediana (numarul din mijloc cand le sortezi, adica
        // cel care NU este nici maxim, nici minim).
        //
        // Exemplu output (a = 7, b = 2, c = 5):
        //   Mediana = 5
        // ============================================================

        // TODO
    }

    public static void med03() {
        // ============================================================
        // MEDIU 03 - TIPUL UNUI TRIUNGHI
        // ============================================================
        // Declara trei variabile int (a, b, c) - laturile unui
        // triunghi. Afiseaza:
        //   - "echilateral"    daca toate 3 sunt egale
        //   - "isoscel"        daca exact 2 sunt egale
        //   - "scalen"         daca toate sunt diferite
        //   - "invalid"        daca laturile nu pot forma un triunghi
        //
        // Regula triunghi valid: orice latura < suma celorlalte doua.
        //
        // Exemplu output (a = 5, b = 5, c = 8):
        //   isoscel
        // ============================================================

        // TODO
    }

    public static void med04() {
        // ============================================================
        // MEDIU 04 - ECUATIA DE GRADUL 2
        // ============================================================
        // Pentru ecuatia  a*x*x + b*x + c = 0 , declara variabilele
        // double a, b, c. Afiseaza:
        //   - "infinit"             daca a == 0 si b == 0 si c == 0
        //   - "fara solutii"        daca a == 0 si b == 0 si c != 0
        //   - "x = ..."             daca a == 0 si b != 0 (o singura rad.)
        //   - "x = ..."             daca a != 0 si delta == 0 (rad. dubla)
        //   - "x1 = ..., x2 = ..."  daca delta > 0
        //   - "fara solutii reale"  daca delta < 0
        //
        // Unde delta = b*b - 4*a*c.
        //
        // Exemplu output (a = 1, b = -5, c = 6):
        //   x1 = 3.0, x2 = 2.0
        // ============================================================

        // TODO
    }

    public static void med05() {
        // ============================================================
        // MEDIU 05 - INDEX DE MASA CORPORALA (IMC)
        // ============================================================
        // Declara doua variabile double: greutateKg si inaltimeM.
        // Calculeaza IMC = greutateKg / (inaltimeM * inaltimeM) si
        // afiseaza categoria:
        //   - sub 18.5         -> "subponderal"
        //   - 18.5 - 24.9      -> "normal"
        //   - 25.0 - 29.9      -> "supraponderal"
        //   - 30.0 sau peste   -> "obez"
        //
        // Afiseaza si valoarea IMC cu 1 zecimala.
        //
        // Exemplu output (70 kg, 1.75 m):
        //   IMC = 22.9 => normal
        // ============================================================

        // TODO
    }

    public static void med06() {
        // ============================================================
        // MEDIU 06 - NUMARUL DE ZILE INTR-O LUNA
        // ============================================================
        // Declara doua variabile int: luna (1-12) si an. Afiseaza
        // cate zile are luna respectiva in anul dat.
        //   - 30 zile: 4, 6, 9, 11
        //   - 31 zile: 1, 3, 5, 7, 8, 10, 12
        //   - februarie (2): 28 sau 29 daca anul e bisect
        //
        // Regula an bisect: divizibil cu 4 SI (nu cu 100 SAU cu 400).
        //
        // Exemplu output (luna = 2, an = 2024):
        //   februarie 2024 are 29 zile
        // ============================================================

        // TODO
    }

    public static void med07() {
        // ============================================================
        // MEDIU 07 - ORA VALIDA
        // ============================================================
        // Declara trei variabile int: ora, minut, secunda. Afiseaza:
        //   - "ora valida"   daca ora intre 0-23, minut 0-59, sec 0-59
        //   - "ora invalida" altfel
        //
        // Exemplu output (ora = 14, minut = 30, secunda = 75):
        //   ora invalida
        // ============================================================

        // TODO
    }

    public static void med08() {
        // ============================================================
        // MEDIU 08 - DATA VALIDA
        // ============================================================
        // Declara trei variabile int: zi, luna, an. Afiseaza:
        //   - "data valida"   daca data exista efectiv
        //   - "data invalida" altfel
        //
        // Tine cont de numarul de zile din fiecare luna si de anii
        // bisecti pentru februarie.
        //
        // Exemplu output (zi = 29, luna = 2, an = 2023):
        //   data invalida
        // Exemplu output (zi = 29, luna = 2, an = 2024):
        //   data valida
        // ============================================================

        // TODO
    }

    public static void med09() {
        // ============================================================
        // MEDIU 09 - CALCULATOR SIMPLU
        // ============================================================
        // Declara: double a, char operator, double b. Afiseaza
        // rezultatul operatiei pentru operatorii: '+', '-', '*', '/'.
        //   - daca operatorul nu este unul dintre cei 4 -> "operator invalid"
        //   - daca operatorul e '/' si b == 0           -> "impartire la zero"
        //
        // Exemplu output (a = 12, operator = '/', b = 4):
        //   12.0 / 4.0 = 3.0
        // ============================================================

        // TODO
    }

    public static void med10() {
        // ============================================================
        // MEDIU 10 - CONVERSIE ORA 24H -> AM/PM
        // ============================================================
        // Declara o variabila int `ora24` (0-23). Afiseaza ora in
        // format 12h cu AM/PM:
        //   - 0      -> "12 AM"
        //   - 1-11   -> "X AM"
        //   - 12     -> "12 PM"
        //   - 13-23  -> "(X-12) PM"
        // Daca ora24 e in afara intervalului 0-23 -> "ora invalida".
        //
        // Exemplu output (ora24 = 15):
        //   3 PM
        // ============================================================

        // TODO
    }

    public static void med11() {
        // ============================================================
        // MEDIU 11 - PRET BILET METROU
        // ============================================================
        // Declara: int varsta, boolean areCardElev, boolean esteCetatean.
        // Reguli:
        //   - sub 6 ani                       -> gratuit (0)
        //   - elev cu card                    -> 1 leu
        //   - 6-25 ani (fara card de elev)    -> 2 lei
        //   - 26-64 ani                       -> 3 lei
        //   - 65+ ani SI cetatean             -> gratuit
        //   - 65+ ani fara cetatenie          -> 2 lei
        //
        // Afiseaza:
        //   Pret bilet: X lei
        //
        // Exemplu output (varsta = 70, areCardElev = false, esteCetatean = true):
        //   Pret bilet: 0 lei
        // ============================================================

        // TODO
    }

    public static void med12() {
        // ============================================================
        // MEDIU 12 - CONVERSIE NOTA LITERALA -> NUMERICA
        // ============================================================
        // Declara o variabila char `nota` cu o litera (A, B, C, D, F).
        // Afiseaza nota numerica romaneasca echivalenta:
        //   - A -> 10
        //   - B -> 8
        //   - C -> 6
        //   - D -> 5
        //   - F -> 4
        //   - altceva -> "nota necunoscuta"
        //
        // Suporta si literele mici (a, b, c, d, f).
        //
        // Exemplu output (nota = 'b'):
        //   B => 8
        // ============================================================

        // TODO
    }

    public static void med13() {
        // ============================================================
        // MEDIU 13 - PIATRA, FOARFECA, HARTIE
        // ============================================================
        // Declara doua variabile String: jucator1 si jucator2 cu una
        // dintre valorile: "piatra", "foarfeca", "hartie". Afiseaza:
        //   - "egal"        daca au ales acelasi lucru
        //   - "castiga 1"   daca jucatorul 1 castiga
        //   - "castiga 2"   daca jucatorul 2 castiga
        //   - "invalid"     daca cel putin un input e necunoscut
        //
        // Reguli: piatra bate foarfeca, foarfeca bate hartie, hartie
        // bate piatra.
        //
        // Exemplu output (jucator1 = "piatra", jucator2 = "foarfeca"):
        //   castiga 1
        // ============================================================

        // TODO
    }

    public static void med14() {
        // ============================================================
        // MEDIU 14 - EMAIL VALID (FORMA SIMPLA)
        // ============================================================
        // Declara o variabila String `email`. Afiseaza:
        //   - "email valid"   daca contine '@', si dupa '@' contine '.'
        //   - "email invalid" altfel
        //
        // Hint: email.indexOf('@'), email.indexOf('.', startIndex).
        //
        // Exemplu output (email = "ana@gmail.com"):
        //   email valid
        // Exemplu output (email = "ana.gmail.com"):
        //   email invalid
        // ============================================================

        // TODO
    }

    public static void med15() {
        // ============================================================
        // MEDIU 15 - CLASA UNEI ADRESE IP
        // ============================================================
        // Declara o variabila int `primulOctet` (0-255). Afiseaza
        // clasa adresei IPv4:
        //   - 1   - 126  -> "clasa A"
        //   - 128 - 191  -> "clasa B"
        //   - 192 - 223  -> "clasa C"
        //   - 224 - 239  -> "clasa D"
        //   - 240 - 255  -> "clasa E"
        //   - 0 sau 127  -> "rezervat"
        //   - in afara intervalului 0-255 -> "invalid"
        //
        // Exemplu output (primulOctet = 192):
        //   clasa C
        // ============================================================

        // TODO
    }

    public static void med16() {
        // ============================================================
        // MEDIU 16 - AMENDA PENTRU VITEZA
        // ============================================================
        // Declara: int viteza, String tipDrum cu valorile "oras",
        // "sosea" sau "autostrada". Limitele de viteza:
        //   - oras       -> 50
        //   - sosea      -> 100
        //   - autostrada -> 130
        // Calculeaza depasirea fata de limita si afiseaza:
        //   - "in regula"        daca viteza <= limita
        //   - "amenda mica"      depasire 1-20 km/h
        //   - "amenda medie"     depasire 21-50 km/h
        //   - "amenda mare"      depasire > 50 km/h
        //   - "tip drum invalid" daca tipDrum nu e cunoscut
        //
        // Exemplu output (viteza = 75, tipDrum = "oras"):
        //   amenda medie
        // ============================================================

        // TODO
    }

    public static void med17() {
        // ============================================================
        // MEDIU 17 - IMPOZIT PROGRESIV
        // ============================================================
        // Declara o variabila double `venit` (venit lunar in lei).
        // Calculeaza impozitul dupa regula:
        //   - venit <= 1000               -> 0 (scutit)
        //   - venit intre 1001 si 3000    -> 10% din venit
        //   - venit intre 3001 si 7000    -> 15% din venit
        //   - venit peste 7000            -> 20% din venit
        // Afiseaza valoarea impozitului cu 2 zecimale.
        //
        // Exemplu output (venit = 4500.0):
        //   Impozit: 675.00 lei
        // ============================================================

        // TODO
    }

    public static void med18() {
        // ============================================================
        // MEDIU 18 - SEMNUL PRODUSULUI A DOUA NUMERE (FARA INMULTIRE)
        // ============================================================
        // Declara doua variabile int (a, b). FARA sa calculezi a*b,
        // determina si afiseaza semnul produsului:
        //   - "pozitiv"   daca ambele au acelasi semn (si niciunul nu e 0)
        //   - "negativ"   daca au semne diferite (si niciunul nu e 0)
        //   - "zero"      daca cel putin unul este 0
        //
        // Exemplu output (a = -4, b = -7):
        //   pozitiv
        // ============================================================

        // TODO
    }

    public static void med19() {
        // ============================================================
        // MEDIU 19 - TIPUL UNUI CARACTER
        // ============================================================
        // Declara o variabila char `c`. Afiseaza tipul caracterului:
        //   - litera mare (A-Z)        -> "litera mare"
        //   - litera mica (a-z)        -> "litera mica"
        //   - cifra (0-9)              -> "cifra"
        //   - spatiu (' ')             -> "spatiu"
        //   - altul                    -> "alt caracter"
        //
        // Exemplu output (c = 'G'):
        //   G => litera mare
        // ============================================================

        // TODO
    }

    public static void med20() {
        // ============================================================
        // MEDIU 20 - CEL MAI APROAPE DE ZERO
        // ============================================================
        // Declara trei variabile int (a, b, c). Afiseaza numarul cel
        // mai aproape de zero (cu cea mai mica valoare absoluta).
        // Daca exista mai multe la aceeasi distanta, afiseaza-l pe a.
        //
        // Hint: Math.abs(x).
        //
        // Exemplu output (a = -3, b = 5, c = 2):
        //   Cel mai aproape de zero: 2
        // Exemplu output (a = -4, b = 4, c = 7):
        //   Cel mai aproape de zero: -4
        // ============================================================

        // TODO
    }
}
