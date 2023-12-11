#include <stdio.h>
#include <stdlib.h>

void uloha5() {
  FILE *f = fopen("cisla.txt", "w");

  for (int i = 1; i < 21; i++) {
    fprintf(f, "%c%.2f\n", 36, 3.14 * i);
  }

  if (fclose(f) == EOF) {
    printf("nevies zatvarat subor\n");
  }
}

void uloha6() {
  float cislo;
  int pocet = 0;
  float sucet;

  FILE *f;

  if ((f = fopen("cisla.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while ((fscanf(f, "$%f\n", &cislo)) != EOF) {
    sucet += cislo;
    pocet++;
  }

  

  printf("%.2f", sucet / pocet);

  if (fclose(f) == EOF) {
    printf("nevies zatvarat subor\n");
  }
}

void uloha7() {
  int c1;
  int c2;
  int nezhodne = 0;

  FILE *f1;
  FILE *f2;

  if ((f1 = fopen("pismena1.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  if ((f2 = fopen("pismena2.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while ((c1 = getc(f1)) != EOF && (c2 = getc(f2)) != EOF) {
    if (c1 != c2) {
      nezhodne++;
    }
  }
  if (nezhodne == 0) {
    printf("subory su zhodne");
  } else {
    printf("subory sa nezhoduju v %d miestach", nezhodne);
  }
}

void uloha8() {
  FILE *f;

  if ((f = fopen("neexistuje.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }
}

void uloha9() {}

void uloha10() {
  char odpoved = 'a';
  int cyklus = 0;

  while (odpoved == 'a' || odpoved == 'A') {
    cyklus++;

    for (int i = 1; i <= 10; i++) {
      printf("%d\n", i * cyklus);
    }

    printf("Mam pokracovat? [a/n]: ");
    scanf(" %c", &odpoved);
  }
}

void uloha11() {
  int cislo;
  int sucet = 0;
  int nic;

  FILE *f;

  if ((f = fopen("cisla.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while ((fscanf(f, "$%d.%d\n", &cislo, &nic)) != EOF) {
    sucet += cislo;
  }

  printf("%d\n", sucet);

  if (fclose(f) == EOF) {
    printf("nevies zatvarat subor\n");
  }
}

int main() {
  uloha6();

  return 0;
}

