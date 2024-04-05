package com.hasu.zzol.member;

import com.hasu.zzol.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = ac.getBean("memberService", MemberService.class);
    @Test
    @DisplayName("회원가입 테스트")
    void sighUp() {
        Member member = new Member(1L, "1번 유저", 100L, "2024-16-38");
        memberService.signUp(member);
        Member findMember = memberService.findMember(1L);
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
