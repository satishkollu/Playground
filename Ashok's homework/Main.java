#include<iostream>
int main()
{
    // Type your code here
  int r,c;
 std::cin>>r>>c;
  int ar[r][c],br[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>ar[i][j];
        }
}
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>br[i][j];
        }
  }
    int cr[r][c];
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            //std::cout<<a[i][j]<<" ";
          cr[i][j]=ar[i][j]+br[i][j];
        }
    }
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cout<<cr[i][j]<<" ";
        }
        std::cout<<"\n";
      }
    }
  