package com.hasu.zzol;

import com.hasu.zzol.member.MemberService;
import com.hasu.zzol.member.MemberServiceImpl;
import com.hasu.zzol.member.MemoryMemberRepositoryImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepositoryImpl());
    }
}
