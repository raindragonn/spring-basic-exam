package raindragonn.core;

import raindragonn.core.member.Grade;
import raindragonn.core.member.Member;
import raindragonn.core.member.MemberService;
import raindragonn.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("fnd member = " + findMember.getName());
    }
}
