package com.hasu.zzol;

import com.hasu.zzol.domain.member.MemberRepository;
import com.hasu.zzol.domain.member.MemberService;
import com.hasu.zzol.domain.member.MemberServiceImpl;
import com.hasu.zzol.domain.member.MemoryMemberRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepositoryImpl();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
