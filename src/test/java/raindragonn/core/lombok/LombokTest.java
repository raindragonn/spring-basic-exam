package raindragonn.core.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

public class LombokTest {

    @Test
    void lombok() {
        HelloLombok helloLombok = new HelloLombok();

        helloLombok.setAge(20);
        helloLombok.setName("와우~ 자동 생성");

        System.out.println("name = " + helloLombok);
    }
}

@Getter
@Setter
@ToString
class HelloLombok {
    private String name;
    private int age;
}
