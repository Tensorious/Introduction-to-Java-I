import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        double inputNum1;
        double inputNum2;
        
        IO.output("Input your number A: "); 
        inputNum1 = IO.inputDouble();
        IO.output("Input your number B: " ); 
        inputNum2 = IO.inputDouble();
        
        //use final for a constant and it can't change for any other types.
        final double sumMul = inputNum1 * inputNum2; 
        
        IO.outputln("Your sum from " + inputNum1 + " * " + inputNum2 + " is = " + sumMul);
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        double inputBase;
        double inputHeight;
        
        IO.outputln("Input your base (alas): " );
        inputBase = IO.inputDouble();
        IO.outputln("Input your height (tinggi): ");
        inputHeight = IO.inputDouble();
        
        final double sumTriArea = (inputBase * inputHeight)/2;
        
        IO.outputln("Your triangle area with base (alas): " + inputBase + " and height (tinggi): " + inputHeight + " is " + sumTriArea);
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        double inputA;
        double inputB;
        double inputC;
        
        IO.output("Input a: ");
        inputA = IO.inputDouble();
        IO.output("Input b: ");
        inputB = IO.inputDouble();
        IO.output("Input c: ");
        inputC = IO.inputDouble();
        
        final double answer1 = (-inputB + Math.sqrt(Math.pow(inputB,2) - 4.0 * inputA * inputC))/(2.0 * inputA);
        final double answer2 = (-inputB - Math.sqrt(Math.pow(inputB,2) - 4.0 * inputA * inputC))/(2.0 * inputA);
        
        IO.outputln("First X is " + answer1 + " or Second X is " + answer2);
    }
}
