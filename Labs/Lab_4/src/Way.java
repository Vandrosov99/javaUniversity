public class Way {
    String name;
    boolean isWorking;
    boolean IsNotworking;
    public Way(String Iname ,boolean IisWorking){
        name = Iname;
        isWorking = IisWorking;
    }
    public Way(){

    }
    public  String getName(){return name;}
    public boolean IsWorking(){return isWorking;}
    public String getInfoAboutWay(){
        return "Name of way is :  " + getName() + "\t" ;
    }
}
