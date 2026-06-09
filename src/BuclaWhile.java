public class BuclaWhile {

    public static void while01() {
        // ============================================================
        // WHILE 01 - NUMERELE DE LA 1 LA 10
        // ============================================================
        // Folosind o bucla while, afiseaza fiecare numar de la 1 la 10
        // pe cate o linie separata.
        //
        // Exemplu output:
        //   1
        //   2
        //   3
        //   ...
        //   10
        // ============================================================

        // TODO
    }

    public static void while02() {
        // ============================================================
        // WHILE 02 - NUMERE DESCRESCATOR
        // ============================================================
        // Folosind while, afiseaza numerele de la 10 la 1 pe cate o
        // linie. La final mai printezi linia "start".
        //
        // Exemplu output:
        //   10
        //   9
        //   8
        //   ...
        //   1
        //   start
        // ============================================================

        // TODO
    }

    public static void while03() {
        // ============================================================
        // WHILE 03 - NUMERELE PARE PANA LA 20
        // ============================================================
        // Folosind while, afiseaza toate numerele pare de la 0 la 20
        // (inclusiv 20), fiecare pe o linie noua.
        //
        // Exemplu output:
        //   0
        //   2
        //   4
        //   ...
        //   20
        // ============================================================

        // TODO
    }

    public static void while04() {
        // ============================================================
        // WHILE 04 - MULTIPLII LUI 3
        // ============================================================
        // Declara o variabila int `n`. Afiseaza toti multiplii lui 3
        // de la 1 la n (inclusiv), fiecare pe o linie noua.
        //
        // Exemplu output (n = 15):
        //   3
        //   6
        //   9
        //   12
        //   15
        // ============================================================

        // TODO
    }

    public static void while05() {
        // ============================================================
        // WHILE 05 - SUMA DE LA 1 LA N
        // ============================================================
        // Declara o variabila int `n`. Calculeaza si afiseaza suma
        // numerelor de la 1 la n.
        //
        // Exemplu output (n = 5):
        //   Suma de la 1 la 5 = 15
        // ============================================================

        // TODO
    }

    public static void while06() {
        // ============================================================
        // WHILE 06 - FACTORIAL
        // ============================================================
        // Declara o variabila int `n`. Calculeaza si afiseaza n!
        // (produsul tuturor numerelor de la 1 la n).
        //
        // Atentie: pentru produs, pornesti de la 1, nu de la 0.
        //
        // Exemplu output (n = 5):
        //   5! = 120
        // ============================================================

        // TODO
    }

    public static void while07() {
        // ============================================================
        // WHILE 07 - TABLA INMULTIRII CU N
        // ============================================================
        // Declara o variabila int `n`. Afiseaza tabla inmultirii cu
        // n (de la n*1 pana la n*10), cate o linie pentru fiecare
        // produs.
        //
        // Exemplu output (n = 4):
        //   4 x 1 = 4
        //   4 x 2 = 8
        //   ...
        //   4 x 10 = 40
        // ============================================================

        // TODO
    }

    public static void while08() {
        // ============================================================
        // WHILE 08 - NUMARUL DE CIFRE
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Afiseaza cate
        // cifre are numarul respectiv.
        //
        // Hint:
        //   1234 / 10 = 123
        //   1234 % 10 = 4
        //
        // Exemplu output (numar = 1234):
        //   1234 are 4 cifre
        // ============================================================

        // TODO
    }

    public static void while09() {
        // ============================================================
        // WHILE 09 - SUMA CIFRELOR UNUI NUMAR
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Calculeaza si
        // afiseaza suma cifrelor lui.
        //
        // Exemplu output (numar = 1234):
        //   Suma cifrelor = 10
        // ============================================================

        // TODO
    }

    public static void while10() {
        // ============================================================
        // WHILE 10 - INVERSUL UNUI NUMAR
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Afiseaza
        // numarul inversat (cifrele in ordine inversa).
        //
        // Hint: porneste cu int invers = 0. La fiecare iteratie:
        //   invers = invers * 10 + (numar % 10);
        //   numar  = numar / 10;
        //
        // Exemplu output (numar = 1234):
        //   Inversul lui 1234 este 4321
        // ============================================================

        // TODO
    }

    public static void while11() {
        // ============================================================
        // WHILE 11 - NUMAR PRIM
        // ============================================================
        // Declara o variabila int `numar` (>= 2). Verifica daca este
        // numar prim (divizibil doar cu 1 si cu el insusi).
        //
        // Hint: incearca sa-l imparti la 2, 3, 4 ... numar-1. Daca
        //       gasesti un divizor, nu mai e prim. Foloseste un
        //       boolean ca "steag".
        //
        // Exemplu output (numar = 7):
        //   7 este prim
        // Exemplu output (numar = 12):
        //   12 nu este prim
        // ============================================================

        // TODO
    }

    public static void while12() {
        // ============================================================
        // WHILE 12 - CMMDC (CEL MAI MARE DIVIZOR COMUN)
        // ============================================================
        // Declara doua variabile int `a` si `b` (pozitive). Calculeaza
        // cmmdc folosind algoritmul lui Euclid:
        //   cat timp b != 0:
        //     rest = a % b
        //     a    = b
        //     b    = rest
        //   la final, a contine cmmdc.
        //
        // Exemplu output (a = 24, b = 36):
        //   CMMDC(24, 36) = 12
        // ============================================================

        // TODO
    }

    public static void while13() {
        // ============================================================
        // WHILE 13 - RIDICARE LA PUTERE
        // ============================================================
        // Declara doua variabile int `baza` si `exponent` (pozitive,
        // exponent >= 0). Calculeaza baza ^ exponent prin inmultire
        // repetata (NU folosi Math.pow).
        //
        // Exemplu output (baza = 2, exponent = 10):
        //   2 ^ 10 = 1024
        // Exemplu output (baza = 3, exponent = 4):
        //   3 ^ 4 = 81
        // ============================================================

        // TODO
    }

    public static void while14() {
        // ============================================================
        // WHILE 14 - SIRUL FIBONACCI
        // ============================================================
        // Declara o variabila int `n`. Afiseaza primii n termeni din
        // sirul Fibonacci, fiecare pe o linie. Fibonacci: primii doi
        // termeni sunt 0 si 1, iar fiecare urmator e suma celor doi
        // anteriori.
        //
        // Hint: ai nevoie de 3 variabile (anterior, curent, urmator)
        //       sau de 2 cu swap.
        //
        // Exemplu output (n = 8):
        //   0
        //   1
        //   1
        //   2
        //   3
        //   5
        //   8
        //   13
        // ============================================================

        // TODO
    }

    public static void while15() {
        // ============================================================
        // WHILE 15 - CIFRA MAXIMA DINTR-UN NUMAR
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Afiseaza cea mai
        // mare cifra din numar.
        //
        // Hint: extragi cifrele una cate una cu % 10 si / 10 (ca la
        //       while08), si tii minte maximul vazut pana acum.
        //
        // Exemplu output (numar = 3892):
        //   Cifra maxima din 3892 este 9
        // Exemplu output (numar = 1111):
        //   Cifra maxima din 1111 este 1
        // ============================================================

        // TODO
    }

    public static void while16() {
        // ============================================================
        // WHILE 16 - NUMAR PALINDROM
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Verifica daca
        // numarul e palindrom (citit invers da acelasi numar).
        //
        // Hint: construieste inversul cu acelasi algoritm ca la while10
        //       intr-o variabila separata, apoi compara cu numarul
        //       original. Nu uita sa pastrezi numarul original intr-o
        //       alta variabila ca sa-l compari la final.
        //
        // Exemplu output (numar = 1221):
        //   1221 este palindrom
        // Exemplu output (numar = 1234):
        //   1234 nu este palindrom
        // ============================================================

        // TODO
    }

    public static void while17() {
        // ============================================================
        // WHILE 17 - NUMAR PERFECT
        // ============================================================
        // Declara o variabila int `numar` (>= 1). Verifica daca e
        // perfect: suma divizorilor sai PROPRII (toti divizorii in
        // afara de el insusi) e egala cu numarul.
        //
        // Exemple de numere perfecte: 6 = 1+2+3, 28 = 1+2+4+7+14.
        //
        // Hint: porneste cu divizor = 1, while divizor < numar:
        //       daca numar % divizor == 0, adauga divizor la suma;
        //       divizor++.
        //
        // Exemplu output (numar = 28):
        //   28 este perfect
        // Exemplu output (numar = 10):
        //   10 nu este perfect
        // ============================================================

        // TODO
    }

    public static void while18() {
        // ============================================================
        // WHILE 18 - REDUCEREA LA O CIFRA (NUMAR MAGIC)
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Aduna cifrele
        // numarului in mod repetat pana ramane o singura cifra
        // (numarul magic, sau radacina digitala).
        //
        // Hint: ai nevoie de DOUA bucle while imbricate:
        //   - una externa: cat timp numar >= 10
        //   - una interna: calculeaza suma cifrelor (ca la while09)
        //   apoi numar = suma si reia.
        //
        // Exemplu output (numar = 9875):
        //   9875 -> 29 -> 11 -> 2
        //   Cifra magica = 2
        // Exemplu output (numar = 7):
        //   7
        //   Cifra magica = 7
        // ============================================================

        // TODO
    }

    public static void while19() {
        // ============================================================
        // WHILE 19 - CONVERSIE DIN BAZA 10 IN BAZA 2
        // ============================================================
        // Declara o variabila int `numar` (pozitiv). Afiseaza
        // reprezentarea lui in binar (cifre 0 si 1).
        //
        // Hint: numar % 2 da ultima cifra binara, numar / 2 elimina-o.
        //       Cifrele ies in ORDINE INVERSA — construieste rezultatul
        //       intr-un String prin prefixare: rezultat = uc + rezultat.
        //
        // Exemplu output (numar = 13):
        //   13 in binar = 1101
        // Exemplu output (numar = 5):
        //   5 in binar = 101
        // ============================================================

        // TODO
    }

    public static void while20() {
        // ============================================================
        // WHILE 20 - DE CATE ORI APARE O CIFRA INTR-UN NUMAR
        // ============================================================
        // Declara doua variabile int `numar` (pozitiv) si `cifra`
        // (0-9). Afiseaza de cate ori apare cifra in numar.
        //
        // Hint: extragi cifrele cu % 10 si / 10. Pentru fiecare,
        //       verifici daca e egala cu `cifra` si incrementezi un
        //       contor.
        //
        // Exemplu output (numar = 12347747, cifra = 7):
        //   Cifra 7 apare de 3 ori in 12347747
        // Exemplu output (numar = 1111, cifra = 1):
        //   Cifra 1 apare de 4 ori in 1111
        // ============================================================

        // TODO
    }
}
