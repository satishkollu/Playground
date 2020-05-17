#include<iostream>
using namespace std;
int main()
{
  char str[200],c;
  cin.getline(str,200);
  int i,v=0,co=0,w=0,d=0,s=0;
  for(i=0;str[i]!='\0';i++)
  {
    c=str[i];
  	if(c==32)
      w++;
    else if(c>=48 && c<=57)
      d++;
    else if(c == 'a' || c == 'e' || c == 'i' || 
   c == 'o' || c == 'u' || c == 'A' || 
   c == 'E' || c == 'I' || c == 'O' || c == 'U')
      v++;
    else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            co++;
     else
            s++;
  }
            cout<<"Vowels:"<<v<<"\nConsonants:"<<co<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<s;
}