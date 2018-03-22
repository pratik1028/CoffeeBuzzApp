package com.example.application.coffeebuzz;



public class Others {
    private String name;
    private String desc;
    private int imageID;
    public static final Others[] others={
            new Others("Pepsi","This a Description for latte",R.drawable.image1),
            new Others("Energy","This a Description for Cappacino",R.drawable.image2),
            new Others("Frooti","This a Description for Filter",R.drawable.image3)
    };
    private Others(String name,String desc,int imageID){
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
