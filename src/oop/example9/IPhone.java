package oop.example9;

public class IPhone {
    String model;
    double cost;

    public IPhone(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        IPhone secondPhone = (IPhone) obj;

        if (this.model.equals(secondPhone.model) &&
                this.cost == secondPhone.cost)
            return true;

        return false;
    }

    @Override
    public String toString() {
        String res = "Info about this IPhone: " +
                "\nCost: " + this.cost +
                "\nModel: " + this.model;
        return res;
    }
}
