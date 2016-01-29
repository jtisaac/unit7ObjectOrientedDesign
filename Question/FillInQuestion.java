import java.util.Scanner;
/**
 * Write a description of class FillInQuestion here.
 * This class supports a fill in the question blank where the answer is specified in the question's text delimited by '-'. This ckass eztracts tje anwert fiom the questiom's text and stores the text and answer accordingly.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    /** EXTRACTS    The answer from the specified question tezt. For example:
     * The inventor was ___
     * answer:phem
     * description of instance variable x (add comment for each instance variable) */
    private int x;
    

    /**
     * Default constructor for objects of class FillInQuestion
     */
    public FillInQuestion()
    {
        // initialise instance variables
        x = 0;
    }

    
    public void setText( String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_________" + parser.next();
        super.setText( question );
        this.setAnswer( answer );
    }

}
