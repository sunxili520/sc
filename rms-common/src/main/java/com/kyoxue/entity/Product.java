package com.kyoxue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

/**
 * @author admin
 * @version 1.0
 * @description com.rms.entity
 * @date 2020/11/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private  String name;
    private BigDecimal price;
}
