package oop.example10;

public class User {
    // В Java, если поле класса является private, то неоходимо приписать к нему приставку m-
    // Так как все поля класса объявлены как private, то для доступа к ним, определим методы доступа
    private int mId;
    private String mLogin;
    private String mPassword;
    private String mFullName;

    public User(int mId, String mLogin, String mPassword, String mFullName) {
        this.mId = mId;
        this.mLogin = mLogin;
        this.mPassword = mPassword;
        this.mFullName = mFullName;
    }

    @Override
    public String toString() {
        String res;

        res = "ID: " + this.mId +
                "\nLogin: " + this.mLogin +
                "\nPassword: " + this.mPassword +
                "\nFullName: " + this.mFullName;

        return res;
    }

    public int getId() {
        return mId;
    }

    public String getLogin() {
        return mLogin;
    }

    public String getPassword() {
        return mPassword;
    }


    public String getFullName() {
        return mFullName;
    }
}
