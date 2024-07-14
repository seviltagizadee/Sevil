package PDF9EVISI3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            ChechCorrectly(60);
        } catch (InvalidUserInputException e) {
            throw new RuntimeException(e);
        }
    }
    public static void ChechCorrectly(int age) throws InvalidUserInputException{
        if (age>50){
            throw new InvalidUserInputException("You are not suitable this position!");
        }
    }
}
