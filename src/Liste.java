import java.util.ArrayList;

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
    }
}
