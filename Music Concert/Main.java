#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,m=0,f=0;
  std::cin>>n;
  int* a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  for(int i=0;i<n;++i)
  {
    if(a[i]%2==0)
      f++;
    else
      m++;
}
  std::cout<<m<<"\n"<<f;
  return 0;
}
  