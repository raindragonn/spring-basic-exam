package raindragonn.core;

import raindragonn.core.discount.DiscountPolicy;
import raindragonn.core.discount.RateDiscountPolicy;
import raindragonn.core.member.MemberRepository;
import raindragonn.core.member.MemberService;
import raindragonn.core.member.MemberServiceImpl;
import raindragonn.core.member.MemoryMemberRepository;
import raindragonn.core.order.OrderService;
import raindragonn.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

}
