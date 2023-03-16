/*
   Qestion : Add Two Number Without Using Arethmatic Oprators ?
*/

#include<iostream>
using namespace std;
int AddTwo(int ,int);

int main(){

   int num1,num2,Ans;
   cout<<"Enter Num1 : ";
   cin>>num1;
   cout<<"Enter Num2 : ";
   cin>>num2;

   Ans= AddTwo(num1,num2);
   cout<<"Addition of "<<num1<<" & "<<num2<<" Without using any Arethmatic Oprator is :  "<<Ans;
    
    
    return 0;

}


int AddTwo(int n1,int n2){

    for(int i=1; i<=n1 ;i++){
        n2++;
    }
    return n2;
}