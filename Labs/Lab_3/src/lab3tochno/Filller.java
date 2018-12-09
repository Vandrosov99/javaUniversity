package lab3tochno;

public class Filller {
	 public static void fillData(Student[] student) {
	        //initialization
	        for (int count = 0; count < student.length; count++) {
	            student[count] = new Student();
	        }
	        //zapolnenie
	        student[0] = new Student("Самосвалов", "Петя", "Максимович", 1, 1, 4.8f,new String[] {"programirovanie","matematika","oop","chto to ewe"},new String[] {"fillosofia","fizra","english"});
	        student[1] = new Student("Андросов", "Вова", "Андреевич", 2, 2, 4.7f,new String[] {"SQL","Diskretka"},new String[] {"english","fizra"});
	        student[2] = new Student("Пелипенко", "Илья", "Дмитрович", 3, 3, 3.0f,new String[] {"Injeneria","Proektirovanie","analiz"},new String[]{"Ukrmova","Wevchenko"});
	        student[3] = new Student("Тамркусов", "Иван", "Казантипович", 4, 3, 3.5f,new String[]{"Injeneria","Proektirovanie","analiz"},new String[]{"Ukrmova","Wevchenko"});
	        student[4] = new Student("Кубрицова", "Оля", "Степановна", 5, 2, 4.8f,new String[] {"SQL","Diskretka"},new String[] {"english","fizra"});
	        student[5] = new Student("Навроцький","Max","Vladimiro",6,2,3.5f,new String[] {"SQL","Diskretka"},new String[] {"english","fizra"});
	        student[6] = new Student("Pelypenko","Illia","Petrovich",7,2,1.25f,new String[] {"programirovanie","matematika","oop","chto to ewe"},new String[] {"fillosofia","fizra","english"});
	        student[7] = new Student("Tabunov","Anton","Gazimirovich",8,1,4.9f,new String[] {"programirovanie","matematika","oop","chto to ewe"},new String[] {"fillosofia","fizra","english"});
	        student[8] = new Student("Shalamay","Liza","Olegovna",9,2,4.5f,new String[] {"SQL","Diskretka"},new String[] {"english","fizra"});
	       
	    }
	}

