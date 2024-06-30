/**
 * calculator
 */
public class Calculator {
    public float calculatePlus(float firstNumber, float secondNumber) {
      return firstNumber + secondNumber;
    }

    public float calculateMinus(float firstNumber, float secondNumber) {
      return firstNumber - secondNumber;
    }

    public float calculateTimes(float firstNumber, float secondNumber) {
      return firstNumber * secondNumber;
    }

    public float calculateDivide(float firstNumber, float secondNumber) {
      return firstNumber / secondNumber;
    }

    public float calculatePow(float firstNumber, float secondNumber) {
      return (float) Math.pow(firstNumber, secondNumber);
    }
}