package calculatorExample;
/*this is a template for a calculator class. The class will have the ff attributes
num1 and num2 and the add, subtract and divide methods


 */
public class Calc {
    int num1;
    int num2;
    int total;

// this method means that anytime
    public int add()
    {
        total = num1+num2;
        return total;
    }
    public int subtract(){
        total= num1-num2;
        return total;
    }

    public int divide(){
        total = num1/num2;
        return total;
    }

    public int multiply(){
        total = num1*num2;
        return total;
    }

    public int modulus(){
        total = num1%num2;
        return total;
    }
}
