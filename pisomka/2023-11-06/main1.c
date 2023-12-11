#include <stdio.h>
#include <stdlib.h>

void dukatyVeta(int dukaty) {
	if(dukaty == 1) {
		printf("dukat\n");
	} else if(dukaty > 1 && dukaty < 5) {
		printf("dukaty\n");
	} else {
		printf("dukatov\n");
	}
}

void veta1(int cleny, int dukaty) {
	printf("%d clenov druziny po %d ", cleny, dukaty / (cleny + 1));
	dukatyVeta(dukaty);
}

void anicka(int zvysok) {
	printf("Pre Anicku %d dukatov\n", zvysok);
}

int ninjaCelkovo(int ninja, int den) {
	int ninjaCelkovo;
	
	for(int i = 0; i < den; i++) {
		ninjaCelkovo += i + ninja;
	}
	
	return ninjaCelkovo;
}

int main() {
	int dukaty;
	int cleny;
	int ninja;
	int den;
	
	FILE *f;
	
	if((f = fopen("vstup.txt", "r")) == NULL) {
		printf("nevies programovat (zle otvoreny subor)\n");
		return 1;
	}
	
	fscanf(f, "%d", &dukaty);
	fscanf(f, "%d", &cleny);
	fscanf(f, "%d", &ninja);
	fscanf(f, "%d", &den);
	
	veta1(cleny, dukaty);
	anicka(dukaty % (cleny + 1));
	
	printf("prvy den bolo %d ninjov\n", ninja);
	
	printf("celkovy pocet ninjov bolo %d", ninjaCelkovo(ninja, den));
	
	fclose(f);
	
	return 0;
}