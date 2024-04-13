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
        member.updateMember(memberDto.getNickname(), 0L, LocalDateTime.now().format(format));
        this.memberRepository.save(member);
    }

    @Override
    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


    @Override
    public void putMember(Long memberId, MemberDto memberDto) {
        memberRepository.findById(memberId).map(member -> {
            String nickname = Optional.ofNullable(memberDto.getNickname()).orElse(member.getNickname());
            Long totalScore =   Optional.ofNullable(memberDto.getTotalScore()).orElse(member.getTotalScore());
            member.updateMember(nickname, totalScore, member.getRegDate());
            return memberRepository.save(member);
        });
    }
}
