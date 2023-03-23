package hello.itemservice.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId; // 로그인 아이디

    @NotEmpty
    private String name; // 회원 이름

    @NotEmpty
    private String password; // 비밀번호
}
