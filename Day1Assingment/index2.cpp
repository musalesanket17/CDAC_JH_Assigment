/*

Qestion : Appliacation for to get the criteria for getting married


*/

#include <iostream>
using namespace std;

int CriteriaForFemale();
int CriteriaForMale();

int flage ;
int Age, Weight, Height;

int main()
{

    int Choose;
    cout << "If You Want to Choose CriteriaForMale Then type One Or CriteriaForFemale Type Two " << endl;
    cin >> Choose;

    switch (Choose)
    {
    case 1:
       CriteriaForMale();
        break;

    case 2:
       CriteriaForFemale();
        break;

    default:
        cout << "Plz Choose Correct Option" << endl;
        break;
    }


    cout<<"******************"<<endl;
    cout<<flage<<endl;

    if (flage)
        cout << "Match Found Perfect :) " << endl;
    else
        cout << "Match Not Found Perfect (: " << endl;

    return 0;
}

int CriteriaForFemale()
{
    cout<<"You are In Female Directory"<<endl;
    cout << "Enter Age ";
    cin >> Age;
    cout << "Enter Weight" << endl;
    cin >> Weight;
    cout << "Enter Height" << endl;
    cin >> Height;

    if (Age >= 18 && Weight <= 45 && Height >= 160)
      flage = 1;
}
int CriteriaForMale()
{

    cout<<"You are in Male Directory"<<endl ;
    cout << "Enter Age ";
    cin >> Age;
    cout << "Enter Weight" << endl;
    cin >> Weight;
    cout << "Enter Height" << endl;
    cin >> Height;

    if (Age >= 21 && Weight <= 65 && Height >= 172)
        flage= 1;
}