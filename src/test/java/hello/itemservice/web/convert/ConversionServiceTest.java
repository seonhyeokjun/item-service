package hello.itemservice.web.convert;

import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConversionServiceTest {
    @Test
    void conversionService() {
        // 등록
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(new StringToIntegerConverter());     // 컨버터 등록
        conversionService.addConverter(new IntegerToStringConverter());
        conversionService.addConverter(new IpPortToStringConverter());
        conversionService.addConverter(new StringToIpPortConverter());

        // 사용
        assertThat(conversionService.convert("10", Integer.class)).isEqualTo(10);
        assertThat(conversionService.convert(10, String.class)).isEqualTo("10");

        assertThat(conversionService.convert("127.0.01:8080", IpPort.class)).isEqualTo(new IpPort("127.0.01", 8080));
        assertThat(conversionService.convert(new IpPort("127.0.01", 8080), String.class)).isEqualTo("127.0.01:8080");
    }
}
