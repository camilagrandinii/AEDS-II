int main(int argc, char *argv[]) {
	int ano, vezes;
    scanf("%d", &ano);
	while (ano!=0){
	vezes = (int) (ano - 10) / 76;
	vezes++;
	printf("%d\n", vezes * 76 + 10);
    scanf("%d", &ano);
    }
	return 0;
}