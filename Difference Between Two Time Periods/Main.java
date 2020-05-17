#include<iostream>
using namespace std;
int main()
{
  int ah,am,as,bh,bm,bs,h,m,s;
  cin>>ah>>am>>as>>bh>>bm>>bs;
  h = ah - bh;
  if(bm>am)
  { m=bm-am;
    m=60-m;
  h--;}
  else
  m = am - bm;
  if(bs>as)
  {s=bs-as;
   s=60-s;
  m--;}
  else
  s = as - bs;
  cout<<h<<":"<<m<<":"<<s;
}