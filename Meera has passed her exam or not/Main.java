#include<iostream>

int main()

{

int n,a[20],b,flag=0;

std::cin>>n;

for(int i=0;i<n;i++)

{ std::cin>>a[i]; }

std::cin>>b;

for(int i=0;i<n;i++)

{ if(a[i]==b)

{ flag=1;

 break;

}

}

if(flag==1)

{std::cout<<"She passed her exam";}

 else

 {std::cout<<"She failed";}

return 0;

}
