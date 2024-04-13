package com.hasu.zzol.domain.member;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/member")
@RestController
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping()
    public void signUp(@RequestBody MemberDto memberDto) {
        System.out.println(memberDto);
        memberService.signUp(memberDto);
    }

    @GetMapping("/list")
    public List<Member> getAll() {
        return memberService.findAll();
    }

    @GetMapping("/{memberId}")
    public Optional<Member> getMember(@PathVariable Long memberId) {
        return memberService.findMember(memberId);
    }

    @PutMapping("/{memberId}")
    public void putMember(@PathVariable Long memberId, @RequestBody MemberDto memberDto) {
        memberService.putMember(memberId, memberDto);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId){
        memberService.deleteMember(memberId);
    }
}
