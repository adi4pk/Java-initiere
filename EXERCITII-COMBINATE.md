# Exercitii combinate – Recap Java initiere

Exercitii care **combina** notiunile invatate pana acum:
`Conditionale` + `ConditionaleNivelMediu` + `BuclaFor` + `BuclaWhile` + `Vectori` + `Liste` + `Stringuri`.

Fiecare exercitiu nu mai e despre UN topic — ci foloseste **3-5 notiuni in acelasi timp**, asa cum se intampla in cod real.

---

## Cum lucrezi

Creeaza o clasa noua `ExercitiiCombinate.java` in `src/`:

```java
public class ExercitiiCombinate {

    public static void ex01() {
        // TODO
    }

    public static void ex02() {
        // TODO
    }

    // ... pana la ex12()
}
```

In `Main.java` apelezi cate o metoda pe rand (`ExercitiiCombinate.ex01();`).

Toate datele se declara DIRECT in cod, nu citesti de la tastatura.

---

## Ex 01 — Catalog note clasa

**Combina:** vectori paraleli + `for` + conditionale + max cu pozitie + medie + procent

Ai doi vectori paraleli (pe aceeasi pozitie e acelasi elev):

```java
String[] elevi = {"Ana", "Ion", "Maria", "Vlad", "Diana", "George", "Ioana", "Radu", "Elena", "Mihai"};
int[] note    = {  7,    4,    9,       5,       10,       3,       8,       6,       9,       4};
```

Afiseaza:

1. Calificativul fiecarui elev (Excelent ≥ 9, Bine ≥ 7, Suficient ≥ 5, Insuficient altfel). Format: `Ana: 7 => Bine`.
2. Cati elevi sunt promovati (nota ≥ 5) si cati corigenti (nota < 5).
3. Procentul promovatilor din total, cu 2 zecimale.
4. Media clasei cu 2 zecimale.
5. Numele si nota elevului cu nota maxima.

**Exemplu output:**
```
Ana: 7 => Bine
Ion: 4 => Insuficient
...
Promovati: 7
Corigenti: 3
Procent promovati: 70.00%
Media clasei: 6.50
Maxim: Diana cu 10
```

---

## Ex 02 — Statistici pe cifrele unor numere

**Combina:** vector + `while` (extragere cifre) + max + medie + numarare

```java
int[] v = {1234, 56, 7890, 11, 4321, 99, 100200, 7};
```

Pentru fiecare numar, calculeaza suma cifrelor. Afiseaza:

1. Suma cifrelor pentru fiecare numar in parte (`1234 -> 10`).
2. Numarul care are CEA MAI MARE suma de cifre.
3. Cate numere au suma cifrelor para.
4. Media sumelor de cifre (cu 2 zecimale).
5. Doar numerele care au mai mult de 3 cifre.

**Exemplu output:**
```
1234 -> 10
56   -> 11
...
Suma maxima: 100200 cu suma cifrelor 3
Suma para: 4 numere
Media sumelor: 8.25
Cu peste 3 cifre: 1234, 7890, 4321, 100200
```

---

## Ex 03 — Verificator parola puternica

**Combina:** `String` + `charAt` + `for` + conditionale + flag-uri `boolean`

```java
String parola = "Java2025";
```

Verifica daca parola e puternica. Reguli:

- minim 8 caractere
- contine cel putin o litera mare (A-Z)
- contine cel putin o cifra (0-9)
- nu contine spatii

Afiseaza:

- `Parola puternica` daca trece toate regulile
- altfel, afiseaza LISTA cu problemele (toate, nu doar prima)

**Exemplu output (parola = "java2025"):**
```
Probleme:
- nu contine litera mare
```

**Exemplu output (parola = "Java 25"):**
```
Probleme:
- sub 8 caractere
- contine spatiu
```

---

## Ex 04 — Top vanzari lunare

**Combina:** vector + suma + medie + max/min cu pozitie + numarare + procent

```java
int[] vanzari = {120, 0, 340, 200, 50, 0, 500, 280, 100, 0,
                 450, 380, 600, 0,  120, 220, 300, 0, 410, 520,
                 100, 200, 300, 400, 500, 0, 150, 280, 380, 460};
```

(30 de zile, vanzari in lei. 0 = magazin inchis.)

Afiseaza:

1. Suma totala a vanzarilor.
2. Media zilnica (cu 2 zecimale).
3. Cate zile au depasit media si ce procent reprezinta.
4. Ziua (1-30) cu cele mai mari vanzari.
5. Cate zile a fost magazinul inchis (vanzari = 0).

