package com.example.demo.member;

import com.example.demo.domain.member.Member;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberCreateRequestDto {
    @Size(min = 3, max = 10)
    @NotEmpty(message = "name 은 필수항목입니다.")
    private String name;
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;
    @NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;
    @Builder
    public MemberCreateRequestDto(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Member toEntity(){
        return Member.builder()
                .name(this.getName())
                .password(this.getPassword())
                .email(this.getEmail())
                .build();
    }
}
