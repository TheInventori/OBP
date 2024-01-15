#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Urcte vzajomnu polohu v dvojrozmernom priestore

typedef struct{
    double x;
    double y;
} BOD;

typedef struct{
    double r;
    BOD stred;
} KRUZNICA;

int main() {
    BOD bod1;
    KRUZNICA kruznica1;

    double distance;

    printf("Zadaj prvu suradnicu stredu kruznice: ");
    scanf("%lf", &kruznica1.stred.x);
    printf("Zadaj druhu suradnicu stredu kruznice: ");
    scanf("%lf", &kruznica1.stred.y);
    printf("Zadaj polomer kruznice: ");
    scanf("%lf", &kruznica1.r);
    printf("Zadaj prvu suradnicu bodu: ");
    scanf("%lf", &bod1.x);
    printf("Zadaj druhu suradnicu bodu: ");
    scanf("%lf", &bod1.y);

    distance = sqrt((pow((kruznica1.stred.x - bod1.x), 2) + pow((kruznica1.stred.y - bod1.y), 2)));

    printf("%lf\n", distance);
    printf("%lf %lf %lf %lf %lf\n", kruznica1.stred.x, kruznica1.stred.y, kruznica1.r, bod1.x, bod1.y);

    if(distance < 0) {
        distance = abs(distance);
    }

    if(distance == 0) {
        printf("Bod je zaroven aj stredom kruznice\n");
    }
    if(distance == kruznica1.r) {
        printf("Bod lezi na kruznici\n");
    }
    if(distance > kruznica1.r) {
        printf("Bod lezi mimo kruznice\n");
    }
    if(distance < kruznica1.r && distance != 0) {
        printf("Bod lezi v kruznici\n");
    }


    return 0;
}