**Exemplu output:**
```
Total vanzari: 8030 lei
Media zilnica: 267.67 lei
Zile peste medie: 12 (40.00%)
Cea mai buna zi: ziua 13 cu 600 lei
Zile inchis: 5
```

---

## Ex 05 — Joc Piatra-Foarfeca-Hartie pe 10 runde

**Combina:** vectori paraleli + `for` + conditionale complexe + numarare

```java
String[] jucator1 = {"piatra", "hartie",  "foarfeca", "piatra", "hartie",
                     "foarfeca", "piatra", "hartie", "foarfeca", "piatra"};
String[] jucator2 = {"foarfeca", "hartie", "piatra",  "hartie", "foarfeca",
                     "foarfeca", "piatra", "piatra", "hartie",  "foarfeca"};
```

Pentru fiecare runda, determina cine castiga (regula: piatra bate foarfeca, foarfeca bate hartie, hartie bate piatra). Afiseaza:

1. Pentru fiecare runda: `Runda X: jucator1 vs jucator2 => castiga Y` (sau `egal`).
2. Cate runde a castigat jucatorul 1, cate jucatorul 2, cate au fost egale.
3. Cine castiga partida (sau `partida egala`).

**Exemplu output:**
```
Runda 1: piatra vs foarfeca => castiga 1
Runda 2: hartie vs hartie => egal
...
Scor: J1=4, J2=3, Egal=3
Castigator: Jucator 1
```

---

## Ex 06 — Anagrame

**Combina:** `String` + `charAt` + vector frecvente + comparatie vectori

Doua cuvinte sunt **anagrame** daca contin EXACT aceleasi litere, in numar egal, dar in ordine diferita (ex: `"listen"` si `"silent"`).

```java
String cuvant1 = "listen";
String cuvant2 = "silent";
```

Verifica si afiseaza `anagrame` sau `NU sunt anagrame`. Cerinte:

1. Daca au lungimi diferite => `NU sunt anagrame`.
2. Numara de cate ori apare fiecare litera in cuvant1 (vector cu 26 de pozitii pentru a-z).
3. Scade aparitiile literelor din cuvant2.
4. Daca toate pozitiile sunt 0 la final => anagrame. Altfel nu.

Foloseste `.toLowerCase()` ca sa nu te incurci cu majuscule.

**Exemplu output:**
```
listen vs silent => anagrame
java vs script => NU sunt anagrame
```

---

## Ex 07 — Validator CNP simplificat

**Combina:** `String` + `length` + `charAt` + conditionale + flag-uri

```java
String cnp = "1900315123456";
```

CNP romanesc are 13 caractere. Verifica:

1. Are EXACT 13 caractere?
2. Toate caracterele sunt cifre (nu litere, spatii, simboluri)?
3. Prima cifra e 1, 2, 5 sau 6 (validari de baza pentru tipul cetateanului)?

Afiseaza `CNP valid` sau lista cu problemele gasite.

**Exemplu output (cnp = "1900315123456"):**
```
CNP valid
```

**Exemplu output (cnp = "19A0315 23456"):**
```
Probleme:
- contine caractere non-cifra
```

---

## Ex 08 — Tombola

**Combina:** `ArrayList` + `contains` / `indexOf` + `for` + numarare + procent

```java
ArrayList<Integer> castigatoare = new ArrayList<>(Arrays.asList(7, 14, 23, 35, 41));
ArrayList<Integer> bileteleMele = new ArrayList<>(Arrays.asList(3, 14, 22, 41, 50, 7, 11));
```

Afiseaza:

1. Cate dintre biletele tale au iesit castigatoare.
2. Care anume au iesit castigatoare (afiseaza lista).
3. Procentul de castig din biletele tale (cu 2 zecimale).
4. Daca ai castigat MACAR un bilet => `Felicitari!`. Altfel => `Mai incearca`.

**Exemplu output:**
```
Castigate: 3 bilete
Numerele castigate: [14, 41, 7]
Procent castig: 42.86%
Felicitari!
```

---

## Ex 09 — Statistici text

**Combina:** `String` + `length` + `charAt` + `for` + conditionale (vocale) + numarare + procent

```java
String text = "Salut, eu invat Java in 2025!";
```

Calculeaza si afiseaza:

