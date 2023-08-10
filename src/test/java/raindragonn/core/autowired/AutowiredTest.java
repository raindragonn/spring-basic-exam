package raindragonn.core.autowired;

import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import raindragonn.core.member.Member;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void autowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member member) {
            System.out.println("noBean1 = " + member);
        }

        @Autowired
        public void setNoBean2(@Nullable  Member member) {
            System.out.println("noBean2 = " + member);
        }

        @Autowired(required = false)
        public void setNoBean3(Optional<Member> optionalMember) {
            System.out.println("noBean3 = " + optionalMember);
        }
    }
}
