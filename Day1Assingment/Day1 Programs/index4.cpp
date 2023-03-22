/*

 Qestion : Find Given NUmber is Even Or Odd

*/

#include<iostream>
using namespace std;

int main(){

    int Number;
 
    cout<<"Enter Number :- "<<endl;
    cin>>Number;

    if(Number % 2 ==0) cout<<"This Number is Even : "<<Number <<endl;
    else cout<<"This Number is Odd : "<<Number<<endl;

    return 0;

}

