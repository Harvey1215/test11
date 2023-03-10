package com.xhw.pojo;
import java.util.List;
public class Orders {
 private int id;
 private  String  number ;
    private List < Product > productList;     //关联商品集合属性

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List <Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", productList=" + productList +
                '}';
    }
}
