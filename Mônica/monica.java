
class monica{
    public static void main (String[] args){
      int mais_novo=0, mais_novo_2=0, mae=0, outro_filho=0;
      
      mae = MyIO.readInt();
      while (mae!=0){
      mais_novo = MyIO.readInt();
      mais_novo_2 = MyIO.readInt();
      outro_filho=mae-(mais_novo+mais_novo_2);

      if ((mais_novo>mais_novo_2) && (mais_novo>outro_filho))
      MyIO.println(mais_novo);

      else if ((mais_novo_2>mais_novo) && (mais_novo_2>outro_filho))
      MyIO.println(mais_novo_2);

      else 
      MyIO.println(outro_filho);
      
      mae=MyIO.readInt();
      }
  }
}