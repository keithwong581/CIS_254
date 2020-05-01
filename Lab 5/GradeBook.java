/***********************************************************************************
* Keith Wong
* CIS 254
*
* Grade book class that contains a courseName instance 
* variable and methoods to help set and get its value.
************************************************************************************/
public class GradeBook
{
   private String courseName;
   private String instructorName;

   // constructor initializes courseName with String argument
   public GradeBook( String course, String instructor )
   {
      courseName = course;
      instructorName = instructor;
   }

   // method to set the course name
   public void setCourseName( String course )
   {
      courseName = course;
   }

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   }

   //method to set the instructor name
   public void setInstructorName( String instructor )
   {
      instructorName = instructor;
   }

   // method to retrieve the instructor name
   public String getInstructorName()
   {
      return instructorName;
   }

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      System.out.printf( "Welcome to the grade book for \n%s!\n",
                         getCourseName() );
      System.out.printf( "This course is taught by \n%s!\n",
                         getInstructorName() );
   }
}