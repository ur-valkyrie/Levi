package oop.example10;

import java.util.ArrayList;

public class DataBase implements DBInterface {
    // Класс ArrayList представляет собой класс реализующий коллекция по принципу списка
    // Где каждый элемент имеет свой уникальный индекс в списке.
    // А сама коллекция, по-сути, это высокоуровневый аналог обычного массива
    private ArrayList<User> mUsers;

    public DataBase() {
        this.mUsers = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        this.mUsers.add(user);
    }

    @Override
    public boolean delete(User user) {
        if (!mUsers.contains(user)) {
            return false;
        }

        mUsers.remove(user);
        return true;
    }

    @Override
    public String allUsersString() {
        String strResult = "";

        for (int i = 0; i < mUsers.size(); i++) {
            strResult+= "\n" + mUsers.get(i).toString();
        }

        return strResult;
    }

    @Override
    public void clear() {
        mUsers.clear();
    }
}
