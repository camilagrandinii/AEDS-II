
public class palindromo_2 {
  public static void main(String[] args) {
    String palavra = "";
    String invertida = "";
    while (palavra.charAt(0) != 'F' && palavra.charAt(1) != 'I' && palavra.charAt(2) != 'M') { //testa se a palavra digitada foi "FIM", para assim parar a repetição
      palavra = MyIO.readLine();

      for (int i = (palavra.length() - 1); i >= 0; i--) {//Encontra o comprimento da String depois a inverte
        invertida += palavra.charAt(i);
      }
      if (invertida.equals(palavra)) { //testa se a String contida na variavel nova é igual a da antiga
        MyIO.println("SIM");
      } else {
        MyIO.println("NÃO");
      }
    }
  }
}