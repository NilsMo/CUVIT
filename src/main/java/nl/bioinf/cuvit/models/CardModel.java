package nl.bioinf.cuvit.models;

import org.springframework.web.multipart.MultipartFile;
import java.util.Objects;

/* Author: Nils Mooldijk */

public class CardModel {

    private String title;
    private String short_description;
    private String full_description;

    public String getTitle(){
        return title;
    }
    public void setTitle(String toSet){
        this.title = toSet;
    }
    public String getShortDescription(){
        return short_description;
    }
    public void setShortDescription(String toSet){
        this.short_description = toSet;
    }
    public String getFullDescription(){
        return full_description;
    }
    public void setFullDescription(String toSet){
        this.full_description = toSet;
    }

}
