#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
#include<stdbool.h>
bool testeInt (char str[]);
bool testeNumero(char c) {
    if((c >= '0' && c <= '9') || (c == '.' || c == ',')) { //testa se a string é um número
        return true;
    }
    return false;
}
bool testeVogal (char str[]){
        int teste=1, tam=strlen(str);
        for (int i=0; i<tam-1; i++){
            if (str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
            teste++;
            else{return 0;}
        }
        if (teste==tam && testeInt(str)==false){return 1;}
        else {return 0;}
    }
bool testeInt (char str[]){ //testa se e um inteiro
char teste = ' ';
int tam=strlen(str);
for(int i = 0; i < tam; i++) {
        teste = str[i];
        if(testeNumero(teste)) {
            if (teste == '.' || teste == ',') {
                return false; // se for float retorna falso, pois tem . ou ,
            }
        } else {
            return false;
        }
    }
    return true;
}
bool testeFloat(char palavra[]) {
    char teste = '-';
    int cont = 0;
    int tam = strlen(palavra);

    for(int i = 0; i < tam; i++) {
        teste = palavra[i];
        if(testeNumero(teste)) {
            if (teste == '.' || teste == ',') {
                cont++;
            }
        } else {
            return false;
        }
    }
    if(cont == 1 || cont == 0) return true; // se tiver 1 . ou , retorna true
    else return false;
}
    int testeConsoante (char str[]){
      int result_teste;
        int teste=0, tam=strlen(str);
        for (int i=0; i<tam-1; i++){
            if (str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
            teste++;
        }
        if (teste==0 && testeFloat(str)==0){return 1;} // se n tiver nenhuma vogal e nao for numero retorna true
        else {return 0;}
    }
bool testeFim (char palavra[]){ 
  int result=0;
  if (strcmp(palavra, "FIM")==0)
  result=1;
  return result;
}
int main(){
    char frase[500];
    scanf("%[^\n]", frase);
    scanf("%*[^\n]"); scanf("%*c"); // limpa o buffer
        do{
            if (testeVogal(frase)==true){printf("SIM ");}
            else{printf("NAO ");}
            if (testeConsoante(frase)==true){printf("SIM ");}
            else{printf("NAO ");}
            if (testeInt(frase)==true){printf("SIM ");}
            else{printf("NAO ");}
            if (testeFloat(frase)==true){printf("SIM ");}
            else{printf("NAO ");}
            printf("\n");
            scanf("%[^\n]", frase);
            scanf("%*[^\n]"); scanf("%*c");
        }while(testeFim(frase)!=true);
}