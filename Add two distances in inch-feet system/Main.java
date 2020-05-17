#include<iostream>
using namespace std;
int main()
{
  float ai,af,bi,bf,f,i;
  cin>>af>>ai>>bf>>bi;
  char x='"';
  f = af+bf;
  i = ai+bi;
  if(i>12)
  {
    f++;
   i-=12;
  }
  else ;
    cout<<f<<"'-"<<i<<x;
}