 #include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  std::cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
       std::cin>>mat[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    int max=0;
    for(int j=0;j<n;j++)
    {
       if(max<mat[i][j])
         max=mat[i][j];
    }
    std::cout<<max<<"\n";
  }
  
}