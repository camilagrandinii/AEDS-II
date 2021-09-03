class ciframento_cesar {
    public static boolean isFim (String s){
        return (s.length()==3 && s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M');
    }
    public static void main (String[] args){
    String str = MyIO.readLine();
    do{
    MyIO.print (criptografia(str)+"\n");
    str = MyIO.readLine();
    }while (isFim(str)==false);
    }
    public static String criptografia (String s){
        String aux = "";

        for ( int i = 0; i < s.length(); i++){
            aux = aux+ (char)(s.charAt(i) + 3);
        }
        return aux;
    }
}