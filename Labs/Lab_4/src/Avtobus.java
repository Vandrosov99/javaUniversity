public class Avtobus extends Car {
    int interval ;
    boolean isDone = false;

    public Avtobus(String iname, String icolor, int ispeed,int inumber,int Iinterval){
        interval = Iinterval;
        name = iname;
        color = icolor;
        speed = ispeed;
        number = inumber;
    }
    public int getInterval(){return interval;}

    public String getInfoaboutBus(){
        return "Information about bus: " + getName() + "\t" +"Nomer marwyta = "+ getNumber() +"\t" +"Interval = "+getInterval() +"\t"+"Skorost ="+getSpeed();
    }
}
