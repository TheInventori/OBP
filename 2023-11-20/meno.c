#include <stdlib.h>
#include <stdio.h>

/*
funkcia citaj_riadok, precita z kavesnice jeden riadok a spocita medzery a male pismena
return 1; - aspon 1 znak
return 0; - 0 znakov
*/

int citaj_riadok(int *space, int *letter) {
    int znak;

    do {
        znak = getchar();
        
        if(znak >= 'a' && znak <= 'z') {
            *letter += 1;
        }
        if(znak == ' ') {
            *space += 1;
        }
    } while(znak != '\n');
    
    if(*letter == 0 && *space == 0 && znak == '\n') {
        return 0;
    } 
    if(znak == '\n') {
        return 1;
    }
}

int main() {
    int space = 0, letter = 0;

    if(citaj_riadok(&space, &letter) == 0) {
        printf("prazdny riadok\n");
        return 0;
    }

    printf("pocet malych pismen: %d\n", letter);
    printf("pocet medzier: %d\n", space);

    return 1;
}