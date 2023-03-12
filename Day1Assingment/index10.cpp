
/*

Qestion : Print 1 To 10 Withot Using Loop ?

*/

#include<iostream>
using namespace std;

int withoutLoop(int);

int main(){

    int Number,Res;
    cout<<"Enter Number Till You Want to print Number From 1 :"<<endl;
    cin>>Number;
    if(Number == 0 ) cout<<"Enter Valid Number" ;
    else  withoutLoop(Number);

    


    return 0;
}
int i =1;
int withoutLoop(int n){

   if(i <= n ) {
     
      
      withoutLoop(n-1);
      cout<<n<<endl;
      
      

   }
     

}