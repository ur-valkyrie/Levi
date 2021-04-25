package oop.example10;

public interface DBInterface {
    // Описываем методы, которые должен будет переопределить класс наследник

    // Метод для добавления пользователя
    void add(User user);
    // Метод на удальнеие пользователя
    boolean delete(User user);
    // Метод для возврата строки со всеми пользователями
    String allUsersString();
    // Метод для очищения БД
    void clear();
}
