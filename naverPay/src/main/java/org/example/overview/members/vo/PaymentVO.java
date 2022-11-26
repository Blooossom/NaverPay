package org.example.overview.members.vo;

import java.util.Objects;

public class PaymentVO {
    private String oId = "";
    private String orderDate = "";
    private String orderType = "";
    private String amount = "";
    private String get_nPoint = "";
    private String user_nPoint = "";

    public PaymentVO() {
    }

    public PaymentVO(String oId, String orderDate, String orderType, String amount, String get_nPoint, String user_nPoint) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.orderType = orderType;
        this.amount = amount;
        this.get_nPoint = get_nPoint;
        this.user_nPoint = user_nPoint;
    }

    public String getoId() {
        return oId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getAmount() {
        return amount;
    }

    public String getGet_nPoint() {
        return get_nPoint;
    }

    public String getUser_nPoint() {
        return user_nPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentVO paymentVO = (PaymentVO) o;
        return oId.equals(paymentVO.oId) && orderDate.equals(paymentVO.orderDate) && orderType.equals(paymentVO.orderType) && amount.equals(paymentVO.amount) && get_nPoint.equals(paymentVO.get_nPoint) && user_nPoint.equals(paymentVO.user_nPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oId, orderDate, orderType, amount, get_nPoint, user_nPoint);
    }

    @Override
    public String toString() {
        return "PaymentVO{" +
                "oId='" + oId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderType='" + orderType + '\'' +
                ", amount='" + amount + '\'' +
                ", get_nPoint='" + get_nPoint + '\'' +
                ", user_nPoint='" + user_nPoint + '\'' +
                '}';
    }
}
