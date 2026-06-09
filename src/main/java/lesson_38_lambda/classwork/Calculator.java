package lesson_38_lambda.classwork;

public class Calculator {

    public int operation2(int c, int d, Operationable op) {
        return op.calculate(c, d);
    }
}
