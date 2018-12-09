public class Engine {
    Way[] ways = new Way[2];
    Avtobus[] arrbuss = new Avtobus[2];
    Admin[] admins = new Admin[2];
    public void fill() {
        ways[0] = new Way("Trowina - Obolon", true);
        arrbuss[0] = new Avtobus("Avtubus", "siniy", 45, 1, 15);
        admins[0] = new Admin("vasya", 223);
        ways[1] = new Way("VDNX - Obolon",false);
        arrbuss[1] = new Avtobus("Avtobus","jeltiy",45,1,20);
        admins[1] = new Admin("Vasya",223);

    }
    public void ShowWays()  {

        for (int i = 0; i < 2; i++) {
            System.out.println("Information About Your way {" + (i+1) + "}:");
            System.out.println(ways[i].getInfoAboutWay());
           System.out.println(arrbuss[i].getInfoaboutBus());
            System.out.println(admins[i].getInfoAboutAdmin());
        }
    }
    public void CheckWaysandCars() {
        for (int i = 0; i < 2; i++) {
            if (ways[i].IsWorking() == true && arrbuss[i].getSpeed() >=45 && arrbuss[i].interval>=15 ) {
                System.out.println("Way number :" +(i+1)+" is working!");
            }
            else {
                System.out.println("Way number: "+(i+1) +"is not working need one more CAR!");
            }
        }

    }
    public void GetINter() {
    	int count = 0;
    	int result = 0;
    	for (int i = 0;i<2;i++) {
    		count=arrbuss[i].interval +count;
    		result=count + result;
    	}
    	System.out.println(result);
    }
    public void Standarts(){
    	
        System.out.println("Avtobus need: Speed=45 or more \n interval=15 ");
        System.out.println("Troleybuss need: Speed=30 or more \n interval=8 ");
        System.out.println("Tramvay need: Speed=20 or more \n interval=5 ");
    }
 //   public Admin addAdmin(String name,int Id){return new Admin(name,Id);}
 //   public void addCar(){}
   // public void addWay(){}
    }

