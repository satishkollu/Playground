
#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
struct Student { 
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
};
int main()
{
  int n;
  cout<<"Enter the number of students"<<"\n";
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++)
  {
    cin>>s[i].name;
    cin>>s[i].department;
    cin>>s[i].yearOfStudy;
    cin>>s[i].cgpa;
  }
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name"<<"\n";
    cout<<"Enter department"<<"\n";
 	cout<<"Enter year of study"<<"\n";
  	cout<<"Enter cgpa"<<"\n";
  }
 string a[n];
  for(int i=0;i<n;i++)
    a[i]=s[i].name;
  sort(a,a+n);
  cout<<"Details of students"<<"\n";
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
     if(a[i]==s[j].name)
     {
    	std::cout<<"Student "<<i+1<<"\n";
    	std::cout<<"Name:"<<s[j].name<<"\n";
    	std::cout<<"Department:"<<s[j].department<<"\n";
    	std::cout<<"Year of study:"<<s[j].yearOfStudy<<"\n";
    	std::cout<<"CGPA:"<<s[j].cgpa<<"\n";
       break;
  }
   }
  }
}