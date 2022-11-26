package org.example.overview.members.vo;

import java.util.Objects;

public class ProductVO {

    private String oId = "";
    private String uId = "";
    private String orderDate = "";
    private String productName = "";
    private String status = "";
    private String amount = "";
    private String company;
    private String companyTel = "";

    public ProductVO() {
    }

    public ProductVO(String oId, String uId, String orderDate, String productName, String status, String amount, String company, String companyTel) {
        this.oId = oId;
        this.uId = uId;
        this.orderDate = orderDate;
        this.productName = productName;
        this.status = status;
        this.amount = amount;
        this.company = company;
        this.companyTel = companyTel;
    }

    public ProductVO(String oId, String orderDate, String productName, String status, String amount, String company, String companyTel) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.productName = productName;
        this.status = status;
        this.amount = amount;
        this.company = company;
        this.companyTel = companyTel;
    }

    public String getoId() {
        return oId;
    }

    public String getuId() {
        return uId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getStatus() {
        return status;
    }

    public String getAmount() {
        return amount;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductVO productVO = (ProductVO) o;
        return oId.equals(productVO.oId) && uId.equals(productVO.uId) && orderDate.equals(productVO.orderDate) && productName.equals(productVO.productName) && status.equals(productVO.status) && amount.equals(productVO.amount) && company.equals(productVO.company) && companyTel.equals(productVO.companyTel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oId, uId, orderDate, productName, status, amount, company, companyTel);
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "oId='" + oId + '\'' +
                ", uId='" + uId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                ", amount='" + amount + '\'' +
                ", company='" + company + '\'' +
                ", companyTel='" + companyTel + '\'' +
                '}';
    }
}
