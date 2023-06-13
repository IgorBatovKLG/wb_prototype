
package com.example.wb1.Model.JsonWb;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Size {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("origName")
    @Expose
    private String origName;
    @SerializedName("rank")
    @Expose
    private Double rank;
    @SerializedName("optionId")
    @Expose
    private Double optionId;
    @SerializedName("wh")
    @Expose
    private Double wh;
    @SerializedName("sign")
    @Expose
    private String sign;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigName() {
        return origName;
    }

    public void setOrigName(String origName) {
        this.origName = origName;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Double getOptionId() {
        return optionId;
    }

    public void setOptionId(Double optionId) {
        this.optionId = optionId;
    }

    public Double getWh() {
        return wh;
    }

    public void setWh(Double wh) {
        this.wh = wh;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
