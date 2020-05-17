#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int d;
  double t;
  std::cin>>d;
  double sum=d;
  t=d;
  do{
  float a=sqrt(d);
  float b=1/a;
  t=t*b;
  sum+=t;
  }while(t>1);
  int tot=int(sum);
  std::cout<<tot;
}