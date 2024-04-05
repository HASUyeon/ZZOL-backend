package com.hasu.zzol.member;

public interface MemberService {
    void signUp(Member member);
    Member findMember(Long memberId);
}
