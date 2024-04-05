package com.hasu.zzol;

import com.hasu.zzol.member.MemberRepository;
import com.hasu.zzol.member.MemberService;
import com.hasu.zzol.member.MemberServiceImpl;
import com.hasu.zzol.member.MemoryMemberRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepositoryImpl();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
