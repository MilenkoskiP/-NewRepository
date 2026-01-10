class Main{
    public static void main(String[] args) {
        King king = new King("Arthur", 50);
        Queen queen = new Queen("Elizabeth", 48);
        Prince prince = new Prince("William", 25);

        System.out.println("King's Details: ");
        king.displayInfo();
        System.out.println();
        System.out.println("Queen's Details: ");
        queen.displayInfo();
        System.out.println();
        System.out.println("Princes's Details: ");
        prince.displayInfo();
    }
}