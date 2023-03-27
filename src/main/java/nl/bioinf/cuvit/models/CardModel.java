package nl.bioinf.cuvit.models;
/* Author: Nils Mooldijk */

public class CardModel {

    private String title;
    private String shortDescription;
    private String fullDescription;
    private int ect;
    private String gradingSystem;
    private String assesmentType;




    public String getTitle(){
        return title;
    }
    public void setTitle(String toSet){
        this.title = toSet;
    }
    public String getShortDescription(){
        return shortDescription;
    }
    public void setShortDescription(String toSet){
        this.shortDescription = toSet;
    }
    public String getFullDescription(){
        return fullDescription;
    }
    public void setFullDescription(String toSet){
        this.fullDescription = toSet;
    }

}
