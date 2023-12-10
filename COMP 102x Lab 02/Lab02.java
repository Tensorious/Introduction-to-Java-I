import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        double inputA = IO.inputDouble();
        double inputB = IO.inputDouble();
        final double sumMul = inputA * inputB; //use final for a constant and it can't change for any other types.
        
        IO.outputln("Input your number A: " + inputA);
        IO.outputln("Input your number B: " + inputB);
        System.out.println("Your sum from " + inputA + " * " + inputB + " is = " + sumMul);
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        double inputBase = IO.inputDouble();
        double inputHeight = IO.inputDouble();
        final double sumTriArea = (inputBase * inputHeight)/2;
        
        IO.outputln("Input your base (alas): " + inputBase);
        IO.outputln("Input your height (tinggi): " + inputHeight);
        System.out.println("Your triangle area with base (alas): " + inputBase + " and height (tinggi): " + inputHeight + " is " + sumTriArea);
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        
        
        
        
        
    }
}
