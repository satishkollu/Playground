/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
//#include<process.h>
//#include <conio.h>
using namespace std;
int main()
{char name[100],designation[100];
int age=0,ID=0;
int salary;
//clrscr();
A:cout<<"Enter name:"<<endl; 
cin>>name; 
cout<<"Enter ID:"<<endl; 
cin>>ID;

//cout<<"Enter Salary:"<<endl; 
//cin>>salary;
cout<<"Enter age:"<<endl; 
cin>>age;
cout<<"Enter designation:"<<endl; 
cin>>designation;
cout<<"Enter Salary:"<<endl; 
cin>>salary;
cout<<"Employee Details"<<endl; 
cout<<"Name of the Employee : "<<name<<endl; 
cout<<"ID of the Employee : "<<ID<<endl; 
cout<<"Age of the Employee : "<<age<<endl; 
cout<<"Designation of the Employee : "<<designation<<endl; 
cout<<"Salary of the Employee : "<<salary<<endl;
return 0;
    
}
