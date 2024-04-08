package com.hasu.zzol.singleton;

import com.hasu.zzol.AppConfig;
import com.hasu.zzol.domain.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {
    @Test
    @DisplayName("순수 DI 컨테이너")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();
        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService 1 = "+ memberService1);
        System.out.println("memberService 2 = " + memberService2);
        Assertions.assertThat(memberService1).isNotSameAs(memberService2);

    }

    @Test
    @DisplayName("스프링 컨테이너를 써용")
    void springContainerTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        System.out.println("memberService = " + memberService1);
        System.out.println("memberService = " + memberService2);
        Assertions.assertThat(memberService1).isSameAs(memberService2);
    }
}
