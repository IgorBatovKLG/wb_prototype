
package com.example.wb1.Model.JsonWb;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Example {

    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("params")
    @Expose
    private Params params;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
