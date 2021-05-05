package ru.tinkoff.hibernate.test.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "places")
public class Places {

    @Id
    int id;
    @Column(name = "\"row\"")
    int row;
    @Column(name = "place_num")
    int place_num;
    @Column(name = "\"name\"")
    String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlace_num() {
        return place_num;
    }

    public void setPlace_num(int place_num) {
        this.place_num = place_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
