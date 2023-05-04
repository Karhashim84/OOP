package HW5.Core.MVP;

import java.util.Collection;
import HW5.Core.Models.Contact;

public interface View {

    void welcome();

    void bye();

    void showMainMenu();

    int getCmd();

    void invalidCmd();

    void showChosenCmd(int cmd);

    String[] addContactMenu();

    String[] editContactMenu(Collection<Contact> contacts);

    String removeContactMenu(Collection<Contact> contacts);

    void showContact(Contact contact);

    void showAllContacts(Collection<Contact> contacts);

    void invalidEmail();

    void invalidPhoneNumber();

    void noContactFound();

    void successAddContact();

    void successEditContact();

    void successRemovedContact();

    boolean askAddNewContact();

    String getSearchString();

    boolean removeContactAccept(Contact contact);
}