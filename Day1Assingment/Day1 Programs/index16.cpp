/*
   Question :Q1> Print the Digit of Given number?
             Q2> Reverse given Number? --> We can reverse Without using "\n"
*/

#include<iostream>

using namespace std;
int Printdigit(int);
int main(){

    int number;
    cout<<"Enter the Number: "<<endl;
    cin>>number;
    Printdigit(number);

 
    return 0;
}

int Printdigit(int num){
    
    while(num>0){
       int r,n;
     
       r=num%10;
       num=num/10;
       cout<<r<<"\n";
        
    }
}