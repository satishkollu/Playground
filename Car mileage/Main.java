#include<iostream>

using namespace std;

int main()

{

float m;

int p,d;

std::cin>>m>>p>>d;

int res=m*p;

if(res>=d)

{

std::cout<<"Can reach";

}

else

{

std::cout<<"Cannot reach";

}

return 0;

}
