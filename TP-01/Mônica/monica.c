/* O que a função faz
 * Entrada e saída
 * */
#include <stdio.h>
int main(){
    int mais_novo=0, mais_novo_2=0, mae=0, outro_filho=0;
      
    scanf ("%i", &mae);
    while (mae!=0){
      scanf ("%i", &mais_novo);
      scanf ("%i", &mais_novo_2);
      outro_filho=mae-(mais_novo+mais_novo_2);

      if ((mais_novo>mais_novo_2) && (mais_novo>outro_filho))
      printf("%i",mais_novo);

      else if ((mais_novo_2>mais_novo) && (mais_novo_2>outro_filho))
      printf("%i",mais_novo_2);

      else 
      printf("%i",outro_filho);
      
      scanf ("%i", &mae);
    }
    return 0;
}