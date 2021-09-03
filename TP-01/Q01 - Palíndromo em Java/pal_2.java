public class pal_2 {
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); //testa se chegou a condicao de para
        }
    public static boolean testePalindromo(String s){ 
    int i=0, tam=0, diferentes=0;
        tam = s.length();
        tam--;
        i = 0; diferentes=0; 

        while(tam >= i){
            if(s.charAt(i) != s.charAt(tam)) 
                diferentes ++; // conta as letras diferentes
            i++;
            tam--;
        }
        if(diferentes == 0)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        String palavra="";
        palavra = MyIO.readLine();
        do {
        if (testePalindromo(palavra)==true)
        System.out.println("SIM");
        else if(testePalindromo(palavra)==false)
        System.out.println("NAO");
        palavra = MyIO.readLine();
        } while (isFim(palavra) == false);
    }
}
