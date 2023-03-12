/*

Qestion : Find the smallest of between 3 Numbers? 

*/


#include<iostream>
using namespace std;
int FindSmallest(int,int,int);
int main(){

  int n1,n2,n3;
  cout <<"Enter Three Numbers n1 & n2 & n3 : ";
  cin>>n1;
  cin>>n2;
  cin>>n3;
  FindSmallest( n1, n2, n3);



  return 0;
}

int FindSmallest(int n1,int n2,int n3){

   if(n1<n2 && n1<n3 ){
         cout<<"Tne Smallest Number Betweeb Them is :"<<n1<<endl;
   }
   else if(n2 < n3){
        cout<<"Tne Smallest Number Betweeb Them is :"<<n2<<endl;
   }
   else{
         cout<<"Tne Smallest Number Betweeb Them is :"<<n3<<endl;
   }

}
