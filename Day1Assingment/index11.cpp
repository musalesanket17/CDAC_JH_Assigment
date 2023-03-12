
/*
Qestion : Print All The factors of Given Number?

*/

#include<iostream>
using namespace std;

int FindFactors(int);

int main(){

    int Number;
    cout<<"Enter Number : "<<endl;
    cin>>Number;
    FindFactors(Number);

 
    return 0;
}

int FindFactors(int n){
     int count=0;
   
    for(int i=1;i<=n;i++){
      
        
        if(n%i==0){
             count++;
            cout<< "This is "<<count<<" Factor of "<<n <<" Number is : "<< i <<endl ;
        }
    }
}