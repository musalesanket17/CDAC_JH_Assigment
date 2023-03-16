/*

Qestion : Find the HCF/GCD of two numbers?
*/

#include<iostream>
using namespace std;
int FindHCF(int ,int);

int main(){
 
    int num1,num2;
    cout<<"Enter Two Numbers Num1  &  Num2 : ";
    cin>>num1;
    cin>>num2;
    int Ans = FindHCF(num1,num2);

    cout<<"The HCF of "<<num1<<" & "<<num2<<" is "<<Ans<<endl;

 
    return 0;
}

int FindHCF(int n1,int n2){
    int Ans=0;
   for(int i= 2; i<=n1 && i<=n2 ;i++){
      
       if(n1%i==0 && n2%i==0){
         
           Ans = i; 
           
       }
   }
   return Ans;
}







