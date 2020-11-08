package com.origamisoftware.teach.advanced.stock.xml;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
        "symbol",
        "price",
        "time"
})
public class Stock implements XMLDomainObject {

    //Class Variables
    @XmlValue
    protected String symbol;
    @XmlAttribute(name = "symbol", required = true)
    @XmlSchemaType(name = "anySimpleType")

    protected String price;
    @XmlAttribute(name = "price", required = true)
    @XmlSchemaType(name = "anySimpleType")

    protected String time;
    @XmlAttribute(name = "time", required = true)
    @XmlSchemaType(name = "anySimpleType")

    //Getters & Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "content='" + symbol + '\'' +
                ", age='" + price + '\'' +
                ", grade='" + time + '\'' +
                '}';
    }
}
