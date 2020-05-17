/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()

{

char str[100];

int i=0; int l=0;


cin>>str;

while(str[i]!='\0')

{

l++;

i++;

}

cout<<"The number of letters in the name is "<<l;

return 0;

}
