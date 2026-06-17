import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Liste {

    public static void list01() {
        // ============================================================
        // LIST 01 - CREEAZA SI ADAUGA
        // ============================================================
        // Creeaza un ArrayList<Integer>. Adauga 5 valori (la alegere)
        // cu .add(). Afiseaza lista intreaga.
        //
        // Hint:
        //   ArrayList<Integer> lista = new ArrayList<>();
        //   lista.add(10);
        //   System.out.println(lista);   // afiseaza [10, ...]
        //
        // Exemplu output (lista = {10, 20, 30, 40, 50}):
        //   [10, 20, 30, 40, 50]
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(lista);
    }

    public static void list02() {
        // ============================================================
        // LIST 02 - PARCURGE CU FOR
        // ============================================================
        // Creeaza un ArrayList<Integer> cu 5 valori. Parcurge-l cu
        // for clasic (folosind .size() si .get(i)) si afiseaza fiecare
        // element pe o linie.
        //
        // Hint:
        //   for (int i = 0; i < lista.size(); i++) {
        //       System.out.println(lista.get(i));
        //   }
        //
        // Exemplu output (lista = {10, 20, 30, 40, 50}):
        //   10
        //   20
        //   30
        //   40
        //   50
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
        Arrays.asList(5, 7, 8, 9, 10)
        );

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static void list03() {
        // ============================================================
        // LIST 03 - SUMA ELEMENTELOR
        // ============================================================
        // Creeaza un ArrayList<Integer> cu cateva valori. Calculeaza
        // si afiseaza suma.
        //
        // Exemplu output (lista = {3, 7, 2, 9, 4}):
        //   Suma = 25
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(3, 7, 2, 9, 4)
        );

        int sum = 0;

        for (int i =0; i<lista.size(); i++){
            sum = sum + lista.get(i);
        }

        System.out.println("Sum = " +sum);
    }

    public static void list04() {
        // ============================================================
        // LIST 04 - STERGE PE POZITIE
        // ============================================================
        // Creeaza un ArrayList<Integer>. Sterge elementul de pe pozitia
        // 2 cu .remove(int index). Afiseaza lista inainte si dupa.
        //
        // Exemplu output (lista = {10, 20, 30, 40, 50}):
        //   Inainte: [10, 20, 30, 40, 50]
        //   Dupa:    [10, 20, 40, 50]
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        lista.remove(2);
        System.out.println(lista);
    }

    public static void list05() {
        // ============================================================
        // LIST 05 - CONTAINS
        // ============================================================
        // Creeaza un ArrayList<String> cu nume (la alegere). Verifica
        // daca lista contine "Ion" si afiseaza:
        //   - "Da, exista" daca da
        //   - "Nu exista" daca nu
        //
        // Hint: lista.contains("Ion") returneaza boolean.
        //
        // Exemplu output (lista = {"Ana", "Ion", "Maria"}):
        //   Da, exista
        // ============================================================

        // TODO

        ArrayList<String> arrayStr = new ArrayList<>(
                Arrays.asList("Ana", "Ion", "Maria")
        );
        if(arrayStr.contains("Ion")){
//            return arrayStr.contains("Ion");
            System.out.println("DA, exista.");
        } else{
            System.out.println("NU, nu exista.");
        }

    }

    public static void list06() {
        // ============================================================
        // LIST 06 - INDEX OF
        // ============================================================
        // Creeaza un ArrayList<String>. Afiseaza pozitia primei
        // aparitii a "Maria" (sau -1 daca nu exista).
        //
        // Hint: lista.indexOf("Maria") returneaza int.
        //
        // Exemplu output (lista = {"Ana", "Ion", "Maria", "Maria"}):
        //   Maria este la pozitia 2
        // ============================================================

        // TODO

        ArrayList<String> listaStr = new ArrayList<>(
                Arrays.asList("Ana", "Ion", "Maria", "Maria")
        );

        int x = listaStr.indexOf("Maria");

        System.out.println("Maria este la pozitia " + x);
    }

    public static void list07() {
        // ============================================================
        // LIST 07 - CATE VALORI > 10
        // ============================================================
        // Creeaza un ArrayList<Integer>. Numara cate valori sunt
        // strict mai mari decat 10 si afiseaza numarul lor.
        //
        // Exemplu output (lista = {5, 12, 3, 20, 8, 15}):
        //   Mai mari decat 10: 3
        // ============================================================

        // TODO

        int ct = 0;

        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(5, 12, 3, 20, 8, 15)
        );

        for(int i=0; i<lista.size(); i++){
            if(lista.get(i)>10){
                ct+=1;
            }
        }

        System.out.println("Mai mari decat 10: " +ct);
    }

    public static void list08() {
        // ============================================================
        // LIST 08 - COPIE INTR-O LISTA NOUA
        // ============================================================
        // Creeaza un ArrayList<Integer> cu cateva valori. Creeaza
        // un AL DOILEA ArrayList<Integer> in care copiezi DOAR
        // valorile PARE din prima. Afiseaza-l.
        //
        // Exemplu output (lista = {3, 4, 7, 8, 10, 11}):
        //   Pare: [4, 8, 10]
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
          Arrays.asList(3, 4, 7, 8, 10, 11)
        );

        ArrayList<Integer> pare = new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            if(lista.get(i) % 2 == 0){
                pare.add(i);
            }
        }

        System.out.println("Lista pare: " +pare);
    }

    public static void list09() {
        // ============================================================
        // LIST 09 - MAXIMUL DIN LISTA
        // ============================================================
        // Creeaza un ArrayList<Integer> cu cateva valori. Afiseaza
        // valoarea maxima (fara sa folosesti Collections.max — fa-l cu
        // for).
        //
        // Exemplu output (lista = {3, 7, 2, 9, 4}):
        //   Max = 9
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(3, 7, 2, 9, 4)
        );

        int max = 0;
//        var var = 1;

        for(int i =0; i<lista.size()-1; i++){
            if(lista.get(i) < lista.get(i+1)){
                max = lista.get(i+1);
            }
        }
        System.out.println("cel mai mare nr. este: " +max);
    }

    public static void list10() {
        // ============================================================
        // LIST 10 - INVERSEAZA LISTA INTR-UNA NOUA
        // ============================================================
        // Creeaza un ArrayList<Integer> cu valori. Creeaza un al doilea
        // ArrayList in care pui elementele primului in ordine INVERSA.
        // Afiseaza ambele liste.
        //
        // Exemplu output (lista = {10, 20, 30}):
        //   Originala: [10, 20, 30]
        //   Inversata: [30, 20, 10]
        // ============================================================

        // TODO

        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(10, 20, 30)
        );

        ArrayList<Integer> inversata = new ArrayList<>();

        for(int i=lista.size()-1; i>-1; i--){
            inversata.add(lista.get(i));
        }

        System.out.println("Inversata: " +inversata);
    }
}
