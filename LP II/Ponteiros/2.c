int main()
{
	float a, b, c;
	float *aPtr, *bPtr, *cPtr;

	printf("Entre com um valor:\n");
	scanf("%f", &a);

	printf("Entre com um valor:\n");
	scanf("%f", &b);

	printf("Entre com um valor:\n");
	scanf("%f", &c);
	aPtr = &a;
	bPtr = &b;
	cPtr = &c;

	printf("O valor 1 eh: %.2f\n", *aPtr);
	printf("O valor 2 eh: %.2f\n", *bPtr);
	printf("O valor 3 eh: %.2f\n", *cPtr);
	return 0;
}