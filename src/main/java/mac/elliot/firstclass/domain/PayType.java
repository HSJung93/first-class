package mac.elliot.firstclass.domain;

public enum PayType {
  ACCOUNT_TRANSFER("계좌이체"), REMITTANCE("무통장입금"), ON_SITE_PAYMENT("현장결제"), TOSS("토스"), PAYCO(
      "페이코"), CARD("신용카드"), NAVER_PAY(
          "네이버페이"), KAKAO_PAY("카카오페이"), BAEMIN_PAY("배민페이"), POINT("포인트"), COUPON("쿠폰"), EMPTY("없음");

  private String title;

  PayType(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public static boolean isNaverPay(PayType payType) {
    return NAVER_PAY == payType;
  }

  public static boolean isKakaoPay(PayType payType) {
    return KAKAO_PAY == payType;
  }
}
