
public class Car {
    int speed;
    String name;
    int number;
    String color;

    public Car(){

    }

    public Car(String iname,String icolor,int ispeed, int inumber){

        speed = ispeed;
        name = iname;
        number=inumber;
        color = icolor;

    }
    public int getSpeed()
    {
        return speed;
    }
    public String getName(){return name;}
    public int getNumber(){return number;}
    public String getColor(){return color;}
}
