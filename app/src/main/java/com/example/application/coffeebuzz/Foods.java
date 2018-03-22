package com.example.application.coffeebuzz;



public class Foods {
    private String name;
    private String desc;
    private int imageID;
    public static final Foods[] foods={
            new Foods("Pizza","This a Description for latte",R.drawable.image1),
            new Foods("Sandwitch","This a Description for Cappacino",R.drawable.image2),
            new Foods("Pasta","This a Description for Filter",R.drawable.image3)
    };
    private Foods(String name,String desc,int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }
}
