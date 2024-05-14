package com.frank;

public class ItalianPlayingCard extends PlayingCard{

    public ItalianPlayingCard(int value, String suit){
        super(value,suit,"Yellow");
    }
    @Override
    public String toString() {
        return "ItalianPlayingCard{} " + super.toString();
    }

    public void showCard(){
        System.out.println(this.toString());
    }
}
