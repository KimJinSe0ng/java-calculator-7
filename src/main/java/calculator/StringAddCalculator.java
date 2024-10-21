package calculator;

import calculator.io.Input;
import calculator.io.Output;
import calculator.service.Parser;

public class StringAddCalculator {

    public static void run() {
        String line = Input.inputMessage();
        Output.printResult(Parser.parse(line));
    }
}
