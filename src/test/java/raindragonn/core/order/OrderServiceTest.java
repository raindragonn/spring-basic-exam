package raindragonn.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import raindragonn.core.member.Grade;
import raindragonn.core.member.Member;
import raindragonn.core.member.MemberService;
import raindragonn.core.member.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();


    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
