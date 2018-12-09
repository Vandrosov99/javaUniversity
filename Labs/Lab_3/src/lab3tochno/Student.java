package lab3tochno;

import java.util.Arrays;
public class Student {
    String surname;
    String name;
    String lastname;
    int number;
    int course;
    float avgmark;
    String [] exams ;
    String [] zachets ;

    public Student(){

    }
    public Student(String surnameI,String nameI,String lastnameI,int numberI,int courseI,float avgmarkI,String[] examsI,String[] zachetsI){
        this.surname = surnameI;
       this. name = nameI;
       this. lastname = lastnameI;
       this. number = numberI;
       this. course = courseI;
       this. avgmark = avgmarkI;
       this.exams = examsI;
       this.zachets = zachetsI;
    }

    
    public String toString(){
        return "Фамилия= " + surname + "\t" + "Имя = " + name + "\t" + "Отчество = " + lastname + "\t" + "Nomer v grupe = " + number + "\t" + "Course = " + course + "\t" + "Sredniy bal = " + avgmark + "\t" + "Exams : " + Arrays.toString(exams) +"\t" + "Zachets: " +Arrays.toString(zachets) ;
    }
    
    // method dostupa k polyam

    public String getSurname(){ return surname;
    }
    public String getName(){ return name;
    }
    public String getLastname(){ return lastname;
    }
    public int getNumber(){return number;
    }
    public int getCourse(){return course;
    }
    public float getAvgMark(){return avgmark;
    }
    public String[] ExArray() {return exams;}
    public String[] ZachArray() {return zachets;}
}