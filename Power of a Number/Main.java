#include <stdio.h>
int main()
{
  
  int p,n;
  long long result=1;
  scanf("%d %d",&n,&p);
  if(p<0)
  {
    printf("Wrong input");
  }
  
  else{
      while(p!=0)
      {
        result *= n;
        --p;
      }
    
    printf("%lld",result);
    
  }
  
    return 0;
}