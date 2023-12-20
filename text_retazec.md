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
- `strcpy();`
  - naklonuje textovy retazec do inej premennej
  - ```C
    char text[5];
    strcpy(text, "duha");
    ```
- `strchr();`
  - vyhlada v texte nejaky znak
  - odcita: adresa znaku - adresa zaciatku retazca --> pozicia hladaneho znaku v poli
- `strstr();`
  - vyhlada v texte retazec
- `strcmp();`
  - porovnava 2 retazce
  - vrati:
    - zaporne cislo, ak je prvy pred druhym
    - 0, ak su zhodne
    - kladne cislo, ak je prvy za druhym
- `strrchr();`
  - take iste ako `strchr()` ale prehladava odzadu
- `strncat();`
  - take iste ako `strncat();` ale **n** udava limit znakov, ktore sa spracovavaju
  - neobsahuje \0
  - po presiahnuti limitu, retazec usekne
- `gets();`
  - nacita do retazca cely riadok az po znak ukoncenia riadku `\n`
  - pokal bol riadok prazdny, vrat NULL a do retazca na prvu poziciu vrati `\0`
  - zaroven vracia pointer na retazec
- `puts();`
  - riadkovo orientovanie tlacenie na obrazovku
  - vypise string na obrazovku a doplni ho znakom `\n`
  - vracia nezaporne cislo
