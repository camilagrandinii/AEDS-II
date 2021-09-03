import java.util.Scanner;
class ciframento{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String CP="";
        int chave=3, i = 1;
        String texto = entrada.nextLine();
        do{
            if (i == 1) {
                CP = criptografa (texto, chave);
                System.out.printf("%s\n", CP);
            }
        texto = entrada.nextLine();
        }while (testeFim(texto)!=true);
        entrada.close();   
    }
    public static boolean testeFim(String str){ return (str.length()==3 && str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='M');}
    public static String criptografa (String texto, int chave){
        chave = 3;
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();
        for(int c=0; c < tamanhoTexto; c++){
            int letraCifradaASCII = ((int) texto.charAt(c) + chave);
            if (texto.charAt(c) > 97 && texto.charAt(c) <  122 ) {
                while (letraCifradaASCII > 122) {
                    letraCifradaASCII = 97; }
            }
            if (texto.charAt(c) > 65 && texto.charAt(c) <  60 ) {
                while (letraCifradaASCII > 90) {
                letraCifradaASCII = 65;
                }
            }
        textoCifrado.append( (char)letraCifradaASCII );
        }
        return textoCifrado.toString();
    } 
}