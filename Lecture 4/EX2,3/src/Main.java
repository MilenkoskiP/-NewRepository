//import javax.imageio.plugins.bmp.BMPImageWriteParam;
//
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//void main(){
//    Car car1 = new Car("Ferari",4,"Disel","red");
//    Car car2 = new Car("bmw",5,"Petrol","Blue");
//
//    car2.setColor("black");
//    car2.setNoSeats(5);
//
//    car1.printCar();
//    car2.printCar();
//}
void main(){
    Car[] array = new Car[5];
    array[0] = new Car("Jeep",6,"Disel","Grey");
    array[1] = new Car("Haval",5, "Petrol", "Black");
    array[2] = new Car("Mercedes",4,"Disel","Black");
    array[3] = new Car("BMW",4,"Disel","Rubby Black");
    array[4] = new Car("Lamborgini",2,"Petrol","Red");
    for(Car car : array) {
        car.printCar();
    }
    Car result = maxSeats(array);
    System.out.println("The car with most seats is:");
    result.printCar();



}
public Car maxSeats(Car[] cars){
    Car max = cars[0];
    for(Car car:cars) {
        if (car.getNoSeats() > max.getNoSeats()) {
            max = car;
        }
    }
    return max;
}