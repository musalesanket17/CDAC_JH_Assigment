/*

Qestion : Given Number is LeapYear OR Not? 

*/

#include<iostream>
using namespace std;

int CheckLeapYear(int);

int main(){

  
   int Number;
   cout<<" Enter Number : "<<endl;
   cin>>Number;
   int result=CheckLeapYear(Number);
   result?cout<<Number<<" This Year is LeapYear "<<endl :  cout<<Number<<" This Year is Not LeapYear ";

  
    return 0;
}

int CheckLeapYear(int n){

   if(n%4==0) return 1;
   else return 0;

}
