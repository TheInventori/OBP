#include <stdio.h>
#include <stdlib.h>

/* kalkulacka */

void uvod();
float scitanie(float a, float b);
float odcitanie(float a, float b);
float nasobenie(float a, float b);
float delenie(float a, float b);

int main(int argc, char *argv[]) {
	float a;
	float b;
	char operacia;
	
	uvod();
	
	scanf("%f %c %f",&a,&operacia,&b);
	
	switch(operacia) {
		case '+':
			printf("%.2f + %.2f = %.2f",a,b,scitanie(a,b));
			break;
		case '-':
			printf("%.2f - %.2f = %.2f",a,b,odcitanie(a,b));
			break;
		case '*':
			printf("%.2f * %.2f = %.2f",a,b,nasobenie(a,b));
			break;
		case '/':
			printf("%.2f / %.2f = %.2f",a,b,delenie(a,b));
			break;
	}
	
	return 0;
}

void uvod() {
	printf("\t\tKALKULACKA\n\n");
	printf("Zadaj [cislo 1] [operacia (+, -, *, /)] [cislo 2]\n");
}

float scitanie(float a, float b) {
	return a + b;
}

float odcitanie(float a, float b) {
	return a - b;
}

float nasobenie(float a, float b) {
	return a * b;
}

float delenie(float a, float b) {
	return a / b;
}