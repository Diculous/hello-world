
public class Account {

    Integer cardNumber;
    Boolean isBlocked = false;

    public Account(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber=" + cardNumber +
                '}';
    }

    void block () {
    }

    void payment () {
    }

    void fill () {
    }
}