1. Cate caractere are textul (cu spatii).
2. Cate caractere fara spatii.
3. Cate vocale (a, e, i, o, u — si majuscule, si minuscule).
4. Cate consoane (litere care nu sunt vocale).
5. Cate cifre (0-9).
6. Cate cuvinte (foloseste spatiul ca separator — sau `text.split(" ").length`).
7. Procentul de vocale din totalul literelor (cu 2 zecimale).

**Exemplu output:**
```
Caractere total: 29
Caractere fara spatii: 24
Vocale: 9
Consoane: 11
Cifre: 4
Cuvinte: 6
Procent vocale: 45.00%
```

---

## Ex 10 — Cea mai lunga serie de elemente identice

**Combina:** vector + `for` + contoare + max + memorie stare anterioara

```java
int[] v = {1, 2, 2, 3, 3, 3, 1, 1, 1, 1, 5, 5};
```

Gaseste cea mai lunga SUBSECVENTA de elemente consecutive identice si afiseaza:

1. Lungimea celei mai lungi serii.
2. Valoarea care formeaza acea serie.

Ideea: parcurgi vectorul, tii un contor pentru seria curenta. Daca elementul curent e egal cu anteriorul, incrementezi contorul. Daca nu, resetezi contorul la 1. Tii minte maximul vazut pana acum.

**Exemplu output (v = {1, 2, 2, 3, 3, 3, 1, 1, 1, 1, 5, 5}):**
```
Cea mai lunga serie: 4 de 1
```

**Exemplu output (v = {7, 7, 7, 8, 8, 9}):**
```
Cea mai lunga serie: 3 de 7
```

---

## Ex 11 — Clasament echipe sportive

**Combina:** vectori paraleli + `for` + max/min cu pozitie + sortare manuala cu indexare paralela

```java
String[] echipe   = {"Steaua", "Dinamo", "Rapid", "CFR", "FCSB", "UTA"};
int[] victorii    = {12,        10,       8,       11,    9,      6};
int[] egaluri     = {4,         5,        8,       3,     6,      9};
int[] infrangeri  = {2,         3,        2,       4,     3,      3};
```

Reguli: victorie = 3 puncte, egal = 1 punct, infrangere = 0 puncte.

Afiseaza:

1. Puncte pentru fiecare echipa (`Steaua: 40 pct`).
2. Numele echipei campioane (cele mai multe puncte).
3. Numele echipei care retrogradeaza (cele mai putine puncte).
4. Clasamentul COMPLET, sortat descrescator dupa puncte. Cand sortezi vectorul de puncte, trebuie sa muti SIMULTAN si numele in vectorul `echipe` (pentru ca sunt paraleli).

**Exemplu output:**
```
Steaua: 40 pct
Dinamo: 35 pct
...

Campioana: Steaua
Retrogradeaza: UTA

Clasament:
1. Steaua - 40
2. CFR - 36
3. Dinamo - 35
4. Rapid - 32
5. FCSB - 33
6. UTA - 27
```

---

## Ex 12 — Codare Caesar

**Combina:** `String` + `charAt` + conditionale + aritmetica `%` + construire `String` nou

Codul Caesar deplaseaza fiecare litera cu un numar de pozitii in alfabet. Ex: pentru deplasare 3, `a -> d`, `b -> e`, ..., `z -> c` (se ruleaza la final).

```java
String mesaj = "Salut, Java!";
int deplasare = 3;
```

Afiseaza mesajul codat. Reguli:

1. Literele MICI raman litere mici (`a-z`).
2. Literele MARI raman litere mari (`A-Z`).
3. Caracterele care nu sunt litere (spatii, virgule, cifre, semne de punctuatie) raman NESCHIMBATE.
4. Daca depasesti `z` / `Z`, te intorci la `a` / `A` (foloseste `% 26`).

Pentru o litera mica `c`, formula este:
- pozitia in alfabet: `c - 'a'` (un numar 0-25)
- adaugi deplasarea si iei modulo 26
- aduni la loc `'a'` ca sa obtii caracterul nou

**Exemplu output (mesaj = "Salut, Java!", deplasare = 3):**
```
Vdoxw, Mdyd!
```

**Exemplu output (mesaj = "abc xyz", deplasare = 2):**
```
cde zab
```

---

## Cum stii ca ai terminat

- Toate `ex01()` ... `ex12()` ruleaza fara eroare.
- Output-ul tau corespunde cu exemplele.
- In `Main.java` poti decomenta orice metoda si sa vezi rezultatul ei.

Daca te blochezi la una, sari peste — nu sunt in ordine de dificultate stricta, fiecare combina notiuni diferite.
