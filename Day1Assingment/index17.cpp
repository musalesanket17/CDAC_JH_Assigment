#include<iostream>
using namespace std;

int Sum(int);

int main(){
  

    int number;
    cout<<"Entre the number :"<<endl;
    cin>>number;
    int ans=Sum(number);
    cout<<"The Sum of All digit "<<number<< " is "<<ans<<endl;

 
    return 0;
}

int Sum(int n){

    int r,sum=0;

    while(n>0){

        r=n%10;
        n=n/10;
        sum+=r;

    }
    return sum;
}