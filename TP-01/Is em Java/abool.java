import java.util.Scanner;
class abool{
    static private boolean getExpressao(String exp, String valor1, String valor2, String resultado) {
        boolean r = false;
        if (exp.contains("+")) {
            if (valor1.equals(valor2) && valor1.equals("0")) {
                r = (resultado.equals("0") ? true : false);
            } else if (valor1.equals(valor2) && valor1.equals("1")) {
                r = (resultado.equals("1") ? true : false);
            } else {
                r = (resultado.equals("1") ? true : false);
            }
        } else if (exp.contains(".")) {
            if (valor1.equals(valor2) && valor1.equals("0")) {
                r = (resultado.equals("0") ? true : false);
            } else if (valor1.equals(valor2) && valor1.equals("1")) {
                r = (resultado.equals("1") ? true : false);
            } else {
                r = (resultado.equals("0") ? true : false);
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        while (Integer.parseInt(exp)!=0) {     /// Testa se a palavra digitada foi "0", para assim parar a repetição
            String valor1 = in.nextLine();
            String valor2 = in.nextLine();
            String resultado = in.nextLine();
            if (getExpressao(exp, valor1, valor2, resultado)) {
                MyIO.println("1");
            } else {
                MyIO.println("0");
            }
            in.close();
            exp = in.nextLine();
        }
    }
}
