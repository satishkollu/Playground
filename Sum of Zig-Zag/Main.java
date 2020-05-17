#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0,frsum=0,lrsum=0,dsum=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  	for(j=0;j<c;j++)
     cin>>a[i][j];
  
for(i=0;i<1;i++)
  	for(j=0;j<c;j++)
     frsum+=a[i][j];

 for(i=r-1;i<r;i++)
  	for(j=0;j<c;j++)
     lrsum+=a[i][j];  
  
  if(r==2)
    sum=frsum+lrsum;
  else
  {
  	for (i = 1; i < r-1; i++) 
  	{ 
        for ( j =1 ; j < c-1; j++) 
        { 
            if ((i + j) == (r - 1)) 
                dsum += a[i][j]; 
        } 
    } 
  sum = frsum+lrsum+dsum;
  }
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}