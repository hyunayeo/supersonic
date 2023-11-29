package com.example.demo.member;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;
    @PostMapping("/api/signup")
    public Long signup(@Valid @RequestBody MemberCreateRequestDto requestDto){
        return memberService.create(requestDto);
    }
}
