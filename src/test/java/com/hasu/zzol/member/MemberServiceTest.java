package com.hasu.zzol.member;

import com.hasu.zzol.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();

    @Test
    void sighUp() {
        Member member = new Member(1L, "1번 유저", 100L, "2024-16-38");
        memberService.signUp(member);
        Member findMember = memberService.findMember(1L);
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
