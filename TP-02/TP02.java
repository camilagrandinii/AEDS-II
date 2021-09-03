class Serie{
    private String nome;
    Serie(){
        nome="";
    }
    public void setNome(String nome){
        this.nome = nome ;
    }
    public String getNome(){
        return this.nome;
    }
    public void Imprimir (){
        System.out.println(""+nome);
    }
}
// protected só acessa quem herda
// ele cria 1 . class para cada classe
class TP02{
    public static void main (String[] args){
        Serie tmp = new Serie();
        tmp.setNome("Friends");
        tmp.Imprimir();
    }
}