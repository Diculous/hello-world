import java.util.HashSet;

public class Client {

    String name;
    HashSet<CreditCard> creditCards;

    public Client() {
    }

    public Client(String name, HashSet<CreditCard> creditCards) {
        this.name = name;
        this.creditCards = creditCards;
    }

    public Client(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCards = new HashSet<>();
        creditCards.add(creditCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(HashSet<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", creditCards=" + creditCards +
                '}';
    }
}