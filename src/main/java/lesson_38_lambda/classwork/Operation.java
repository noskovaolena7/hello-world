package lesson_38_lambda.classwork;

import lombok.Data;

@Data
public class Operation implements Operationable {

    @Override
    public int calculate(int a, int b) {
        return a +b;
    }
}
