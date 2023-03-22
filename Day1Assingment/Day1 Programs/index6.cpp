/*

 Qestion : Qestion : Wright the Programt to find the factorial of Given Number(With Using Recursion) ?

*/

#include <iostream>
using namespace std;

int FactorialWithUsingRecursion(int);


int main()
{

    int Number;
    cout << "Enter Number Which you Want to find Factorial" << endl;
    cin >> Number;

    int Result=FactorialWithUsingRecursion(Number);
    cout<<"Factorial With Using Recursion : "<<Result<<endl;

    return 0;
}


int FactorialWithUsingRecursion(int n){

 
    if(n>=1)  return n*FactorialWithUsingRecursion(n-1);
    else return 1;

}
