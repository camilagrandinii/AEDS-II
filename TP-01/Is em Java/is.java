class is{
    public static void main (String[] args){
        String frase;
        frase = MyIO.readLine();
        do{
            if (testeVogal(frase)==true){System.out.print("SIM ");}
            else{System.out.print("NAO ");}
            if (testeConsoante(frase)==true){System.out.print("SIM ");}
            else{System.out.print("NAO ");}
            if (testeInt(frase, 10)==true){System.out.print("SIM ");}
            else{System.out.print("NAO ");}
            if (testeFloat(frase)==true){System.out.print("SIM ");}
            else{System.out.print("NAO ");}
            System.out.println("");
            frase = MyIO.readLine();
        }while(testeFim(frase)!=true);
    }
    public static boolean testeVogal (String str){
        int teste=1;
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            teste++;
        }
        if (teste==str.length()){return true;}
        else {return false;}
    }
    public static boolean testeConsoante (String str){
        int teste=0;
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            teste++;
        }
        if (teste==0 && testeFloat(str)==false){return true;}
        else {return false;}
    }
    public static boolean testeInt (String str, int radix){ 
            for(int i = 0; i < str.length(); i++) {
                if(i == 0 && str.charAt(i) == '-') { //Checa inteiros negativos
                    if(str.length() == 1) return false;
                    else continue;
                }
                if(Character.digit(str.charAt(i),radix) < 0) return false; // checa se e um inteiro
            }
            return true;
    }
    public static boolean testeFloat (String str){
        try { // converte string em double e lanca excessao se n puder ser analisado
            Double.parseDouble(str); 
            return true;
            }catch(NumberFormatException e) { 
            return false;
            }
    }
    public static boolean testeFim (String str){ return (str.length()==3 && str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='M');}
}