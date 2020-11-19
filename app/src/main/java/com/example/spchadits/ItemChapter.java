package com.example.spchadits;

public class ItemChapter {
    private String title_indonesian;
    private String title_arabic;
    //private double identificationType;
    //private String nameSize;
    //private double classificationSize;
    //private double identificationSize;

    public ItemChapter(String title_indonesian, String title_arabic) {
        this.title_indonesian = title_indonesian;
        this.title_arabic = title_arabic;
        //this.identificationSize = identificationSize;
        //this.nameType = nameType;
        //this.classificationType = classificationType;
        //this.identificationType = identificationType;
    }

    public ItemChapter(POJOChapter item) {
        this.title_indonesian = item.getTitle_indonesian();
        this.title_arabic = item.getTitle_arabic();
        //this.identificationSize = item.getGrainSize().getScoreIdentification();
        //this.nameType = item.getGrainType().getName();
        //this.classificationType = item.getGrainType().getScoreClassification();
        //this.identificationType = item.getGrainType().getScoreIdentification();
    }

    public String getIndonesian() {

        return this.title_indonesian;
    }

    public String getArabic() {
        return this.title_arabic;
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
