package mac.elliot.firstclass.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import mac.elliot.firstclass.domain.CalculatorType;
import mac.elliot.firstclass.domain.Pay;
import mac.elliot.firstclass.domain.PayGroups;
import mac.elliot.firstclass.domain.PayType;
import mac.elliot.firstclass.domain.TableStatus;

public class ImmutableTest {

  @Test
  public void change_field_of_final() {
    // given
    final Map<String, Boolean> collection = new HashMap<>();

    // when
    collection.put("1", true);
    collection.put("2", true);
    collection.put("3", true);
    collection.put("4", true);

    // 자바에서는 final로 불변 객체를 보장할 수 없기 때문에 일급 컬렉션과 래퍼 클래스의 방법으로 이를 해결한다.

    // then
    assertThat(collection.size(), is(4));

  }

  // @Test
  // public void cant_reassign_final() {
  // // given
  // final Map<String, Boolean> collection = new HashMap<>();

  // // when
  // collection = new HashMap<>(); // java의 final은 재할당만 금지한다.

  // assertThat(collection.size(), is(4));
  // }

  @Test
  public void state_logic_out() {
    // given
    List<Pay> pays =
        Arrays.asList(new Pay(PayType.NAVER_PAY, 1000), new Pay(PayType.NAVER_PAY, 1500),
            new Pay(PayType.KAKAO_PAY, 2000), new Pay(PayType.TOSS, 3000L));
    PayGroups payGroups = new PayGroups(pays);

    // when
    Long naverPaySum = payGroups.getNaverPaySum();

    // then
    assertThat(naverPaySum, is(2500L));

  }

  @Test
  public void register_searched_data_to_other_tables() {
    // given
    TableStatus origin = TableStatus.Y;
    // selectTableStatus();

    String table1Value = origin.getTable1Value();
    boolean table2Value = origin.isTable2Value();

    assertThat(origin, is(TableStatus.Y));
    assertThat(table1Value, is("1"));
    assertThat(table2Value, is(true));

  }

  @Test
  public void call_calculate_to_code() throws Exception {
    CalculatorType code = CalculatorType.CALC_A;
    // selectType();
    long originValue = 10000L;
    long result = code.calculate(originValue);

    assertThat(result, is(10000L));
  }



}
