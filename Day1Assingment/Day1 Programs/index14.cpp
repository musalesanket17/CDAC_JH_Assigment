/*

Qestion : Print The Odd Series Till Given Number ?

*/

#include <iostream>
using namespace std;
int OddSeries(int);
int main()
{

    int number;
    cout << "Enter The Number : ";
    cin >> number;
    OddSeries(number);

    return 0;
}

int OddSeries(int n)
{
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
            if (i%2 == 1) {
                count++;
                cout << "The " << count << " Number of Odd Series of " << n << " is " << i << endl;
            }
    }
}