/*
 * 2.c
 * 
 * Copyright 2014 Alexandre Pedrecal <pedrecal@Pedrecal>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

#include <stdlib.h>
#include <stdio.h>
#define N 10
int main()
{
	int n [N], i, j, num, flag = 0;
	
	for(i = 0; i < N; i++)
	{
		printf("Entre com os vetores: ");
		scanf("%d", &n [i]);
	}
	
	printf("\nEntre com um numero: ");
	scanf("%d", &num);
	
	for(j = 0; j < N; j++)
	{
		if(n[j] == num)
		flag++;
	}
			
	if(flag)
	printf("%d faz parte do vetor", num);
	else
	printf("%d nao faz parte do vetor", num);
		

	
	
	return 0;
}

