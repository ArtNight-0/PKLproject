package com.example.spchadits;

import java.util.List;

public class HaditsAuthor {


    private List<POJOAuthor> data = null;
    private Links links;
    private Meta meta;

    public List<POJOAuthor> getData() {
        return data;
    }

    public void setData(List<POJOAuthor> data) {
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

