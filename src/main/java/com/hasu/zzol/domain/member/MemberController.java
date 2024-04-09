package com.hasu.zzol.domain.member;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member")
    public void signUp(@RequestBody MemberDto memberDto) {
        System.out.println(memberDto);
        memberService.signUp(memberDto);
    }

    @GetMapping("/member/{memberId}")
    public Optional<Member> getMember(@PathVariable Long memberId) {
        return memberService.findMember(memberId);
    }
}
