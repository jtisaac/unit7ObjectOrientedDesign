import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Person implements Comparable<Person>
{
    private String name;
    private ArrayList<String> nameList;

    public Person(String inputName)
    {
        this.name = inputName;
    }
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        
    }
    
    public int compareTo(Person other)
    {
        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i< 10; i++)
        {
           nameList.add(s.next());
        }
        Collections.sort(nameList);
        return name.compareTo(other.name);
    }
}
