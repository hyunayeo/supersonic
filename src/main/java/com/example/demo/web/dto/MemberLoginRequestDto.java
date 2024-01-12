package com.example.demo.web.dto;

import com.example.demo.domain.member.Member;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberLoginRequestDto {
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;
    @NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;

    @Builder
    public MemberLoginRequestDto(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public Member toEntity() {
        return Member.builder()
                .password(this.getPassword())
                .email(this.getEmail())
                .build();
    }
}

