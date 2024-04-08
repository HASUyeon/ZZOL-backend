package com.hasu.zzol.domain.member;

public interface MemberService {
    void signUp(Member member);
    Member findMember(Long memberId);
}
