package org.example.overview.members.vo;

import java.util.Objects;

public class DetailVO {
    ProductVO productVO;
    PaymentVO paymentVO;

    public DetailVO(ProductVO productVO, PaymentVO paymentVO) {
        this.productVO = productVO;
        this.paymentVO = paymentVO;
    }

    public ProductVO getProductVO() {
        return productVO;
    }

    public PaymentVO getPaymentVO() {
        return paymentVO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailVO detailVO = (DetailVO) o;
        return productVO.equals(detailVO.productVO) && paymentVO.equals(detailVO.paymentVO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productVO, paymentVO);
    }

    @Override
    public String toString() {
        return "DetailVO{" +
                "productVO=" + productVO +
                ", paymentVO=" + paymentVO +
                '}';
    }
}
