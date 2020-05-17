#include<iostream>
int main()
{
  int n,count=0;
  std::cin>>n;
  for(int i=1;i<=n/2;i++)
  {
    if(n%i==0)
    {
      count++;
    }
  }
  //std::cout<<count;
  if(count==1)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}