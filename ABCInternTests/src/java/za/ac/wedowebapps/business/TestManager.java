package za.ac.wedowebapps.business;

/**
 *
 * @author Ngcobo VS
 */
public class TestManager {
    private int num1,num2,answer;

    public TestManager() {
    }

    public TestManager(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.answer = answer;
    }
    
    public int additionTestManager(int num1,int num2){
        answer = num1 + num2;
        return answer;
    }
    public int subtractionTestManager(int num1,int num2){
        answer = num1 - num2;
        return answer;
    }
    public int divisionTestManager(int num1,int num2){
        answer = num1/num2;
        return answer;
    }
    public int multiplicationTestManager(int num1,int num2){
        answer = num1*num2;
        return answer;
    }
}
