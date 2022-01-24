package mac.elliot.firstclass.domain;

public class Pay {

  private final PayType payType;
  private final long amount;

  public Pay(PayType payType, long amount) {
    this.payType = payType;
    this.amount = amount;
  }

  public long getAmount() {
    return this.amount;
  }

  public PayType getPayType() {
    return this.payType;
  }


}
