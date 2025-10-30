void main() {
    Utility[] utilities = new Utility[6];
    utilities[0] = new Utility("Electricity", 60.3);
    utilities[1] = new Utility("Heating",40.3 );
    utilities[2] = new Utility("Water", 70.5);
    utilities[3] = new Utility("Garbige", 20.3);
    utilities[4] = new Utility("Parking", 15.7);
    utilities[5] = new Utility("WiFi", 0.3);
    double total=0;
    for(Utility elem : utilities) {
        total += elem.getPrice();
    }
    System.out.println("The total cost is " + total);
    double average = total / utilities.length;
    System.out.println("The average cost is " + average);
    Utility max = utilities[0];
    for(Utility elem : utilities) {
        if(elem.getPrice() > max.getPrice()) {
            max = elem;
        }
    }
    System.out.println("The most expensive utility is " + max.getName());
}
























