package za.ac.wedowebapps.business;

/**
 *
 * @author Ngcobo VS
 */
public class NumberGenerator {

    public NumberGenerator() {
    }
    public int generateNumber(){
        int number =(int)(10 + Math.floor(Math.random()*90));
        return number;
    }
    public int multiplicationNumberGenerator(){
        int number =(int)(1 + Math.floor(Math.random()*10));
        return number;
    }
}
