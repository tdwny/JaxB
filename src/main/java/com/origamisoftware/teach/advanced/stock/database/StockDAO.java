package com.origamisoftware.teach.advanced.stock.database;

import com.origamisoftware.teach.advanced.stock.database.DatabasesAccessObject;

import javax.persistence.*;

/**
 *  Models stock table
 */
@Entity
@Table(name = "stock", schema = "", catalog = "stocks")
public class StockDAO implements DatabasesAccessObject {

    private int id;
    private String symbol;
    private String price;
    private String time;

    //Column 1
    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Column 2
    @Basic
    @Column(name = "symbol", nullable = false, insertable = true, updatable = true, length = 256)
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String userName) {
        this.symbol = symbol;
    }

    //Column 3
    @Basic
    @Column(name = "price", nullable = false, insertable = true, updatable = true, length = 256)
    public String getPrice() {
        return price;
    }

    public void setPrice(String userName) {
        this.price = price;
    }

    //Column 4
    @Basic
    @Column(name = "time", nullable = false, insertable = true, updatable = true, length = 256)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
