package com.hasu.zzol.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String nickname;
    private Long totalScore;
    private String regDate;

    public Member(Long id, String nickname, Long totalScore, String regDate) {
        this.id = id;
        this.nickname = nickname;
        this.totalScore = totalScore;
        this.regDate = regDate;
    }
}
