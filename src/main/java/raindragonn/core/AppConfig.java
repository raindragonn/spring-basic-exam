package raindragonn.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import raindragonn.core.discount.DiscountPolicy;
import raindragonn.core.discount.RateDiscountPolicy;
import raindragonn.core.member.MemberRepository;
import raindragonn.core.member.MemberService;
import raindragonn.core.member.MemberServiceImpl;
import raindragonn.core.member.MemoryMemberRepository;
import raindragonn.core.order.OrderService;
import raindragonn.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

}
