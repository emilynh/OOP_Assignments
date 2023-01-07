package exercise_1_6;

public class Account {
    private String id, name;
    private int balance;

    public Account() {
        balance = 0;
    }
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
           balance -= amount;
           return balance;
        } else {
            System.out.println("amount exceeded");
            return balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            // transfer amount to the given Account
            balance -= amount;
//            another.balance += amount;
            another.credit(amount);
        } else {
            System.out.println("amount exceeded");
            // return balance;
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

