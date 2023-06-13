
package com.example.wb1.Model.JsonWb;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("jsonschema2pojo")
@ToString
public class Data {

    @SerializedName("products")
    @Expose
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
