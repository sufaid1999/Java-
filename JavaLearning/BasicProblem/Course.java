//Q. Design a course class.

public class Course {
    static int maxCapacity = 100; // The maximum number of students for any course.

    String courseName;
    String studentName;
    int enrollmentNo;
    static int totalStudent;

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity (int capacity){
        Course.maxCapacity = capacity;
    }

    Course(String courseName){
        this.courseName = courseName;
        System.out.println("Welcome to our course " + courseName);

    }

    public void enrollStudent(String studentName){
        System.out.println("Hey! "+ studentName);
        enrolledStudents[enrollmentNo] = studentName;
        enrollmentNo ++;
        totalStudent ++ ;
    }

    public void unenrollStudent(String studentName){
        // use loop to delete a student from the array.
        totalStudent -- ;
        
    }

    public static void main(String[] args) {
        Course CSE = new Course("ComputerScience");
        CSE.enrollStudent("Sufaid Hussain");
        System.out.println(totalStudent);
        

    }

    
}
