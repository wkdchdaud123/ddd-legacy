package calculator.domain;

import calculator.common.exception.InvalidArgumentException;
import calculator.common.exception.InvalidArgumentExceptionMessage;

public class PositiveNumber {

    private static final int MINIMUM_NUMBER = 0;
    private static final PositiveNumber ZERO = new PositiveNumber(MINIMUM_NUMBER);
    private final int number;

    public PositiveNumber(final int number) {
        this.number = number;
        validation();
    }

    private void validation() {
        isPositive();
    }

    private void isPositive() {
        if (number < 0) {
            throw new InvalidArgumentException(InvalidArgumentExceptionMessage.NEGATIVE_NUMBER_EXCEPTION.getMessage());
        }
    }

    public static int getMinimumNumber() {
        return MINIMUM_NUMBER;
    }

    public static PositiveNumber getZero() {
        return ZERO;
    }

    public static PositiveNumber from(final int number) {
        return new PositiveNumber(number);
    }

    public PositiveNumber add(final PositiveNumber positiveNumber) {
        return new PositiveNumber(number + positiveNumber.number);
    }

    public int getNumber() {
        return number;
    }

}
