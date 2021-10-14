import java.util.Locale;

public class GoodStudent
{
    //instance variables
    String firstName = "default";
    String lastName = "default";
    int idNum = 0;
    double gpa = 0.0;
    boolean inCs = false;


    //all three of the constructors
    public GoodStudent(String newFirstName, String newLastName, int newIdNum, double newGpa, boolean newInCs)
    {
        firstName = newFirstName;
        lastName = newLastName;
        idNum = newIdNum;
        gpa = newGpa;
        inCs = newInCs;
    }

    public GoodStudent(String newFirstName, String newLastname)
    {
        firstName = newFirstName;
        lastName = newLastname;
        idNum = 0;
        gpa = 0;
        inCs = false;
    }

    public GoodStudent()
    {
        firstName = "default";
        lastName = "default";
        idNum = 0;
        gpa = 0;
        inCs = false;
    }//end constructors

    //getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getIdNum()
    {
        return idNum;
    }
    public double getGpa()
    {
        return gpa;
    }
    public boolean getInCs()
    {
        return inCs;
    }//end getters

    //setters
    public void setFirstName(String newFirstName)
    {
        firstName = firstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setIdNum(int newIdNum)
    {
        idNum = newIdNum;
    }
    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }
    public void setInCs (boolean newInCs)
    {
        inCs = newInCs;
    }//end setters


    public String CreateId()
    {
        String digitalID = "default";
        String firstInitial = firstName.substring(0,1).toLowerCase();
        String lastNameInLower = lastName.toLowerCase();
        String sIdnum = String.valueOf(idNum);
        digitalID = firstInitial + lastNameInLower + sIdnum.substring(sIdnum.length()-3,sIdnum.length());
        return digitalID;
    }//end method CreateId

    public double CSGPA()
    {
        if (inCs)
        {
            gpa = gpa * 1.15;
        }
        gpa *= 100;
        gpa = Math.floor(gpa);
        gpa /= 100;

        return gpa;

    }

    //toString method
    public String toString()
    {
        String output = "";
        output += "First name: " + firstName;
        output += "\nLast name: " + lastName;
        output += "\nID num: " + idNum;
        output += "\nGPA: " + gpa;
        output += "\nIs in CS: " + inCs;
        return output;
    }


}//end class GoodStudent
