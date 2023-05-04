package HW5.UI;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    static final String welcomeMsg = "Добро пожаловать в телефонный справочник!\n";
    static final String byeMsg = "\nДосвидания!";

    static final String chooseActionsMsg = "Выберете один из следующих пунктов:";
    static final String invalidCmdMsg = "Неверная команда, попробуйте еще раз";

    static final String getCommandMsg = "Введите команду: ";
    static final String getNameMsg = "Введите имя: ";
    static final String getEmailMsg = "Введите email: ";
    static final String getPhoneNumberMsg = "Введите номер телефона: ";
    static final String invalidEmailMsg = "Email введен неверно";
    static final String invalidPhoneNumberMsg = "Неверно введен номер телефона";
    static final String successAddMsg = "Контакт успешно добавлен в телефонную книгу";
    static final String successEditMsg = "Контак успешно отредактирован в телефонной книге";
    static final String successRemovedMsg = "Контакт успешно перемещен в телефонной книге";
    static final String ContactFoundMsg = "Следующий контакт найден";
    static final String noContactFoundMsg = "Контакты не найдены";

    static final String showAllContactsMsg = "Следующие контакты найдены в телефонной книге:";
    static final String editContactMsg = "Для редактирования контакта заполните следующие поля:";
    static final String askAddContactMsg = "Контакты с отредактированным именем не найдены. Добавить новый (да/нет): ";

    static final String getSearchStrMsg = "Введите имя для поиска контакта: ";
    static final String notDigitMsg = "Это не цифра, попробуйте еще раз!";
    static final String removeContactMsg = "Следующий контакт был удален:";
    static final String askRemoveContactMsg = "Вы уверены? (да/нет): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новый контакт"),
            entry(2, "Изменить существующий контакт в коллекции"),
            entry(3, "Переместить контакт в коллекции"),
            entry(4, "Показать все контакты"),
            entry(5, "Показать подробную информацию о контакте"),
            entry(0, "Выйти из программы"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "Вы выбрали добавление нового контакта."),
            entry(2, "Вы выбрали изменить контакт."),
            entry(3, "Вы выбрали переместить контакт."),
            entry(4, "Вы выбрали показать всю информацию о контактах:"),
            entry(5, "Вы выбрали показать подробную информацию о контакте."),
            entry(0, "Досвидания!"));
}
