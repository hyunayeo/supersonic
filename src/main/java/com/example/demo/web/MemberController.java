package com.example.demo.web;

import com.example.demo.web.dto.MemberCreateRequestDto;
import com.example.demo.service.MemberService;
import jakarta.validation.Valid;
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
