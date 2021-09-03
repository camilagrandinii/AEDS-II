class algebra_booleana {
    public static void main (String[] args){
        String palavra="";
        palavra = MyIO.readLine();
        do {
        palavra.replace(" ","");
        System.out.println(palavra);
        palavra = MyIO.readLine();
        }while (palavra.charAt(0)!='0');
    }
}