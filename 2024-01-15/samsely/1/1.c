#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct 
{
    float x;
    float y;
}BOD;

typedef struct 
{
    float polomer;
    BOD stred;
}KRUZNICA;

int main(int argc, char const *argv[])
{
    int koniec = 1, znakk;
    while (koniec)
    {
        int znak, pokracovanie = 1;
        BOD bod;
        KRUZNICA kruznica;

        printf("Zadaj polomer kruznice: ");
        scanf(" %f", &kruznica.polomer);
        printf("Zadaj bod x stredu kruznice: ");
        scanf(" %f", &kruznica.stred.x);
        printf("Zadaj bod y stredu kruznice: ");
        scanf(" %f", &kruznica.stred.y);

        while (pokracovanie){
            printf("Zadaj bod x vlastneho bodu: ");
            scanf(" %f", &bod.x);
            printf("Zadaj bod y vlastneho bodu: ");
            scanf(" %f", &bod.y);

            float vzdialenost = sqrt(pow(bod.x-kruznica.stred.x, 2) + pow(bod.y-kruznica.stred.y, 2));
            
            if (vzdialenost == kruznica.polomer)
                printf("Bod je na kruznici\n");
            else if (vzdialenost == 0)
                printf("Bod je totozny so stredom kruznice\n");
            else if (vzdialenost > kruznica.polomer)
                printf("Bod je mimo kruznice\n");
            else
                printf("Bod je vo vnutri kruznice\n");
            
            printf("Chces pokracovat s touto kruznicou? <A/N> ");
            scanf(" %d", &znak);

            if ((znak != 'A') && (znak != 'a'))
                pokracovanie = 0;
        }
        printf("Chces vytvorit novu kruznicu? <A/N>");
        scanf(" %d", &znakk);

        if ((znakk != 'A') && (znakk != 'a'))
            koniec = 0;
    }

    return 0;
}