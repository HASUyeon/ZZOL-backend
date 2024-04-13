package com.hasu.zzol.domain.member;

import java.util.Optional;

public interface MemberService {
    void signUp(MemberDto member);

    Optional<Member> findMember(Long memberId);
    void putMember(Long memberId, MemberDto member);
    void deleteMember(Long memberId);
}
