
/*

Qestion : Find prime factor of Given Number?

*/

#include<iostream>
using namespace std;
int FindFactors(int );
int FindPrime(int);
int number;
int main(){

   
   cout<<"Enter the Number : "<<endl;
   cin>>number;
   FindFactors(number);


    return 0;
}

int FindFactors(int n){

    for(int i=2 ;i<=n;i++){

        if(n%i==0){
           FindPrime(i);
        }
    }
}

int FindPrime(int n){

    int count=0;
    // cout<<n;
    for(int i=2;i<=n;i++){
        if(n%i == 0){
            count++;
        }

         
    }
//    cout<<count<<"\n";
    count==1 ? cout<<"The "<< n <<" is Prime Factor of "<<number<<endl :cout<<"The "<< n <<" is Factor of "<<number<<" But Not a Prime Factor " <<endl;  
           
    
}
