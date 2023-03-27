package za.ac.wedowebapps.business;

/**
 *
 * @author Ngcobo VS
 */
public class QuestionsBank {

    public QuestionsBank() {
    }
    
    public String additionTest(int num1,int num2){
        String question = num1+" + "+num2+" = ?";
        return question;
    }
    public String subtractionTest(int num1,int num2){
        String question = num1+" - "+num2+" = ?";
        return question;
    }
    public String divisionTest(int num1,int num2){
        String question = num1+" / "+num2+" = ?";
        return question;
    }
    public String multiplicationTest(int num1,int num2){
        String question = num1+" * "+num2+" = ?";
        return question;
    }
}
