#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 


int main() {
    int num;
    char *text = (char*) malloc(sizeof(char) * 100);

    printf("Napis text: ");
    scanf(" %s", text);

    printf("Napise o kolko chces posunut: ");
    scanf(" %d", &num);

    for(int i = 0; i < strlen(text); i++) {
        if(text[i] + num > 122) {
            text[i] = text[i] + num - 26;
        } else {
            text[i] = text[i] + num;
        }
    }

    printf("\n\n%s\n", text);

    return 0;
}