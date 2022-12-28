package org.example.calculate.tobe;

import org.example.calculate.domain.PositiveNumber;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public interface ArithmeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
