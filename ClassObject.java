public class ClassObject{
    //creating class
    public static class car{
        String brand;
        int speed;

        public void startengine(){
            System.out.println("engine starting");
        }
    }
    public static void main(String args[]){
    //creating Object
    car mycar = new car();
    mycar.brand = "tesla";
    mycar.speed = 120;

    mycar.startengine();
    }
}
