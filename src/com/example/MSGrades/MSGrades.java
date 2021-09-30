package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    
    // Create 4 ArrayLists below all private constant properties (final)

    // 1. a new instance of a students ArrayList storing strings
    private final ArrayList<String> students =new ArrayList<>();

    // 2. a new instance of a math grades ArrayList storing integers
    private final ArrayList<Integer> mathGrades = new ArrayList<Integer>();
    // 3. a new instance of a science grades ArrayList storing integers
    private final ArrayList<Integer> scienceGrades = new ArrayList<>();
    // 4. a new instance of an english grades ArrayList storing integers
    private final ArrayList<Integer> englishGrades = new ArrayList<>();



    public MSGrades(){
        // Add some students and their grades to the array lists
 // Add some students and their grades to the array lists

        // add two students to the students ArrayList
        students.add("Clara");
        students.add("Smith");
        // add two corresponding values for the two students to the math grades ArrayList
        mathGrades.add(70);
        mathGrades.add(35);
        // add two corresponding values for the two students to the science grades ArrayList
        scienceGrades.add(88);
        scienceGrades.add(78);
        // add two corresponding values for the two students to the english grades ArrayList
        englishGrades.add(95);
        englishGrades.add(75);
    }

    }

    public void printStudents(){
        
    }
   // loop thru the students ArrayList with a For Each loop
        // print each students name on a new line as output
        for(String student:students){
            System.out.println("Student: "+student);
        }


    }

    // Make a method that prints an individual students grades
    // It will be public, not have a return value,
    // and have one int type parameter that is a students index

    // Inside the method:
    // Print the students name by using the index variable to index the students array
    // Print a concatenated string of say "Math: " + and the corresponding grade
    // from that ArrayList of grades by index
    // Do this for the next two subjects
    // Total of four output statements


    public void printStudentGrades(int studentIndex) {

        System.out.println("Student:" +students.get(studentIndex));
        System.out.println("Math: "+mathGrades.get(studentIndex));
        System.out.println("Science: "+scienceGrades.get(studentIndex));
        System.out.println("English: "+englishGrades.get(studentIndex));

    }

            

    public static void main(String[] args) {
        // write your code here
          // create a new instance of MSGrades class and store in a variable
        // (anything like msGrade8)
        // look up how to print an empty new line
        // for readability
        MSGrades msGrades= new MSGrades();
        
        System.out.println("Middle School Roster");
        System.out.println("====================");
        
        // invoke or run the printStudents method on our class instance
        msGrades.printStudents();

        // Print another empty line if desired for readability
        System.out.println("\n");

        // Use a for loop to loop thru the given teachers array on the class instance
        // inside the loop
        // create a new variable that stores the result of "Teacher: " +
        // teachers name from the array using the counter variable
        // Print the new variable as output
        for (int teacherIndex=0; teacherIndex< msGrades.teachers.length ;teacherIndex++) {
            String teacherResult =msGrades.teachers[teacherIndex];
            System.out.println("Teacher:" +teacherResult);
            System.out.println("");
        }

        System.out.println("\nStudent Grades:\n");

        // Use a for loop to loop thru students ArrayList on the class instance
        // inside the loop
        // pass the counter var as an index to the printStudentGrades method
        // to print each students info
        // Print a new line if you want it to look presentable
        for (int studentIndex=0; studentIndex<msGrades.students.size() ; studentIndex++) {
            msGrades.printStudentGrades(studentIndex);
            System.out.println("");
        }

        System.out.println();

       

        
        

        

        
    }
}
