#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  std::string str;
  std::getline(cin,str);
  char ch=str.back();
  std::cout<<str<<"\n";
  while(str!="####")
  { 
    std::cin>>str;
    if(str.at(0)==ch)
    {
    ch=str.back();
    std::cout<<str<<"\n";
    }
    else 
      break;
    
  }
  
}