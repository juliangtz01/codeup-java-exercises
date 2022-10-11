package grades;

import java.util.HashMap;

public class GradesApplication
{
    public static void main(String[] args)
    {
        //create a HasMap named students
        HashMap<String, String> students = new HashMap<>();

        Student julian = new Student("Julian");
        Student greg = new Student("Greg");
        Student mia = new Student("Mia");
        Student amida = new Student("Amida");

        julian.addGrade(90);
        julian.addGrade(80);
        julian.addGrade(85);

        greg.addGrade(100);
        greg.addGrade(95);
        greg.addGrade(90);

        mia.addGrade(100);
        mia.addGrade(95);
        mia.addGrade(90);

        amida.addGrade(100);
        amida.addGrade(95);
        amida.addGrade(90);

        students.put(julian.getName(), "juliangtz01");
        students.put(greg.getName(), "GregRodriguezJr");
        students.put(mia.getName(), "miamija7");
        students.put(amida.getName(), "amida2022");


        System.out.printf("%s's average is %.0f, and github username is %s.%n",julian.getName(), julian.getGradeAverage(), students.get(julian.getName()));

        System.out.printf("%s's average is %.0f, and github username is %s.%n",greg.getName(), greg.getGradeAverage(), students.get(greg.getName()));

        System.out.printf("%s's average is %.0f, and github username is %s.%n",mia.getName(), mia.getGradeAverage(), students.get(mia.getName()));



    }
}
