public class ContactManager {
    Contact[] contacts;
    int count;
    public ContactManager(int size) {
        contacts = new Contact[size];
        count = 0;
    }
    public void addContact(Contact contact) {
        if (count < contacts.length) {
            contacts[count] = contact;
            count++;
        } else {
            System.out.println("Contact list is full!");
        }
    }
    public void displayAllContacts() {
        System.out.println("All Contacts:");
        for (int i = 0; i < count; i++) {
            contacts[i].displayContactInfo();
        }
    }
    public int countProfessionalEmails() {
        int professionalCount = 0;
        for (int i = 0; i < count; i++) {
            if (contacts[i].isProfessionalEmail()) {
                professionalCount++;
            }
        }
        return professionalCount;
    }
}


