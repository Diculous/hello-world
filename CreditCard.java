
public class CreditCard {

    Account account;

    public CreditCard(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account=" + account +
                '}';
    }
}
