package com.example.application.coffeebuzz;


public class Drinks {
    private String name;
    private String desc;
    private int imageID;
    public static final Drinks[] drinks={
            new Drinks("Latte","This a Description for latte",R.drawable.image1),
            new Drinks("Cappacino","This a Description for Cappacino",R.drawable.image2),
            new Drinks("Filter","This a Description for Filter",R.drawable.image3)
    };
    private Drinks(String name,String desc,int imageID){
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
