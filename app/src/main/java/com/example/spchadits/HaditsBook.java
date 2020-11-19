package com.example.spchadits;

import java.util.List;

public class HaditsBook {


    private List<POJOBook> data = null;
    private Links links;
    private Meta meta;

    public List<POJOBook> getData() {
        return data;
    }

    public void setData(List<POJOBook> data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}

