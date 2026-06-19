package innerclasses;

public class Test {
    public static void main(String[] args) {
        
        //member inner class 
        Car c = new Car("TATA");

        Car.Engine engine = c.new Engine();

        engine.start();
        engine.stop();



        Computer cn=new Computer("hp", "12", "mac");
   cn.getOs().displayInfo();
    //static nested class 
Computer.USB usb=new Computer.USB("tYPE C");

//ananomous  
ShoppingCart sp=new ShoppingCart(150);
//here we are defining the object and creating it as well 

//when to use this 
//when we want to creATE THE INTEFACE WITHOUT ITS IMPLEMENTATION CLASS OR ITS CLASS WE ARE GOING TO CREATE THIS ANANOMOUS CLASS 
//AS WE CANNOT CREATE THE OBJECT OF THE INTERFACE SO WE USE ANANOMOUS CLASS 
sp.processPayment(new Payment(){
    @Override
    public void pay(double amount){
        System.out.println("paid");
    }
});



CreditCard card=new CreditCard("1234");
sp.processPayment(card);

//LOCAL INNER CLASSES 
Hotel hotel=new Hotel("sunshine hotel",120, 100);
hotel.reserveRoom("radha",7);
hotel.reserveRoom("nya" ,4);

}

    public Test() {
    }




}
