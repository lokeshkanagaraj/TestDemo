package com.data;

import java.util.Map;
import java.util.Objects;

import static com.data.Products.ColumnName.*;

public class Products {

    private final String productName;

    private final String unitPrice;

    private final String stockStatus;

    public Products(Map<String, String> data) {
        this.productName = data.get(PRODUCT_NAME);
        this.unitPrice = data.get(UNIT_PRICE);
        this.stockStatus = data.get(STOCK_STATUS);
    }

    public String productName() {
        return productName;
    }

    public String unitPrice() {
        return unitPrice;
    }

    public String stockStatus() {
        return stockStatus;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", stockStatus='" + stockStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productName, products.productName) && Objects.equals(unitPrice, products.unitPrice) && Objects.equals(stockStatus, products.stockStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, stockStatus);
    }

    public static class ColumnName {
        public static final String
                PRODUCT_NAME = "Product name",
                UNIT_PRICE = "Unit price",
                STOCK_STATUS = "Stock status";
    }
}