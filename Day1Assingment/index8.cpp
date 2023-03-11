/*

Qestion : Check Given Number is Positive Or Negative ?

*/

#include<iostream>
using namespace std;

int PositiveOrNegative(int);

int main(){

   int Number;

   cout<<"Enter Number Which you want to check is Positive Or Negative :"<<endl;
   cin>>Number;
   int result = PositiveOrNegative(Number);

   result ? cout<<Number<<" This Given Number is +Positive" : cout<<Number<<" This Given Number is -Negative";
 
    return 0;
}

int PositiveOrNegative(int n){
 
   if(n >=0 ) return 1;
   else return 0;

}