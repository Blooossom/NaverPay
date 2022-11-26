package org.example.overview.members.entity;

public class Product {
 private String oId = "";
 private String uId = "";
 private String orderDate = "";
 private String productName = "";
 private String amount = "";
 private String status = "";
 private String company;
 private String companyTel = "";

    public Product() {
    }

    public Product(String oId, String uId, String orderDate, String productName, String amount, String status, String company, String companyTel) {
        this.oId = oId;
        this.uId = uId;
        this.orderDate = orderDate;
        this.productName = productName;
        this.amount = amount;
        this.status = status;
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

    public String getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "oId='" + oId + '\'' +
                ", uId='" + uId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", productName='" + productName + '\'' +
                ", amount='" + amount + '\'' +
                ", status='" + status + '\'' +
                ", company='" + company + '\'' +
                ", companyTel='" + companyTel + '\'' +
                '}';
    }
}
