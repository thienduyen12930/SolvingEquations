
package controller;

import common.Library;
import common.Equation;
import common.InputValidation;
import java.util.List;
import view.Menu;

public class SolvingEquation extends Menu<String>{
    
    static String[] mc = {"Calculate Superlative Equation ", "Calculate Quadratic Equation   ", "Exit                           "};
    InputValidation va;
    Equation e;
    double a;
    double b;
    double c;
    
    public SolvingEquation() {
        super("--- EQUATION PROGRAM ---", mc);
        va = new InputValidation();
        e = new Equation();

    }

    @Override
    public void execute(int n) {
       switch(n) {
            case 1:
               calculateSuperlativeEquation();
               break;
            case 2:
                calculateQuadraticEquation();
                break;
            case 3:
                System.exit(0);
       }
    }
    
    public void calculateSuperlativeEquation() {
        System.out.print("Enter A: ");
        a = va.validateDouble();
        System.out.print("Enter B: ");
        b = va.validateDouble();
        List<Double> list = e.doSuperlativeEquation(a, b);
        e.findEvenOddSquareNumber(list);
    }
    
    public void calculateQuadraticEquation() {
        System.out.print("Enter A: ");
        a = va.validateDouble();
        System.out.print("Enter B: ");
        b = va.validateDouble();
        System.out.print("Enter C: ");
        c = va.validateDouble();
        List<Double> list = e.doQuadraticEquation(a, b, c);
        e.findEvenOddSquareNumber(list);
    }
}
