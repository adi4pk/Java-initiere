public class BuclaFor {

    public static void for01() {
        // ============================================================
        // FOR 01 - NUMERELE DE LA 1 LA 10
        // ============================================================
        // Folosind o bucla for, afiseaza numerele de la 1 la 10,
        // fiecare pe o linie noua.
        //
        // Exemplu output:
        //   1
        //   2
        //   3
        //   ...
        //   10
        // ============================================================

        // TODO

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void for02() {
        // ============================================================
        // FOR 02 - NUMERE DESCRESCATOR
        // ============================================================
        // Folosind for, afiseaza numerele de la 10 la 1, fiecare pe o
        // linie noua.
        //
        // Exemplu output:
        //   10
        //   9
        //   8
        //   ...
        //   1
        // ============================================================

        // TODO

        for(int i=10; i>0; i--){
            System.out.println(i);
        }
    }

    public static void for03() {
        // ============================================================
        // FOR 03 - NUMERE IMPARE PANA LA 19
        // ============================================================
        // Folosind for (cu pas 2), afiseaza numerele impare de la 1
        // la 19, fiecare pe o linie noua.
        //
        // Exemplu output:
        //   1
        //   3
        //   5
        //   ...
        //   19
        // ============================================================

        // TODO

        for(int i=1; i<20; i= i+2){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public static void for04() {
        // ============================================================
        // FOR 04 - PATRATELE PRIMELOR 10 NUMERE
        // ============================================================
        // Folosind for, afiseaza patratele numerelor de la 1 la 10,
        // fiecare pe o linie noua.
        //
        // Exemplu output:
        //   1 * 1 = 1
        //   2 * 2 = 4
        //   3 * 3 = 9
        //   ...
        //   10 * 10 = 100
        // ============================================================

        // TODO

        for(int i=0; i<11; i++){
            System.out.println(i * i);
        }
    }

    public static void for05() {
        // ============================================================
        // FOR 05 - CUBURILE PRIMELOR 5 NUMERE
        // ============================================================
        // Folosind for, afiseaza cuburile (i * i * i) numerelor de
        // la 1 la 5.
        //
        // Exemplu output:
        //   1 * 1 * 1 = 1
        //   2 * 2 * 2 = 8
        //   3 * 3 * 3 = 27
        //   4 * 4 * 4 = 64
        //   5 * 5 * 5 = 125
        // ============================================================

        // TODO

        for(int i=1; i<6;i++){
            System.out.println(i * i * i);
        }
    }

    public static void for06() {
        // ============================================================
        // FOR 06 - MULTIPLII LUI K
        // ============================================================
        // Declara o variabila int `k`. Folosind for, afiseaza primii
        // 10 multipli ai lui k (k * 1, k * 2, ... k * 10).
        //
        // Exemplu output (k = 7):
        //   7
        //   14
        //   21
        //   ...
        //   70
        // ============================================================

        // TODO

        int k = 7;
        for(int i=1; i<11; i++){
            int x = k * i;
            System.out.println(x);
        }
    }

    public static void for07() {
        // ============================================================
        // FOR 07 - SUMA DE LA 1 LA N
        // ============================================================
        // Declara o variabila int `n`. Folosind for, calculeaza si
        // afiseaza suma 1 + 2 + ... + n.
        //
        // Exemplu output (n = 100):
        //   Suma de la 1 la 100 = 5050
        // ============================================================

        // TODO

        int n = 100;
        int x = 0;
        for(int i =1;i<n+1; i++){

            x = x+i;
        }
        System.out.println("n = "+n + ". Suma de la 1 la n este " +x);
    }

    public static void for08() {
        // ============================================================
        // FOR 08 - SUMA NUMERELOR PARE PANA LA N
        // ============================================================
        // Declara o variabila int `n`. Folosind for, calculeaza si
        // afiseaza suma tuturor numerelor pare de la 0 la n inclusiv.
        //
        // Exemplu output (n = 10):
        //   Suma parelor pana la 10 = 30
        // ============================================================

        // TODO

        int n = 10;
        int ct = 0;
        for(int i=0; i<n+1; i++){
            if(i % 2 == 0){
                ct = ct + i;
            }
        }

        System.out.println("suma parelor este "+ct);
    }

    public static void for09() {
        // ============================================================
        // FOR 09 - CATI MULTIPLI DE 3 INTRE 1 SI N
        // ============================================================
        // Declara o variabila int `n`. Folosind for, numara cati
        // multipli ai lui 3 exista intre 1 si n inclusiv si afiseaza
        // numarul lor.
        //
        // Exemplu output (n = 20):
        //   Multipli de 3 intre 1 si 20: 6
        // ============================================================

        // TODO

        int n = 21;
        int ct = 0;
        for(int i =1; i<n+1; i++){
          if(i % 3 == 0){
              ct++;
          }
        }
        System.out.println("Multipli de 3 intre 1 si " +n + " : " +ct);

    }

    public static void for10() {
        // ============================================================
        // FOR 10 - PUTERILE LUI 2
        // ============================================================
        // Declara o variabila int `n`. Folosind for, afiseaza primele
        // n puteri ale lui 2 (2^1, 2^2, ... 2^n), fiecare pe o linie.
        //
        // Hint: tii o variabila int putere = 1 care se inmulteste cu
        //       2 la fiecare iteratie. Fara Math.pow.
        //
        // Exemplu output (n = 6):
        //   2 ^ 1 = 2
        //   2 ^ 2 = 4
        //   2 ^ 3 = 8
        //   2 ^ 4 = 16
        //   2 ^ 5 = 32
        //   2 ^ 6 = 64
        // ============================================================

        // TODO

        int n = 6;
        int putere = 1;
        for(int i =0; i<n+1; i++){
            System.out.println("rezultat: 2 ^ " +i + " = " +putere );
            putere = putere * 2;



        }
    }
}
