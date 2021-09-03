#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int TesteFim (char palavra[]);
int main(){

    char palavra[500];
    int i, tam, diferentes;

    scanf("%[^\n]", palavra);
    scanf("%*[^\n]"); scanf("%*c"); // limpa o buffer

    do{
    tam = strlen(palavra);
    tam--;
    i = 0, diferentes=0; 

    while(tam >= i){
        if(palavra[i] != palavra[tam]) 
            diferentes ++; // conta as letras diferentes
        i++;
        tam--;
    }
    if(diferentes == 0)
        printf ("%s\n", "SIM");
    else
        printf ("%s\n", "NAO");
    
    scanf("%[^\n]", palavra);
    scanf("%*[^\n]"); scanf("%*c"); // limpa o buffer e evita de ser digitado não após ler "FIM"
    
    }while (TesteFim(palavra)!=1);
    
    return 0;
}
int TesteFim (char palavra[]){ // testa se a próxima palavra é fim
    int result=0;
    if (strcmp(palavra, "FIM")==0)
    result=1;
    return result;
}