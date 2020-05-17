#include<iostream>
#include<array>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0,o=0,e=0;
  int a[100];
  std::cin>>n;
  while(n!=0)
  {
    a[i]=n%10;
    n=n/10;
    i++;
  }
  //int b=sizeof(a)/sizeof(a[0]);
  int count=0;i=0;
  while(a[i]!='\0'){
    count++;
    i++;
  }
  for(int i=1;i<=count;i=i+2)
    o=o+a[i];
  for(int i=0;i<=count;i=i+2)
    e=e+a[i];
  if(o==e)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}