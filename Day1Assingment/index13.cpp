/*

Qestion : Print The Even Series Till Given Number ?

*/

#include<iostream>
using namespace std;
int EvenSeries(int);
int main(){
 
    int number;
    cout <<"Enter The Number : ";
    cin>>number;
    EvenSeries(number);

    return 0;
}

int EvenSeries(int n){
    int count=0;
    for(int i=2;i<=n;i++){
        if(i%2 == 0){
           count++;
           cout<<"The "<<count<<" Number of Even Series of "<<n<<" is "<< i <<endl;
        }
        
    }
}