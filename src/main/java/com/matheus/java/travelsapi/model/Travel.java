package com.matheus.java.travelsapi.model;

import com.matheus.java.travelsapi.enumeration.TravelTypeEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Travel {

    private Integer id;
    private String orderNumber;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private BigDecimal amount;

    private TravelTypeEnum type;



    public Travel(Integer id, String orderNumber, LocalDateTime startDate, LocalDateTime endDate, BigDecimal amount, TravelTypeEnum type) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.type = type;

    }

    public Travel(TravelTypeEnum type){
        this.type = type;
    }

    public Travel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Travel)) return false;
        Travel travel = (Travel) o;
        return Objects.equals(id, travel.id) && Objects.equals(orderNumber, travel.orderNumber) && Objects.equals(startDate, travel.startDate) && Objects.equals(endDate, travel.endDate) && Objects.equals(amount, travel.amount) && type == travel.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, startDate, endDate, amount, type);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TravelTypeEnum getType() {
        return type;
    }

    public void setType(TravelTypeEnum type) {
        this.type = type;
    }


    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
