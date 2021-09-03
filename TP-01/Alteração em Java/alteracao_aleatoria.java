import java.util.*;
class alteracao_aleatoria {
    public static boolean isFim (String s){
        return (s.length()==3 && s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M');
    }   
    public static String alteracao (String s, Random gerador){ // troca as letras por outras
        String aux = "";
        char troca = ((char)('a'+(Math.abs(gerador.nextInt())%26)));
        char troca_2 = ((char)('a'+(Math.abs(gerador.nextInt())%26)));

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==troca)
            aux += troca_2;
            else 
            aux += s.charAt(i);
        }
        return aux;
    }
    
    public static void main (String[] args){
    Random gerador = new Random();
    gerador.setSeed(4);
    String str = MyIO.readLine();
        do{
        MyIO.print (alteracao(str, gerador)+"\n");
        str = MyIO.readLine();
        }while (isFim(str)==false);
    }
}
