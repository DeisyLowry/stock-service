package com.ttrc.stockservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StockDto {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;


    private String symbol;
    private String stockName;
    private String description;
    private String notes;

}
