#include <stdio.h>
#include <stdlib.h>


typedef struct {
  double x;
  double y;
  float r;
} KRUZNICA; // musi byt velkym, nezabudni bodkociarku

int main() {
  KRUZNICA kruznica1, kruznica2, kruznica3;

  kruznica1.x = 2.5;
  kruznica1.y = 2;
  kruznica1.r = 4;

  kruznica3.r = 5;

  kruznica2 = kruznica1;

  printf("Kruznica k2 ma stred[%.2lf,%.2lf] a polomer %.2f\n", kruznica2.x,
         kruznica2.y, kruznica2.r);

  return 0;
}