package com.liveasy.liveasyloadApi.load;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loads")
public class Load {
    
    @Column(name = "loadingPoint", nullable = false)
    private String loadingPoint;

    @Column(name = "unloadingPoint", nullable = false)
    private String unloadingPoint;

    @Column(name = "productType", nullable = false)
    private String productType;

    @Column(name = "truckType", nullable = false)
    private String truckType;
    
    @Column(name = "noOfTrucks", nullable = false)
    private Integer noOfTrucks;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "comment", nullable = true)
    private String comment;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name="shipperId", insertable = false, updatable = false, nullable = false)
    @Column(name="shipperId",nullable = false)
    private UUID shipperId;

    @Column(name = "date", nullable = false)
    private Date date;

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public Integer getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(Integer noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UUID getShipperId() {
        return shipperId;
    }

    public void setShipperId(UUID shipperId) {
        this.shipperId = shipperId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Load [comment=" + comment + ", date=" + date + ", loadingPoint=" + loadingPoint + ", noOfTrucks="
                + noOfTrucks + ", productType=" + productType + ", shipperId=" + shipperId + ", truckType=" + truckType
                + ", unloadingPoint=" + unloadingPoint + ", weight=" + weight + "]";
    }
    
    

}
