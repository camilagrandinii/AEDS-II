class cometa{
    public static void main(String[] args) {
        int ano, vezes;
        ano = MyIO.readInt();
        while (ano!=0){
        vezes = (int) (ano - 10) / 76;
        vezes++;
        System.out.println(vezes * 76 + 10);
        ano = MyIO.readInt();
        }
    }
}