package com.example.spchadits;

public class Item_Author {
    private String name;
    private String description;
    //private double identificationType;
    //private String nameSize;
    //private double classificationSize;
    //private double identificationSize;

    public Item_Author(String name, String description) {
        this.name = name;
        this.description = description;
        //this.identificationSize = identificationSize;
        //this.nameType = nameType;
        //this.classificationType = classificationType;
        //this.identificationType = identificationType;
    }

    public Item_Author(POJOAuthor item) {
        this.name = item.getName();
        this.description = item.getDescription();
        //this.identificationSize = item.getGrainSize().getScoreIdentification();
        //this.nameType = item.getGrainType().getName();
        //this.classificationType = item.getGrainType().getScoreClassification();
        //this.identificationType = item.getGrainType().getScoreIdentification();
    }

    public String getName() {

        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    /*
    public String getScoreType() {
        String str = "(";
        str = str + String.format("%.0f", this.classificationType);
        str = str + ", ";
        str = str + String.format("%.0f", this.identificationType);
        str = str + ")";
        return str;
    }

    public String getScore() {
        String str = "(";
        str = str + String.format("%.0f", this.classificationSize);
        str = str + ", ";
        str = str + String.format("%.0f", this.identificationSize);
        str = str + ")";
        str = str + ", ";
        str = str + "(";
        str = str + String.format("%.0f", this.classificationType);
        str = str + ", ";
        str = str + String.format("%.0f", this.identificationType);
        str = str + ")";
        return str;
    } */


}
