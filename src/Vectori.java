import java.util.Arrays;

public class Vectori {

    public static void vec01() {
        // ============================================================
        // VEC 01 - DECLARARE SI AFISARE
        // ============================================================
        // Declara un vector de int cu 5 valori (la alegere). Afiseaza
        // fiecare element pe o linie noua folosind o bucla for.
        //
        // Hint: int[] v = {3, 7, 2, 9, 4};
        //       for (int i = 0; i < v.length; i++) { ... }
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   3
        //   7
        //   2
        //   9
        //   4
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};

        for(int i=0; i<v.length; i++){
            int e = v[i];
            System.out.println(e);
        }
    }

    public static void vec02() {
        // ============================================================
        // VEC 02 - SUMA ELEMENTELOR
        // ============================================================
        // Declara un vector de int. Calculeaza si afiseaza suma
        // tuturor elementelor.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   Suma = 25
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};
        int suma = 0;
        for(int i =0; i<v.length; i++){
            suma = suma+ v[i];
        }
        System.out.println(suma);
    }

    public static void vec03() {
        // ============================================================
        // VEC 03 - MEDIA ELEMENTELOR
        // ============================================================
        // Declara un vector de int. Calculeaza si afiseaza media
        // aritmetica a elementelor cu 2 zecimale.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   Media = 5.00
        // ============================================================

        // TODO

        int [] v = {3, 7, 2, 9, 4};
        int media = 0;
        int ct = 0;
        for(int i =0; i<v.length; i++){
            ct = ct+ v[i];
        }
        media = ct/v.length;

        System.out.println("Media aritmetica este: " +media);

    }

    public static void vec04() {
        // ============================================================
        // VEC 04 - MAXIMUL DIN VECTOR
        // ============================================================
        // Declara un vector de int. Afiseaza cea mai mare valoare.
        //
        // Hint: porneste cu int max = v[0]; parcurgi vectorul si daca
        //       gasesti unul mai mare, il pui in max.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   Max = 9
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};
        int max = v[0];

        for(int i=0; i<v.length; i++){

            if(v[i] > max){
                max = v[i];
            }
        }

        System.out.println("Maximumul este " +max);
    }

    public static void vec05() {
        // ============================================================
        // VEC 05 - MINIMUL DIN VECTOR
        // ============================================================
        // Declara un vector de int. Afiseaza cea mai mica valoare.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   Min = 2
        // ============================================================

        // TODO

        int[] v={3, 7, 2, 9, 4};
        int min = v[0];

        for(int i=0; i<v.length; i++){
            if(v[i] < min){
                min = v[i];
            }
        }

        System.out.println("Minimumul este " +min);
    }

    public static void vec06() {
        // ============================================================
        // VEC 06 - CATE ELEMENTE PARE
        // ============================================================
        // Declara un vector de int. Numara cate elemente pare sunt si
        // afiseaza numarul lor.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   Pare: 2
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};
        int pare = 0;

        for(int i =0;i<v.length; i++){
            if(v[i] % 2 == 0){
                pare+=1;
            }
        }

        System.out.println("Pare: " + pare);
    }

    public static void vec07() {
        // ============================================================
        // VEC 07 - CAUTA O VALOARE
        // ============================================================
        // Declara un vector de int si o variabila int `cautat`.
        // Afiseaza:
        //   - "Gasit la pozitia X"   daca exista
        //   - "Nu exista"            daca nu
        // Daca apare de mai multe ori, ia prima aparitie.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}, cautat = 9):
        //   Gasit la pozitia 3
        // Exemplu output (cautat = 8):
        //   Nu exista
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};

        int cautat = 9;
        boolean gasit =false;

        for(int i=0; i<v.length&&gasit==false; i++){
            if(v[i] == cautat){
                System.out.println("Gasit la pozitia " +i);
                gasit = true;
            }
        }
    }

    public static void vec08() {
        // ============================================================
        // VEC 08 - INVERSEAZA VECTORUL (AFISARE)
        // ============================================================
        // Declara un vector de int. Afiseaza elementele in ordine
        // inversa, fiecare pe o linie.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   4
        //   9
        //   2
        //   7
        //   3
        // ============================================================

        // TODO

        int[] v = {3, 7, 2, 9, 4};
        for(int i=v.length-1; i>=0; i--){
            System.out.println(v[i]);
        }
    }

    public static void vec09() {
        // ============================================================
        // VEC 09 - NUMARA APARITIILE UNUI ELEMENT
        // ============================================================
        // Declara un vector si o variabila int `cifra`. Afiseaza de
        // cate ori apare cifra in vector.
        //
        // Exemplu output (v = {3, 7, 2, 9, 4, 7, 7}, cifra = 7):
        //   7 apare de 3 ori
        // ============================================================

        // TODO

        int [] v = {3, 7, 2, 9, 4, 7, 7};

            int cifra = 7;
            int ct=0;
            for(int i=0; i<v.length; i++){
                if(v[i] == cifra){
                    ct+=1;
                }
            }
        System.out.println(cifra + " apare de " + ct + " ori");
    }

    public static void vec10() {
        // ============================================================
        // VEC 10 - SORTARE BUBBLE SORT
        // ============================================================
        // Declara un vector de int. Sorteaza-l crescator folosind
        // bubble sort, apoi afiseaza vectorul sortat.
        //
        // Algoritm:
        //   for (int i = 0; i < n - 1; i++)
        //     for (int j = 0; j < n - 1 - i; j++)
        //       if (v[j] > v[j+1]) swap(v[j], v[j+1])
        //
        // Exemplu output (v = {3, 7, 2, 9, 4}):
        //   2 3 4 7 9
        // ============================================================

        // TODO

        int [] n = {3, 7, 2, 9, 4};
        for(int i=0; i<n.length - 1; i++){
            for(int j=0; j < n.length - 1 - i; j++){
                if(n[j] > n[j+1]){
                    int aux = n[j];
                    n[j] = n[j+1];
                    n[j+1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(n));
        System.out.println(n);
    }
}
