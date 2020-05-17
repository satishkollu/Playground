#include<iostream>
using namespace std;
int main()
{
   struct college 
   { 
     char name[100]; 
     char city[100]; 
     int year; 
     float pass; 
   };
  int n,i;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  struct college s[n];
  for(i=0;i<n;i++)
  {
  cout<<"Enter the details of college "<<i+1<<"\n";
cout<<"Enter name\n";
cout<<"Enter city\n";
cout<<"Enter year of establishment\n";
cout<<"Enter pass percentage\n";
    cin>>s[i].name>>s[i].city>>s[i].year>>s[i].pass;  
  }
 cout<<"Details of colleges\n";
  for(i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<endl;
  cout<<"Name:"<<s[i].name<<endl;
    cout<<"City:"<<s[i].city<<endl;
    cout<<"Year of establishment:"<<s[i].year<<endl;
    cout<<"Pass percentage:"<<s[i].pass<<endl;
  }
  
}