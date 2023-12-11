#include <stdio.h>
#include <stdlib.h>

// euklidov algoritmus na vypocet NSD dvoch cisel

int NSD(int x, int y);

int main() {
    int x, y;


    do {
        printf("zadaj 2 cele nezaporne cisla: ");
        scanf("%d %d", &x, &y);
    } while(x < 0 || y < 0);

    printf("NSD(%d, %d) = %d", x, y, NSD(x, y));

    return 0;
}

int NSD(int x, int y) {
    if(x == 0) {
        return y;
    }
    if(y == 0) {
        return x;
    }


    if(x > y) {
        return NSD(x % y, y);
    }
    if(y > x) {
        return NSD(x, y % x);
    }
}