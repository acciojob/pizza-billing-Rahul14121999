package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int countToppings;
    private int countCheeze;
    private int countBag;
    private int basePrize;
    private int toppings;
    private int cheeze;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

            if(isVeg)
            {
                price=300;
                basePrize=300;
                toppings=70;
            }
            else{
                price=400;
                basePrize=400;
                toppings=120;
            }

            countToppings=0;
            countCheeze=0;
            countBag=0;
            cheeze=80;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        countCheeze++;
        if(countCheeze>1)
            return;
        this.price+=80;


    }

    public void addExtraToppings(){
        // your code goes here
        countToppings++;
        if(countToppings>1)
        {
            return;
        }
        this.price+=toppings;

    }

    public void addTakeaway(){
        // your code goes here
        countBag++;
        if(countBag>1)
            return;
        this.price+=20;

    }

    public String getBill(){
        // your code goes here
        this.bill="Base Price Of The Pizza: "+ basePrize + "\n";
        if(countCheeze>0)
        {
            this.bill +="Extra Cheese Added: "+ this.cheeze + "\n";
        }
        if(countToppings>0)
        {
            this.bill +="Extra Toppings Added: "+this.toppings +"\n";
        }
        if(countBag>0)
        {
            this.bill +="Paperbag Added: "+20+"\n";
        }
        this.bill += "Total Price: "+price;
        return this.bill;
    }
}
