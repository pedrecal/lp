#include <iostream>

using namespace std;

float power (float base, float exponent)
{
    if ( 0 == exponent)
    {
        return 1;
    }
    else if ( 1 != exponent)
    {
        base *= power(base, exponent - 1);  // don't forget power in power(base, exponent)
    }
    else if ( exponent < 0 )
    {
        return 1 / power(base, -exponent);
    }

    return base;
}


int main ()
{
    cout<<"Enter your base: ";
    float base;
    cin>>base;

    cout<<"Enter your exponent: ";
    float exponent;
    cin>>exponent;

    cout<<"The answer is "<<power(base, exponent);

}
