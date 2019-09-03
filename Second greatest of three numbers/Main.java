#include<stdio.h>


int main()
{ 
   int a,b,c,res;
  scanf("%d\n %d\n %d",&a,&b,&c);
  if( (a>b && a<c)|| (a>c && a<b))
  {
    printf("%d",a);
  }
  else if( (b>a && b<c)|| (b>c && b<a))
  {
    printf("%d",b);
  }
  
  else
  {
    printf("%d",c);
  }
  

}