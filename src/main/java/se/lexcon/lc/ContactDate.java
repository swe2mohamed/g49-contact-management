package se.lexcon.lc;

import java.util.Arrays;

public class ContactDate {
    // Fields
     private final static int MAX_SIZE = 100;
    // static final field names are declared in uppercase words separated by underscores.

      private static String[] contacts = new String[0]; // ["Name, MobileNumber, Email"]


    public static boolean addContact(final String newContact) // "Name, MobileNumber, Email"
    {
        // step 1: validate the parameter & check the para exists or not
        if (contacts.length < MAX_SIZE && !isDuplicateMobileNumber(newContact)){
            // todo: need completion
            String[] newArray = Arrays.copyOf(contacts,contacts.length + 1);
            newArray[newArray.length - 1] = newContact;
            contacts = newArray;
            return true;
        }
    return false;
    }

    public static boolean isDuplicateMobileNumber (final String newContact){
        // todo: implement the method
        String[] newContactArray = newContact.split(","); //
        String mobileNumber = newContactArray[1];
        for (String contact : contacts) {
            if(contact != null && contact.split(",")[1].equals(mobileNumber)){
                return true;
            }
        }
        return false;
    }

    public static int size(){
        return contacts.length;
    }

    public static String[] getAllContacts(){
        return  Arrays.copyOf(contacts,contacts.length);
    }
}
