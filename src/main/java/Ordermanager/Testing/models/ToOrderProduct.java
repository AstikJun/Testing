package Ordermanager.Testing.models;

import Ordermanager.Testing.enums.MethodsOfPay;
import Ordermanager.Testing.enums.OrderStatuses;

public class ToOrderProduct {
    private Integer productId;
    private Integer amountOfProducts;
    private MethodsOfPay methodsOfPay;



    public MethodsOfPay getMethodsOfPay() {
        return methodsOfPay;
    }

    public void setMethodsOfPay(MethodsOfPay methodsOfPay) {
        this.methodsOfPay = methodsOfPay;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(Integer amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }
}
