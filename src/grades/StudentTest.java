package grades;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student john = new Student("John");

        john.addGrade(80);
        john.addGrade(90);
        john.addGrade(100);
        john.addGrade(70);

        System.out.println(john.getName());

        System.out.println(john.getGradeAverage());




    }
}
