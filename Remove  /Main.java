#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
string removeWord(string str, string word)  
{ 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1;
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
    return str; 
} 
  
using namespace std;
int main()
{
  //Type your code here.
  std::string s,r,s1;
  std::getline(cin,s);
  s1="the";
  r=removeWord(s,s1);
  std::cout<<r;
  
}