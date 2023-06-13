package com.example.wb1;

import com.example.wb1.Model.JsonWb.Example;
import com.example.wb1.Model.JsonWb.Product;
import com.example.wb1.Model.WbUrl;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class Wb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Wb1Application.class, args);
        ArrayList<WbUrl> list = new ArrayList<>();
        list.add(new WbUrl("electronic14",9835));
        list.add(new WbUrl("electronic14",9468));
        list.add(new WbUrl("electronic19",58513));
        list.add(new WbUrl("electronic19",130772));
        list.add(new WbUrl("electronic19",9509));
        list.add(new WbUrl("electronic19",9835));
        list.add(new WbUrl("electronic19",10491));

        for (WbUrl wbUrl : list) {


            try {
                HttpClient client = HttpClient.newHttpClient();


                HttpRequest request  = HttpRequest.newBuilder().uri(new URI("" +
                                "https://catalog.wb.ru/catalog/"+wbUrl.getName()+"/catalog?appType=1&cat="+wbUrl.getCat()+"&curr=rub&dest=123585487&page=1&regions=80,38,4,64,83,33,68,70,69,30,86,40,1,66,110,22,31,48,114&sort=priceup&spp=27" +
                                ""))
                        .setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:99.0) Gecko/20100101 Firefox/99.0")
                        .header("Content-Type","application/json; charset=utf-8")
                        .GET()
                        .build();

                HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.ofString());


                Gson gson = new Gson();
                Example example = gson.fromJson(response.body().toString(), Example.class);
                for (Product product : example.getData().getProducts()) {
                    if (product.getSalePriceU()<10000){
                        System.out.println(product.getSalePriceU().intValue()/100 + " - " + product.getName());
                    }
                }


            } catch (Exception e) {

            }
        }


    }

}
