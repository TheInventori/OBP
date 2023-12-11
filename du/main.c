#include <stdio.h>
#include <stdlib.h>

void uloha1() {
  int c;

  FILE *f;
  if ((f = fopen("znaky.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  do {
    switch (c = getc(f)) {
    case 'q':
      fclose(f);
      return;
    case 'Q':
      fclose(f);
      return;
    case '0':
      printf("Bola to nula.\n");
      break;
    case '1':
      printf("Bola to jednotka.\n");
      break;
    case EOF:
      fclose(f);
      return;
    default:
      break;
    }
  } while (f);
}

void uloha2() {
  int c;

  FILE *fr;
  FILE *fw = fopen("velky.txt", "w");

  if ((fr = fopen("pismena.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while ((c = getc(fr)) != EOF) {
    printf("%c", c);

    if (c > 96 && c < 123) {
      c = c - ' ';
    }

    putc(c, fw);
  }

  if (fclose(fw) == EOF) {
    printf("nevies zatvarat subory\n");
  }

  if (fclose(fr) == EOF) {
    printf("nevies zatvarat subory\n");
  }
}

void uloha3() {
  int pocet = 0;

  FILE *f;

  if ((f = fopen("pismena.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while (getc(f) != EOF) {
    pocet++;
  }

  if (fclose(f) == EOF) {
    printf("nevies zatvarat subory\n");
  }

  printf("Pocet znakov v subore: %d\n", pocet);
}

void uloha4() {
  int c;

  FILE *fr;
  FILE *fw = fopen("kolik.txt", "w");

  if ((fr = fopen("pismena.txt", "r")) == NULL) {
    printf("nevies programovat\n");
    return;
  }

  while ((c = getc(fr)) != EOF) {
    int count = 0;

    do {
      putc(c, fw);
      count++;
    } while ((c = getc(fr)) != '\n');

    putc(c, fw);
    fprintf(fw, "%d", count);
    putc(c, fw);
  }

  if (fclose(fw) == EOF) {
    printf("nevies zatvarat subory\n");
  }

  if (fclose(fr) == EOF) {
    printf("nevies zatvarat subory\n");
  }
}

int main() {
  uloha2();

  return 0;
}
