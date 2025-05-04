package com.metacho.ordermanagementsproductsservice.core.domain.product;

import com.metacho.ordermanagementsproductsservice.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Dictionary;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "products")
public class Product extends BaseEntity {

    private String name;
    private String description;
    private ProductPrice priceInfo;
    private String sku;
    private String categoryCode;
    private boolean stock;
    private Integer quantityAvailable;
    private Dictionary<String, String> attributes;

}
