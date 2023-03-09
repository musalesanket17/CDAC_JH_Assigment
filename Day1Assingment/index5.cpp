/*

Qestion : Wright the Programt to find the factorial of Given Number ?

*/

#include<iostream>
using namespace std;


int Factorial(int);

int main(){
 
    int Number;
    cout<<"Enter Number Which you Want to find Factorial"<<endl;
    cin>>Number;

    int Result = Factorial(Number);
    cout<<Result;
    return 0;
}

int Factorial(int n){
    int factor=1;
    for(int i=1;i<=n;i++){
         factor *=i;
    }
    return factor;
}