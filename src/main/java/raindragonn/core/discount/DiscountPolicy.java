package raindragonn.core.discount;

import raindragonn.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 금액
     */
    int discount(Member member, int price);

}
