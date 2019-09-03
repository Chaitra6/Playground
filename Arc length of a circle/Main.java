#include<stdio.h>

int main()
{
 float r,ang,al;
  scanf("%f %f",&r,&ang);
 al = 2*3.14*r*(ang/360);
  printf("%.2f",al);
}