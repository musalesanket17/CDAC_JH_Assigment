/*
Qestion : Controlling Systeam for Shopping ; 


*/

#include<iostream>

using namespace std;


int MonthExpenses();
int TotalPurchse;

int main(){

    int CardLimit ;
    
    cout << "Set Credit Card Limit : "<<endl;
    cin >> CardLimit ;

     while(TotalPurchse<=CardLimit) MonthExpenses(); 

     cout << "Your Total Purchse Amount Will Be :" << TotalPurchse << endl;

     TotalPurchse<=CardLimit ? cout<< "You Can Purchse New Item :)"<<endl : cout<<"Your Card Limit is Exceeded :("<<endl;



    return 0;
}

int MonthExpenses(){
   
    int NewItemPrice ;
    cout << "Congratulation You Purchse New Item :) "<< endl;
    cout<<"Enter Item Amount : "<<endl ;
    cin>>NewItemPrice;

    TotalPurchse += NewItemPrice;
    return TotalPurchse;

}