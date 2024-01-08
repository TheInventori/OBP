#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// vytvorte program, ktory nahradi v retazci lubovolny znak inym lubovolnym
// znakom vrati pocet vyskytov lubovolneho retazca pripoji retazec2 na koniec
// retazca1 zmeni vsetky pismena na velke a vytvori z textu schody smerom dole

int main() {
  char text[100];
  char letter1;
  char letter2;
  int count = 0;

  printf("zadaj retazec: ");
  gets(text);

  printf("zadaj hladany znak: ");
  scanf(" %c", &letter1);

  printf("zadaj nahradny znak: ");
  scanf(" %c", &letter2);

  for (int i = 0; i < strlen(text); i++) {
    if (text[i] == letter1) {
      text[i] = letter2;
      count++;
    }
  }

  printf("\n%s\n%d\n", text, count);

  for (int i = 0; i < strlen(text); i++) {
    if (text[i] >= 97 && text[i] <= 122) {
      text[i] -= 32;
    }

    printf("\n");

    for (int j = 0; j < i; j++) {
      printf(" ");
    }

    printf("%c", text[i]);
  }

  return 0;
}