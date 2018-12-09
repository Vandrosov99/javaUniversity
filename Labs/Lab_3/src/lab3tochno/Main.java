package lab3tochno;

public class Main {

		public static void main(String[] args) {
	        Student[] student = new Student[9];
	        Filller.fillData(student);
	       Printer.printArray(student);
	       System.out.println("------------------------------------");
	        System.out.println("After some procces 4.5");
		       System.out.println("------------------------------------");
	        Printer.printAvG(student);
		       System.out.println("------------------------------------");
	        System.out.println("After some proces find student for exam");
		       System.out.println("------------------------------------");

	       Printer.listofexamsforstudent(student);

	    }
	    }
