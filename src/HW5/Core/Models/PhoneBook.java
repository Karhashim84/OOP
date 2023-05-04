package HW5.Core.Models;

import java.util.Map;

public interface PhoneBook {
    boolean create(Contact contact);

    Contact read(String name);

    Map<String,Contact> readAll();

    boolean modify(Contact contact);

    boolean delete(String name);

    Contact search(String name);
}
