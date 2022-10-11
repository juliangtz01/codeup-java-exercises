package grades;

import java.util.HashMap;
import java.util.Scanner;

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


//        System.out.printf("%s's average is %.0f, and github username is %s.%n",julian.getName(), julian.getGradeAverage(), students.get(julian.getName()));
//
//        System.out.printf("%s's average is %.0f, and github username is %s.%n",greg.getName(), greg.getGradeAverage(), students.get(greg.getName()));
//
//        System.out.printf("%s's average is %.0f, and github username is %s.%n",mia.getName(), mia.getGradeAverage(), students.get(mia.getName()));

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.printf("|%s| |%s| |%s| |%s|%n", students.get(julian.getName()), students.get(greg.getName()), students.get(mia.getName()), students.get(amida.getName()));



    }

    void getStudentInfo(HashMap <String, String> student, Student name)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);
        String anotherStudent = "";
        do
        {
            System.out.println("What student would you like to see more information on?");
            String studentUsername = scanner.next();

            if(!student.containsValue(studentUsername))
            {
                System.out.println("Sorry, no student found with that username of \"" + studentUsername + "\".");
                System.out.println("Would you like to see another student?");
                anotherStudent = answer.next();
            }
            else
            {
                System.out.printf("Name: %s - GitHub Username: %s%n Current Average: %.1f", student.get(studentUsername), student);
            }


        }while(anotherStudent.equalsIgnoreCase("y"));
    }
}
