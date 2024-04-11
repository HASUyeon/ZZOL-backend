package com.hasu.zzol.domain.member;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void signUp(MemberDto memberDto) {
        Member member = new Member();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(member);
        System.out.println(memberDto);
        member.updateMember(memberDto.getNickname(), memberDto.getTotalScore(), LocalDateTime.now().format(format));
        System.out.println(member);
        this.memberRepository.save(member);
    }

    @Override
    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
