package HW5.Core.DB;

import HW5.Core.Models.PhoneBook;

public interface Importer {
    PhoneBook load();
}