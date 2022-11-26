package org.example.overview.members.entity;

public class Member {
    private String uId = "";
    private String uPw = "";
    private String uEmail = "";
    private String uPhoneNumber = "";

    public Member(String uId, String uPw, String uEmail, String uPhoneNumber) {
        this.uId = uId;
        this.uPw = uPw;
        this.uEmail = uEmail;
        this.uPhoneNumber = uPhoneNumber;
    }

    public Member(String uId, String uPw) {
        this.uId = uId;
        this.uPw = uPw;
    }

    public Member() {
    }

    public String getuId() {
        return uId;
    }

    public String getuPw() {
        return uPw;
    }

    public String getuEmail() {
        return uEmail;
    }

    public String getuPhoneNumber() {
        return uPhoneNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "uId='" + uId + '\'' +
                ", uPw='" + uPw + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPhoneNumber='" + uPhoneNumber + '\'' +
                '}';
    }
}
