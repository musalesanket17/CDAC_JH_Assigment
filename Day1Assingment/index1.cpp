/*
Qestion : Student Marksheet
- Each Subject 100 Marks
- Five subject
- Calculate Avg
- Claculate Percentage
- percentage = (total / 500) * 100
*/

#include <iostream>
using namespace std;


float average(float ,float);
float percen(float ,float);

int main()
{

    int marathi, hindi, enghish, java, javascript ;
    float total , avg , percentage ;


    cout << "Give Marks Here As Input In Sequese Of Marathi  Hindi Enghish Java Javascript" << endl;

        cin >>marathi;
        cin >>hindi;
        cin >>enghish;
        cin >>java;
        cin >>javascript;

    total = marathi+ hindi+ enghish+ java+ javascript ;
    // cout<<total;

    avg = average( total,5);
    percentage =percen(total ,500);
 
  
    cout<< "Total Marks : " << total << endl ;
    cout<< "Average of Marks : "<<avg <<endl;
    cout<< "Percentage of Marks : "<<percentage <<"%"<<endl;
    
        return 0;
}


float average(float total,float n){

    float average = total/n;
    return average;

}

float percen(float total , float sumofmarks){

    float percenatge = total/sumofmarks * 100;
    return percenatge;
}