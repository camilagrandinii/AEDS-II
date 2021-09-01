import java.util.*;
class pal {
    public static Scanner sc = new Scanner(System.in);
    public static boolean Fim(String s){return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');}
    public static boolean Condicao(String entrada){return Condicao(entrada,0);}
    private static boolean Condicao(String entrada, int invert){
    if(invert >= entrada.length()-1-invert)
    return true;
    return(entrada.charAt(invert) == entrada.charAt(entrada.length()-1-invert)) && Condicao(entrada,invert + 1);}    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String[] entrada = new String[1000];
        int aux=0;
        entrada[aux] = num.nextLine();
        do {
        for(int i = 0; i < aux; i++){
            if(Condicao(entrada[i]) == true){System.out.println("SIM");}
            else if ((Condicao(entrada[i]) == false)){System.out.println("NAO");}
        }
        entrada[aux] = num.nextLine();
        } while (Fim(entrada[aux]) == false);
        num.close();
    }
}
