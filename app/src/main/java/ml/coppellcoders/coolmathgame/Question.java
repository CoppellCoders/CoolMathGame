package ml.coppellcoders.coolmathgame;

import java.util.Random;
public class Question {

    public int operand1;
    public int operand2;
    public int operator;
    public int answer;
    public String[] operators;
    Random random = new Random();

    public Question() {
        operators = new String[4];
<<<<<<< HEAD
=======
        operand1 = random.nextInt(101);
        operand2 = random.nextInt(101);
        operator = random.nextInt(4);
>>>>>>> 3e192815c9f329a9761531a9bb64951714e1f2d1
        operators[0] = "+";
        operators[1] = "-";
        operators[2] = "*";
        operators[3] = "/";
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getQuestion() {
        operand1 = random.nextInt(101);
        operand2 = random.nextInt(101);
        operator = random.nextInt(4);
        String question = operand1 + " " + operators[operator] + " " + operand2 + "  =";
        return question;
    }

    public int getAnswer() {
        if(operator == 0) {
            answer = operand1 + operand2;
        }

        else if(operator == 1) {
            answer = operand1 - operand2;
        }

        else if(operator == 2) {
            answer = operand1 * operand2;
        }

        else if(operator == 3) {
            answer = operand1 / operand2;
        }

        return answer;
    }
}
