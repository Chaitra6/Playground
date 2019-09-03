// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,h;
  scanf("%d \n %d",&n1,&n2);
  h=(n1>n2)?n2:n1;
  while(1)
  {
    if(n1%h==0 && n2%h==0)
    {
      printf("%d",h);
      break;
    }
    --h;
    
  }
   return 0;
}