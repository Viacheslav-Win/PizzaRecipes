package com.example.pizzarecipes;

public class RecyclerViewItem {
    private int imageIcon;
    private String name;
    private String description;

    private String recipe;

    public RecyclerViewItem (int imageIcon, String name, String description, String recipe){
        this.imageIcon = imageIcon;
        this.name = name;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageIcon() {

        return imageIcon;
    }
    public String getName(){

        return name;
    }
    public String getDescription(){

        return description;
    }
    public String getRecipe(){

        return  recipe;
    }

}
