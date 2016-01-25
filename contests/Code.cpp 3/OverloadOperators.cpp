/*
Overload Operators
Mon 25 Januaray 2016

Made with <3 by Pierre Plantié
*/

//Overload operators + and << for the class complex
//+ should add two complex numbers as (a+ib) + (c+id) = (a+c) + i(b+d)
Complex operator+(const Complex& a, const Complex& b) {
    Complex n;
    n.a = a.a + b.a;
    n.b = a.b + b.b;
    return n;
}

//<< should print a complex number in the format "a+ib"
std::ostream& operator<<(std::ostream& os, const Complex& nb) {
    os << nb.a << "+i" << nb.b;
    return os;
}
