#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/* Napiste program, ktory vygeneruje cele cisla z intervalu <0; 100> a zapise ich pod seba do suboru 'nahodne.txt'.
 Zapisovanie ukonci, ked sa vygenerovane cislo bude rovnat 100. Do dalsieho suboru 'vysledky.txt' zapiste pocet
 vygenerovanych cisel, sucet cisel, pocet cisel vacsich ako priemerna hodnota a pocet cisel mensich ako priemerna
 hodnota cisel. 
 */

void uloha1() {
	int nahodne;
	int pocet = 0;
	int velke = 0;
	int male = 0;
	int sucet = 0;
	
	FILE *f1 = fopen("nahodne.txt", "w");
	FILE *f2 = fopen("vysledky.txt", "w");
	
	srand(time(0));
	 
	while((nahodne = rand()%101) != 100) {
		fprintf(f1, "%d\n", nahodne);
		pocet++;
		sucet += nahodne;
	}
	
	if (fclose(f1) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
	
	f1 = fopen("nahodne.txt", "r");
	
	float priemer = 0.0 + sucet / pocet;
	
	for(int i = 0; i < pocet; i++) {
		fscanf(f1, "%d\n", &nahodne);
		
		if(nahodne > priemer) {
			velke++;
		} else {
			male++;
		}
	}
	
	fprintf(f2, "pocet vygenerovanych cisel: %d\n", pocet);
	fprintf(f2, "sucet vygenerovanych cisel: %d\n", sucet);
	fprintf(f2, "pocet cisel vacsich ako priemer: %d\n", velke);
	fprintf(f2, "pocet cisel mensich ako priemer: %d\n", male);
	
  	if (fclose(f1) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
  	if (fclose(f2) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
}

int main() {
	uloha1();
	
	return 0;
}