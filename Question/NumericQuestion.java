

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    //this is an example of method overloading.
    //this method overloads the setAnswer method of the Question class
    public void setAnswer(double correctResponse )
    {
    }
    //this is an rxample of a method overriiding.
    //this method overrides the checkAnswer method of the Question class
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer ) <= 0.01;
    }
}
