#include <stdio.h>
#include <stdlib.h>

void uloha1() {
	int c;
	
	FILE *fr1;
	FILE *fr2;
	FILE *fw = fopen("spojenie.txt", "w");
	
  	if ((fr1 = fopen("subor1.txt", "r")) == NULL) {
    	printf("nevies programovat\n");
    	return;
  	}
  	
  	if ((fr2 = fopen("subor2.txt", "r")) == NULL) {
    	printf("nevies programovat\n");
    	return;
  	}
  	
  	while((c = getc(fr1)) != EOF) {
  		putc(c, fw);
	}
	
	putc('\n', fw);
	putc('\n', fw);
	
  	while((c = getc(fr2)) != EOF) {
  		putc(c, fw);
	}
	
  	if (fclose(fr1) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
  	
  	if (fclose(fr2) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
  	
  	if (fclose(fw) == EOF) {
    	printf("nevies zatvarat subor\n");
  	}
}

int main() {
	uloha1();
	
	return 0;
}