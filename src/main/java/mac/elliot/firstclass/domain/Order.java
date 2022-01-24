package mac.elliot.firstclass.domain;

public class Order {
  private final long amount;

  public Order(long amount) {
    this.amount = amount;
  }

  public long getAmount() {
    return this.amount;
  }
}
