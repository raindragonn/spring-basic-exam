package raindragonn.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// ComponentScan 을 사용하면 @Component 어노테이션이 붙은 클래스를 자동으로 찾아준다.
// 옵션을 통해(파라미터) 스캔에 포함하고자 하는 클래스, 빼고자 하는 클래스를 지정이 가능하다.
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {
}
