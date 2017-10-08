package com.gildedrose;

public class RegularItemCategory implements ItemCategory {

    @Override
    public void updateQuality(Item item) {
        decrementQuality(item);
    }

    @Override
    public void updateExpired(Item item) {
        decrementQuality(item);
    }

}
