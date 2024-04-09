package com.hasu.zzol.domain.member;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDto {
    private Long memberId;
    private String nickname;
    private Long totalScore;
    private String regDate;
}
