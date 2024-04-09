package com.hasu.zzol.domain.member;

import org.springframework.stereotype.Service;

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
        System.out.println(member);
        System.out.println(memberDto);
        member.updateMember(memberDto.getNickname(), memberDto.getTotalScore(), memberDto.getRegDate());
        System.out.println(member);
        this.memberRepository.save(member);
    }

    @Override
    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
