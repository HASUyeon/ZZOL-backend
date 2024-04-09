package com.hasu.zzol.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    @Column
    private String nickname;
    @Column(name = "total_score")
    private Long totalScore;
    @Column(name = "reg_date")
    private String regDate;


    public void updateMember(String nickname, Long totalScore, String regDate) {
        this.nickname = nickname;
        this.totalScore = totalScore;
        this.regDate = regDate;
    }

}
