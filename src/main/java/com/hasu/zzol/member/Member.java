package com.hasu.zzol.member;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Long totalScore) {
        this.totalScore = totalScore;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
