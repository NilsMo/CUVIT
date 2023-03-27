package nl.bioinf.cuvit.models;
/* Author: Nils Mooldijk */


public class PrescribedResources {

    private String name;
    private String description;
    private String link;

    public String GetName(){
        return name;
    }
    public void SetName(String toSet){
        this.name = toSet;
    }
    public String GetDescription(){
        return description;
    }
    public void SetDescription(String toSet){
        this.description = toSet;
    }
    public String GetLink(){
        return link;
    }
    public void SetLink(String toSet){
        this.link = toSet;
    }
}
