# textove retazce v C

Pole znakov musi byt vzdy o 1 dlhsie ako dlzka textu, ktory do neho ideme vlozit

kazdy textovy retazec konci znakom `'\0'`

## Staticky retazec

```C
char text[5] = {'d', 'u', 'h', 'a', '\0'};

char text[5] = "duha";

char text[] = "duha";
```

### Praca s jenotlivymi znakmi retazca
```C
char text[] = "duha";

printf("%s\n", text);

text[0] = 'f';

printf("%s\n", text);

text[3] = '\0';

printf("%s\n", text);
```

### nacitanie a vypis retazca
```C
printf("Zadaj svoje meno: ");

char meno[51]; // 50 znakov + koniec retazca '\0'

scanf("%50s", meno); // %50s - uvedenie maximalnej dlzky retazca

printf("Ahoj %s", meno);
```

nacitavanie retazca sa ukonci medzerou

oprava: 
```C
scanf(" %50[^\n]s", meno); // medzera necha prazdne znaky v bufferi  [^\n] - nacita vsetko okrem noveho riadku
```


## Standardne funkcie pre pracu s retazcami
je nutne pripojit kniznicu string.h
`#include <string.h>`

- `strlen();`
  - vrati viditelnu dlzku retazca (bez znaku \0)
- `strcat();`
  - 2 textove retazce spoji do jedneho (v prvom retazci musi byt dost miesta)
  - ```C
    char text[30] = "srna";
    strcat(text, " bezi lesom");
    ```
