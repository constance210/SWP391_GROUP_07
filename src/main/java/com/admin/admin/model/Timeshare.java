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
    private String timeshare_image;
    private Date startDate;
    private Date endDate;
    private Boolean is_check;

    public Timeshare(String userid, Long category_id, String name, String description, long amount, float price, String timeshare_image, Date startDate, Date endDate, Boolean is_check) {
        this.userid = userid;
        this.category_id = category_id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.timeshare_image = timeshare_image;
        this.startDate = startDate;
        this.endDate = endDate;
        this.is_check = is_check;
    }
}
