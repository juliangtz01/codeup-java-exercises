package grades;

import java.util.ArrayList;

public class Student
{
    //create a private String object to hold the name of the student
    private String name;

    //create a private Integer ArrayList to hold the grades for the student
    private ArrayList<Integer> grades;

    //create a constructor that sets name property, and initializes the grades property as an empty ArrayList
    public Student(String name)
    {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName()
    {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade)
    {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage()
    {
        int total = 0;
        double size = grades.size();

        for(int g : grades)
        {
            total += g;
        }

        return total / size;
    }

}
