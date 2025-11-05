public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager(5);
        Contact c1 = new Contact("Alice Anderson", "555-1234", "alice@gmail.com");
        Contact c2 = new Contact("Bob Brown", "555-5678", "bob.brown@work.com");
        Contact c3 = new Contact("Charlie Clark", "555-8765", "charlie@yahoo.com");
        Contact c4 = new Contact("David Davis", "555-4321", "david.davis@work.com");
        Contact c5 = new Contact("Eve Evans", "555-9999", "eve@work.com");
        manager.addContact(c1);
        manager.addContact(c2);
        manager.addContact(c3);
        manager.addContact(c4);
        manager.addContact(c5);
        manager.displayAllContacts();

        int professionalCount = manager.countProfessionalEmails();
        System.out.println("Number of professional emails: " + professionalCount);
    }
}
