package com.metacho.ordermanagementsproductsservice.core.domain.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductPrice {
    private Double originalPrice;
    private Double finalPrice;
    private boolean isDiscount;
    private Double discountPercentage;
    private String currency;
}
