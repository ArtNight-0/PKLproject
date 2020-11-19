package com.example.spchadits;

public class ItemBook {
    private String indonesian;
    private String arabic;
    //private double identificationType;
    //private String nameSize;
    //private double classificationSize;
    //private double identificationSize;

    public ItemBook(String indonesian, String arabic) {
        this.indonesian = indonesian;
        this.arabic = arabic;
        //this.identificationSize = identificationSize;
        //this.nameType = nameType;
        //this.classificationType = classificationType;
        //this.identificationType = identificationType;
    }

    public ItemBook(POJOBook item) {
        this.indonesian = item.getBook_indonesian();
        this.arabic = item.getBook_arabic();
        //this.identificationSize = item.getGrainSize().getScoreIdentification();
        //this.nameType = item.getGrainType().getName();
        //this.classificationType = item.getGrainType().getScoreClassification();
        //this.identificationType = item.getGrainType().getScoreIdentification();
    }

    public String getIndonesian() {

        return this.indonesian;
    }

    public String getArabic() {
        return this.arabic;
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
