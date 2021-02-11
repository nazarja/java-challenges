import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();
    private String myNumber;

    public MobilePhone(String number) {
        this.myNumber = number;
    }

    public boolean addNewContact(Contact newContact) {
        int index = this.findContact(newContact);
        if (index == -1) {
            this.myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
       int index = this.findContact(oldContact);
        if (index != -1) {
            this.myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = this.findContact(contact);
        if (index != -1) {
            this.myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contact) {
        int i = 0;
        int index = -1;
        for (Contact c: this.myContacts) {
            if (c.getName().equals(contact) || c.getPhoneNumber().equals(contact)) {
                index = i;
            }
            i++;
        }
        return index;
    }

    public Contact queryContact(String contact) {
        int query = this.findContact(contact);
        return query != -1 ? this.myContacts.get(query) : null;
    }

    public void printmyContacts() {
        for (Contact contact : this.myContacts) {
            System.out.printf("%s -> %s /n", contact.getName(), contact.getPhoneNumber());
        }
    }
 }
