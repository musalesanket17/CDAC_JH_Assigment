/*
 
  Qestion : Swap Two variable Wthout USing Third Variable ?

*/

#include<iostream>
using namespace std;

int Swap(int,int);

int main(){


    int Num1,Num2;
    cout << "Enter TWO Number which you want to swap , Num1 & Num2 : "<<endl;
    cin>>Num1;
    cin>>Num2;
    cout<<"Before Swap Num1 & Num2 :"<<Num1<<"  "<<Num2<<endl;
    Swap(Num1,Num2);
    return 0;
}

int Swap(int n1,int n2){

    n1 =n1+n2;
    n2 =n1-n2;
    n1 =n1-n2;

      cout<<"After Swap Num1 & Num2  :"<<n1<<"  "<<n2<<endl;


}

