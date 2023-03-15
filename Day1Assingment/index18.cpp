/*

 Qestion : Find given number is Palindrome Or Not ?


*/

#include <iostream>
using namespace std;

int CheckPalindrom(int);

int main()
{

    int number, rev;
    cout << "Enter Number  : " << endl;
    cin >> number;

    rev = CheckPalindrom(number);

    number == rev ? cout << number << " Number is Palindrom :) " << endl : cout << number << " Number is Not Palindrom :( ";

    return 0;
}

int CheckPalindrom(int n)
{

    int r;
    int rev = 0;
    while (n > 0)
    {
        r = n % 10;
        rev = (rev * 10) + r;
        n = n / 10;
    }

    return rev;
}
