package com.gildedrose;

public class CheeseCategory implements ItemCategory {

    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);
    }

    @Override
    public void updateExpired(Item item) {
        incrementQuality(item);
    }

}
