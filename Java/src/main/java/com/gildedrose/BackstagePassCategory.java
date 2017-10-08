package com.gildedrose;

public class BackstagePassCategory implements ItemCategory {

    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);

        if (item.sellIn < 11) {
            incrementQuality(item);
        }

        if (item.sellIn < 6) {
            incrementQuality(item);
        }
    }

    @Override
    public void updateExpired(Item item) {
        item.quality = 0;
    }

}
