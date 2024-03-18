package se.lexcon.lc;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(ContactDate.size());
        boolean isAddSimonContact =  ContactDate.addContact("Simon,987654321,simon@mail.com");
        System.out.println("isAddSimonContact = " + isAddSimonContact);
        System.out.println(ContactDate.size());
        System.out.println(Arrays.toString(ContactDate.getAllContacts()));
        boolean isAddSimonContact2 =  ContactDate.addContact("Simon,987654321,simon@mail.com");
        System.out.println("isAddSimonContact = " + isAddSimonContact2);



    }
}
