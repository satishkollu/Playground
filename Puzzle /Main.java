#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int a[r][c], b[c][r],br[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++)
            std::cin>>a[i][j];
        }
  if(r==c)
  {
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
          br[i][j]=a[j][i];
        }
}
     for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++)
            std::cout<<br[i][j]<<" ";
    std::cout<<"\n";
  }
  }
  else
  {
    for(int i=0;i<c;i++)
      {
        for(int j=0;j<r;j++)
          b[i][j]=a[j][i];
      }
    for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++)
            std::cout<<b[i][j]<<" ";
    std::cout<<"\n";
  }
}
  }
