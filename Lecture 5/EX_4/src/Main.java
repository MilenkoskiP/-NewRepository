void main(){
    Car car1 = new Car("Model1", "black", 4);
    Car car2 = new Car("Model1", "black", 4);
    Car car3= car1;
    Car car4 = new Car("Model2", "red", 2);

    System.out.println("car1 == car2" + (car1==car2));
    System.out.println("car1 == car3" + (car1== car3));
    System.out.println("car1 == car4" + (car2== car4));

    System.out.println("ToString Call");
    System.out.println("Car1;" +car1);
}