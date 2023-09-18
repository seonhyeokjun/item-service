package hello.itemservice.web.convert;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {
    private String ip;
    private Integer port;

    public IpPort(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }
}
