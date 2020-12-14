package Controller;
import java.util.*;
class StudentTest
{
    private String studentname;
    private int rollno;
    private int studentage;

    public StudentTest(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }
    
    public static Comparator<StudentTest> StuNameComparator = new Comparator<StudentTest>() {

    	public int compare(StudentTest s1, StudentTest s2) {
    	   String StudentName1 = s1.getStudentname().toUpperCase();
    	   String StudentName2 = s2.getStudentname().toUpperCase();

    	   //ascending order
    	   return StudentName1.compareTo(StudentName2);

    	   //descending order
    	   //return StudentName2.compareTo(StudentName1);
        }};

        /*Comparator for sorting the list by roll no*/
        public static Comparator<StudentTest> StuRollno = new Comparator<StudentTest>() {

    	public int compare(StudentTest s1, StudentTest s2) {

    	   int rollno1 = s1.getRollno();
    	   int rollno2 = s2.getRollno();

    	   /*For ascending order*/
    	   return rollno1-rollno2;

    	   /*For descending order*/
    	   //rollno2-rollno1;
       }};

       @Override
       public String toString() {
           return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
       }
   
}


public class CamparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentTest> arraylist = new ArrayList<StudentTest>();
		   arraylist.add(new StudentTest(101, "Zues", 26));
		   arraylist.add(new StudentTest(505, "Abey", 24));
		   arraylist.add(new StudentTest(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, StudentTest.StuNameComparator);

		   for(StudentTest str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylist, StudentTest.StuRollno);
		   
		   for(StudentTest str: arraylist){
				System.out.println(str);
		   }

	}

}
