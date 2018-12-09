public class Admin {
    String name ;
    int id ;
public Admin(){

}
public Admin (String iname,int iid){
    name = iname;
    id = iid;

}
public int getId(){return id;}
public String getName(){return name;}
public String getInfoAboutAdmin(){
    return "Name of Dispetcher :" + getName() + "\t" + "ID :" + getId();
}

}
