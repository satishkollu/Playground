#include <iostream>
#include <cmath>
using namespace std;
int main ()
{
    int a, n, result;
	cout<<"Enter the value of a\n";
  	cin>>a;
    cout<<"Enter the value of n\n";
	cin>>n;
	result = pow(a, n);
	cout <<"The value of "<<a<<" power "<<n <<" is "<< result;
	return 0;
}