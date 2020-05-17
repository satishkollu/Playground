#include<iostream>
using namespace std;
int main()
{
int n,x=121,y,z=0;
  cin>>n;
  while(true)
  {
  cout<<x<<" ";
    z+=1;
    y = 11 + (4*z);
    x = y*y;
    if(z==n)
      break;
  
  }

return 0;
}