#include <iostream>
using namespace std;
int fact(int n) { 
   if ((n==0)||(n==1))
      return 1;
   else
      return n*fact(n-1);
}
int main() {
   int n;
  scanf("%d",&n);
   cout<<"The factorial of "<<n<<" is "<<fact(n);
   return 0;
}