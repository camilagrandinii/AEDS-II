#include<stdio.h>
#include<string.h>
#include <stdbool.h>

int isFim (char palavra[]){
    int resultado=0;
    // se der fim = 1, para o processo
   switch (strcmp(palavra, "FIM"))
   {
    case 0:
    resultado=1;
    break;
        palavra --;
    }
        return resultado;
}
int inverte (char *palavra, int y, int cont) {
    if (y <= cont) return 1;
    else {
        // inverte as palavras
        if (palavra[y - 1] != palavra[cont]) return 0;
        return inverte(palavra, y-1, cont+1);

    }
}

int palindromo (char *palavra) {
    int auxiliar, x = 0;
    auxiliar = inverte(palavra, strlen(palavra), x);
    // pra responnder sim ou nao nno final
      if (auxiliar == 1) {return 1;}
      else{ return 0;}
}

int main() {
    char palavra[50];
    int resultado;
    int i = 0, aux1;
    do{
        i++;
        scanf("%[^\n]", palavra);
        scanf("%*[^\n]"); scanf("%*c"); 

        resultado = palindromo(palavra);
        if(isFim(palavra)!=1){
            if(resultado == 1){
                printf("SIM\n");}

            else if(resultado == 0)
            printf("NAO\n");
        }
    }while (isFim(palavra)!=1);
return 0;
}
