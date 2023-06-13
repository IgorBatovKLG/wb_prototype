
package com.example.wb1.Model.JsonWb;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Log {

    @SerializedName("promoAmount")
    @Expose
    private Integer promoAmount;

    public Integer getPromoAmount() {
        return promoAmount;
    }

    public void setPromoAmount(Integer promoAmount) {
        this.promoAmount = promoAmount;
    }

}
