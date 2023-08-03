package raindragonn.core;

import raindragonn.core.member.Grade;
import raindragonn.core.member.Member;
import raindragonn.core.member.MemberService;
import raindragonn.core.member.MemberServiceImpl;
import raindragonn.core.order.Order;
import raindragonn.core.order.OrderService;
import raindragonn.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }
}
