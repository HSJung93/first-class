package mac.elliot.firstclass.service;

import java.util.Arrays;
import java.util.List;
import mac.elliot.firstclass.domain.LottoTicket;

public class LottoService {
  LottoTicket lottoTicket = new LottoTicket(createNonDuplilcateNumbers());

  private List<Long> createNonDuplilcateNumbers() {
    return Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L);
  }


}
