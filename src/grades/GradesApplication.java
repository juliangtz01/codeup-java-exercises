package grades;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class GradesApplication
{
    public static void main(String[] args)
    {
        //create a HasMap named students
        HashMap<String, Student> students = new HashMap<>();

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

        students.put("juliangtz01", julian);
        students.put("GregRodriguezJr", greg);
        students.put("miamija7", mia);
        students.put("amida2022", amida);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for(Entry <String, Student> person : students.entrySet())
        {
            System.out.printf("|%s| ", person.getKey());
        }
        System.out.println("\n");

        getStudentInfo(students);

    }

    //create a static void function named getStudentInfo that takes in Hashmap argument to display the student information
    public static void getStudentInfo(HashMap <String, Student> student)
    {
        //create two scanners to capture user input for the continuing to get student information and also the student username
        Scanner scanner = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);
        //create a String variable named anotherStudent and set an empty string
        String anotherStudent = "";

        //create a do while loop to prompt user to enter a student username to display the student information
        do
        {
            //prompt user to enter a student username to display their information
            System.out.println("What student would you like to see more information on?");
            //store the user input in studentUsername variable
            String studentUsername = scanner.next();
            System.out.println();

            //create an if statement to see if the username exists in our list of student usernames
            if(!student.containsKey(studentUsername))
            {
                //if the username does not exist display a message to the user telling them that the username does not found
                System.out.println("Sorry, no student found with that username of \"" + studentUsername + "\".");
                //prompt the user if he/she would like to look for another student
                System.out.println("Would you like to see another student y/n?");
                anotherStudent = answer.next();
            }
            //if the username exists then display the student information
            else
            {
                //create a for each loop to display the student information
                for(Entry <String, Student> person : student.entrySet())
                {
                    if(person.getKey().equals(studentUsername))
                    {
                        //display the name of the student, the username and the average of the student
                        System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.1f%n", person.getValue().getName(), person.getKey(), person.getValue().getGradeAverage()) ;

                        System.out.println();

                        //prompt the user if he/she would like to look for another student
                        System.out.println("Would you like to see another student y/n?");
                        anotherStudent = answer.next();
                        System.out.println();
                    }
                }
            }

        }while(anotherStudent.equalsIgnoreCase("y"));
    }
}
