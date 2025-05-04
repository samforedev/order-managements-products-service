package com.metacho.ordermanagementsproductsservice.core.domain.category;

import com.metacho.ordermanagementsproductsservice.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "category_products")
public class Category extends BaseEntity {

    private String name;
    private String description;
    private String code;

}
