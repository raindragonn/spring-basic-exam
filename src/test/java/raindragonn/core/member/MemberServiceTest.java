package raindragonn.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given - 이런게 주어짐
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when - 이럴 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then - 이렇게 된다. ( 검증 )
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
