05
float power (float base, float exponent)
06
{
07
    if ( 0 == exponent)
08
    {
09
        return 1;
10
    }
11
    else if ( 1 != exponent)
12
    {
13
        base *= power(base, exponent - 1);  // don't forget power in power(base, exponent)
14
    }
15
    else if ( exponent < 0 )
16
    {
17
        return 1 / power(base, -exponent);
18
    }
19

20
    return base;
