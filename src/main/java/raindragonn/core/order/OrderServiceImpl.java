package raindragonn.core.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import raindragonn.core.annotation.MainDiscountPolicy;
import raindragonn.core.discount.DiscountPolicy;
import raindragonn.core.member.Member;
import raindragonn.core.member.MemberRepository;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;

    @MainDiscountPolicy
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
