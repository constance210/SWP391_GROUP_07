package com.admin.admin.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@Data
@NoArgsConstructor
public class CategoryChartReponse {
    private AtomicInteger longT;
    private AtomicInteger shortT;

    public CategoryChartReponse(AtomicInteger longT , AtomicInteger shortT) {
        this.longT = longT;
        this.shortT = shortT;
    }
}
