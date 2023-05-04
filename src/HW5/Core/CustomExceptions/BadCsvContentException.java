package HW5.Core.CustomExceptions;

public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Указан недопустимый CSV-файл, невозможно загрузить телефонную книгу");
    }
}
