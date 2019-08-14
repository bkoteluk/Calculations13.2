package pl.homework.lib;

public class Parameters {
    private String operator;
    private int number1;
    private int number2;

    public Parameters( int number1, String operator, int number2) {

        this.number1 = number1;
        this.operator = operator;
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2;
    }

}
