package org.example.overview.members.dto;

public class MemberDTO {
    private String uId = "";
    private String uPw = "";
    private String uEmail = "";
    private String uPhoneNumber = "";

    public MemberDTO() {
    }

    public MemberDTO(String uId, String uPw) {
        this.uId = uId;
        this.uPw = uPw;
    }

    public MemberDTO(String uId, String uPw, String uEmail, String uPhoneNumber) {
        this.uId = uId;
        this.uPw = uPw;
        this.uEmail = uEmail;
        this.uPhoneNumber = uPhoneNumber;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPhoneNumber() {
        return uPhoneNumber;
    }

    public void setuPhoneNumber(String uPhoneNumber) {
        this.uPhoneNumber = uPhoneNumber;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "uId='" + uId + '\'' +
                ", uPw='" + uPw + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPhoneNumber='" + uPhoneNumber + '\'' +
                '}';
    }
}
