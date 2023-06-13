
package com.example.wb1.Model.JsonWb;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Product {

    @SerializedName("time1")
    @Expose
    private Double time1;
    @SerializedName("time2")
    @Expose
    private Double time2;
    @SerializedName("dist")
    @Expose
    private Double dist;
    @SerializedName("id")
    @Expose
    private Double id;
    @SerializedName("root")
    @Expose
    private Double root;
    @SerializedName("kindId")
    @Expose
    private Double kindId;
    @SerializedName("subjectId")
    @Expose
    private Double subjectId;
    @SerializedName("subjectParentId")
    @Expose
    private Double subjectParentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("brandId")
    @Expose
    private Double brandId;
    @SerializedName("siteBrandId")
    @Expose
    private Double siteBrandId;
    @SerializedName("supplierId")
    @Expose
    private Double supplierId;
    @SerializedName("sale")
    @Expose
    private Double sale;
    @SerializedName("priceU")
    @Expose
    private Double priceU;
    @SerializedName("salePriceU")
    @Expose
    private Double salePriceU;
    @SerializedName("logisticsCost")
    @Expose
    private Double logisticsCost;
    @SerializedName("saleConditions")
    @Expose
    private Double saleConditions;
    @SerializedName("pics")
    @Expose
    private Double pics;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("reviewRating")
    @Expose
    private Double reviewRating;
    @SerializedName("feedbacks")
    @Expose
    private Double feedbacks;
    @SerializedName("volume")
    @Expose
    private Double volume;
    @SerializedName("colors")
    @Expose
    private List<Color> colors;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes;
    @SerializedName("diffPrice")
    @Expose
    private Boolean diffPrice;
    @SerializedName("log")
    @Expose
    private Log log;
    @SerializedName("isNew")
    @Expose
    private Boolean isNew;

    public Double getTime1() {
        return time1;
    }

    public void setTime1(Double time1) {
        this.time1 = time1;
    }

    public Double getTime2() {
        return time2;
    }

    public void setTime2(Double time2) {
        this.time2 = time2;
    }

    public Double getDist() {
        return dist;
    }

    public void setDist(Double dist) {
        this.dist = dist;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getRoot() {
        return root;
    }

    public void setRoot(Double root) {
        this.root = root;
    }

    public Double getKindId() {
        return kindId;
    }

    public void setKindId(Double kindId) {
        this.kindId = kindId;
    }

    public Double getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Double subjectId) {
        this.subjectId = subjectId;
    }

    public Double getSubjectParentId() {
        return subjectParentId;
    }

    public void setSubjectParentId(Double subjectParentId) {
        this.subjectParentId = subjectParentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getBrandId() {
        return brandId;
    }

    public void setBrandId(Double brandId) {
        this.brandId = brandId;
    }

    public Double getSiteBrandId() {
        return siteBrandId;
    }

    public void setSiteBrandId(Double siteBrandId) {
        this.siteBrandId = siteBrandId;
    }

    public Double getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Double supplierId) {
        this.supplierId = supplierId;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Double getPriceU() {
        return priceU;
    }

    public void setPriceU(Double priceU) {
        this.priceU = priceU;
    }

    public Double getSalePriceU() {
        return salePriceU;
    }

    public void setSalePriceU(Double salePriceU) {
        this.salePriceU = salePriceU;
    }

    public Double getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(Double logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    public Double getSaleConditions() {
        return saleConditions;
    }

    public void setSaleConditions(Double saleConditions) {
        this.saleConditions = saleConditions;
    }

    public Double getPics() {
        return pics;
    }

    public void setPics(Double pics) {
        this.pics = pics;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(Double reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Double getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Double feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public Boolean getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(Boolean diffPrice) {
        this.diffPrice = diffPrice;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

}
