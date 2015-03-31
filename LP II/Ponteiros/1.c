int main()
{
	float a;
	float *aPtr;

	printf("Entre com um valor:\n");
	scanf("%f", &a);

	aPtr = &a;

	printf("O valor referenciado direto eh: %.2f\n", a);
	printf("O valor referenciado indireto eh: %.2f\n", *aPtr);
	printf("O endereço da variavel eh: %d\n", &a);
	return 0;
}