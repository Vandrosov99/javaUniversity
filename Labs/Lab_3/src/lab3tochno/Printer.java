package lab3tochno;
import java.util.Arrays;
public class Printer {
	static Storage st = new Storage();
	 public static void printArray(Student[] input){
	        for (Student value : input){
	            
	                if (value.getName() == null){
	                    continue;
	                }
	               System.out.println(value.toString());
	            }
	    }
	 public static void printAvG(Student [] input) {
		 for (Student value : input) {
			 if (value.getAvgMark() < 4.5f) {
			 continue;
			 }
			 
			 System.out.println(value.toString());
			 
			 }
		 }
	 public static void listofexamsforstudent(Student [] input) {
		 int count1 = 0;
		 int count2 = 0;
		 int count3 = 0;
		 for(Student value : input) {
			 if(value.getCourse() == 1) {
				 count1 ++;
				// System.out.println("Kolvo pervokursnikov" + count);
				 //System.out.println("list of exams:" + Arrays.toString(st.Ex1()));
			 }
			 else if (value.getCourse() == 2) {
				 count2++;
			 }
			 else if(value.getCourse() == 3){
				 count3++;
			 }
		 }
		 
																																														 System.out.println("Kolvo pervokursnikov = " + count1);
																																														 System.out.println("Kolvo vtorokursnikov = " + count2);
																																														 System.out.println("Kolvo tretiekursnikov = " + count3);
																																														 System.out.println("list of exams kurs = 1:" + Arrays.toString(st.Ex1()));
																																														 System.out.println("List of zachets kurs = 1 : " + Arrays.toString(st.Zc1()));
																																														 System.out.println("list of exams kurs = 2:" + Arrays.toString(st.Ex2()));
																																														 System.out.println("List of zachets kurs = 2 : " + Arrays.toString(st.Zc2()));
																																														 System.out.println("list of exams kurs = 3:" + Arrays.toString(st.Ex3()));
																																														 System.out.println("List of zachets kurs = 3 : " + Arrays.toString(st.Zc3()));

		 

		 
		 
		
	 }
	 
	 }
	 

