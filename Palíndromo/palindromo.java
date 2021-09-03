class palindromo{
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }
    public static void main(String[] args){
    String palavra="";
    int i=0, tam=0, diferentes=0;
    palavra = MyIO.readLine();
    do {
            tam = palavra.length();
            tam--;
            i = 0; diferentes=0; 

            while(tam >= i){
                if(palavra.charAt(i) != palavra.charAt(tam)) 
                    diferentes ++; // conta as letras diferentes
                i++;
                tam--;
            }
            if(diferentes == 0)
            System.out.println("SIM");
            else
            System.out.println("NAO");
            palavra = MyIO.readString();
        } while (isFim(palavra) == false);
    }
}