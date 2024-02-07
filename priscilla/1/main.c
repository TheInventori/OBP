#include <stdio.h>

int main(){
  int delenec, delitel, vysledok;
  char lomka;
  
  scanf("%d/%d", &delenec, &delitel);

  vysledok = delenec/delitel;
  int desa = delenec % delitel;

  if (desa != 0)
    printf("%d", vysledok);
  else 
    printf("%d,%d", vysledok, desa);

}