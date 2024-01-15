#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


typedef struct{
    float x;
    float y;
}BOD;

typedef struct{
    
    float polomer;
    BOD stred;

}KRUZNICA;




int main() {
    BOD bod;
    KRUZNICA kruznica1;
    float distanceSB;

    printf("Zadajte suracnicu x pre stred kruznice: ");
    scanf("%f",&kruznica1.stred.x);
    printf("Zadajte suracnicu y pre stred kruznice: ");
    scanf("%f",&kruznica1.stred.y);
    
    printf("Zadajte polomer kruznice: ");
    scanf("%f",&kruznica1.polomer);



    printf("Zadajte suradnicu x pre bod: ");
    scanf("%f",&bod.x);
    printf("Zadajte suradnicu y pre bod: ");
    scanf("%f",&bod.y);

    distanceSB = sqrt((pow((bod.x-kruznica1.stred.x), 2)+pow((bod.y-kruznica1.stred.y), 2)));

    printf("Vzdialenost bodu B od stredu S je: %f\n\n",distanceSB);

    if (distanceSB == kruznica1.polomer){
        printf("Bod B lezi na kruznici\n");
    }else if (distanceSB == 0){
        printf("Bod B ma lezi v strede kruznice S\n");
    }else if (distanceSB > kruznica1.polomer){
        printf("Bod B lezi mimo kruznice\n");
    }else if (distanceSB < kruznica1.polomer){
        printf("Bod B lezi vnutri kruznice\n");
    }

    
    return 0;
}