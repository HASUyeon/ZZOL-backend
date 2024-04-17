package com.hasu.zzol.domain.member;

import com.hasu.zzol.global.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/member")
@RestController
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping()
    public ResponseEntity<Response> signUp(@RequestBody MemberDto memberDto) {
        Response response = new Response();
        memberService.signUp(memberDto);
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Response> getAll() {
        Response response = new Response();
        List<Member> memberList = memberService.findAll();
        response.setContent(memberList);
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Response> getMember(@PathVariable Long memberId) {
        Response response = new Response();
        Optional<Member> member = memberService.findMember(memberId);
        response.setContent(member);
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }

    @PutMapping("/{memberId}")
    public ResponseEntity<Response>  putMember(@PathVariable Long memberId, @RequestBody MemberDto memberDto) {
        Response response = new Response();
        memberService.putMember(memberId, memberDto);
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Response>  deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
        return new ResponseEntity<>(new Response(), null, HttpStatus.OK);
    }
}
