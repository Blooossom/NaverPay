package org.example.overview.members.dto;

public class PaymentDTO {
    private String oId = "";
    private String orderDate = "";
    private String orderType = "";
    private String amount = "";
    private String get_nPoint = "";
    private String user_nPoint = "";

    public PaymentDTO() {
    }

    public PaymentDTO(String oId, String orderDate, String orderType, String amount, String get_nPoint, String user_nPoint) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.orderType = orderType;
        this.amount = amount;
        this.get_nPoint = get_nPoint;
        this.user_nPoint = user_nPoint;
    }

    public PaymentDTO(String oId, String orderDate, String orderType, String amount) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.orderType = orderType;
        this.amount = amount;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGet_nPoint() {
        return get_nPoint;
    }

    public void setGet_nPoint(String get_nPoint) {
        this.get_nPoint = get_nPoint;
    }

    public String getUser_nPoint() {
        return user_nPoint;
    }

    public void setUser_nPoint(String user_nPoint) {
        this.user_nPoint = user_nPoint;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "oId='" + oId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderType='" + orderType + '\'' +
                ", amount='" + amount + '\'' +
                ", get_nPoint='" + get_nPoint + '\'' +
                ", user_nPoint='" + user_nPoint + '\'' +
                '}';
    }
}
