
/**
 * The Calc (Calculate) class Provides constants and static methods for performing basic numeric operations
 * such as the absolute value, maximum value, minimum value, ceil ,floor , power, and round.
 *
 * @author Eyad AL-‘Amawi
 */
public class Calc {

    /**
     * The Exponential (Constant value)
     */
    public static final double E = 2.718281828459045;
    /**
     * PI (Constant value)
     */
    public static final double PI = 3.141592653589793;

    /**
     * get the positive integer number.
     *
     * @param number integer number to absolute it
     * @return absolute value for the integer number
     */
    public static int abs(int number) {
        int x = number;
        if (x < 0) {
            x = -1 * x;
        } else {
            return x;
        }
        return x;
    }

    /**
     * get the positive float number.
     *
     * @param number float number to absolute it
     * @return absolute value for the float number
     */
    public static double abs(double number) {
        double x = number;
        if (x < 0) {
            x = -1 * x;
        } else {
            return x;
        }
        return x;
    }

    /**
     * get the maximum value from the two integer numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the maximum number
     */
    public static int max(int number1, int number2) {
        int max;
        if (number1 >= number2) {
            max = number1;
        } else {
            max = number2;
        }
        return max;
    }

    /**
     * get the maximum value from the two double numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the maximum number
     */
    public static double max(double number1, double number2) {
        double max;
        if (number1 >= number2) {
            max = number1;
        } else {
            max = number2;
        }
        return max;
    }

    /**
     * get the minimum value from the two integer numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the minimum number
     */
    public static int min(int number1, int number2) {
        int min;
        if (number1 <= number2) {
            min = number1;
        } else {
            min = number2;
        }
        return min;
    }

    /**
     * get the minimum value from the two double numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the minimum number
     */
    public static double min(double number1, double number2) {
        double min;
        if (number1 <= number2) {
            min = number1;
        } else {
            min = number2;
        }
        return min;
    }

    /**
     * The method ceil gives the smallest integer that is greater than or equal
     * to the argument.
     *
     * @param number A double or float primitive data type.
     * @return the smallest integer that is greater than or equal to the number.
     * Returned as a double.
     */
    public static double ceil(double number) {
        int x;
        if ((int) number != number) {
            if (number >= 0) {
                x = (int) number + 1;
            } else {
                x = (int) number;
            }
        } else {
            x = (int) number;
        }

        return x;

    }

    /**
     * The method floor gives the largest integer that is less than or equal to
     * the argument.
     *
     * @param number A double or float primitive data type.
     * @return the largest integer that is less than or equal to the argument.
     * Returned as a double.
     */
    public static double floor(double number) {
        int x;
        if ((int) number != number) {
            if (number >= 0) {
                x = (int) number;
            } else {
                x = (int) number - 1;
            }
        } else {
            x = (int) number;
        }

        return x;
    }

    /**
     * The method returns the value of the first argument raised to the power of
     * the second argument.
     *
     * @param base Any primitive data type.
     * @param exponenet just positive integers
     * @return the value of the first argument raised to the power of the second
     * argument.
     */
    public static double pow(double base, int exponenet) {
        double r = 1;
        for (int i = 1; i <= exponenet; i++) {
            r = r * base;
        }
        return r;
    }

    /**
     * The method round returns the closest integer.
     *
     * @param number A double primitive data type.
     * @return the closest integer to the number.
     */
    public static int round(double number) {
        int rounded = (int) number;
        if (number >= 0) {
            if (number - rounded >= 0.5) {
                rounded++;
            }
        } else {
            if (number - rounded < -0.5) {
                rounded--;
            }
        }
        return rounded;

    }
}
