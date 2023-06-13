
package com.example.wb1.Model.JsonWb;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Params {

    @SerializedName("curr")
    @Expose
    private String curr;
    @SerializedName("spp")
    @Expose
    private Integer spp;
    @SerializedName("version")
    @Expose
    private Integer version;

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public Integer getSpp() {
        return spp;
    }

    public void setSpp(Integer spp) {
        this.spp = spp;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
