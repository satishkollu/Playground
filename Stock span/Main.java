#include<iostream>
using namespace std;
int main()
{
 int n,i,j;
  cin>>n;
  int a[n],b[n];
  a[n]={0};
  b[n]={0};
  int c=0;
  int k=1;
  for(i=0;i<n;i++)
    cin>>a[i];
 for(i=0;i<n;i++)
    b[i]=a[i];
  cout<<k<<"\n";
  for(i=0;i<n-1;i++)
  {
      if(a[i]>a[i+1])
      cout<<k<<"\n";
      else{
      c=c+2;
      cout<<c<<"\n";
      }
    }
}