package com.admin.admin.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "timeshare")
public class Timeshare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userid;
    private Long category_id;
    private String name;
    private String description;
    private long amount;
    private float price;
    private String product_image;
    private Date startDate;
    private Date endDate;

    public Timeshare(String userid, Long category_id, String name, String description, long amount, float price, String product_image, Date startDate, Date endDate) {
        this.userid = userid;
        this.category_id = category_id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.product_image = product_image;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
