package com.gildedrose;

public class AgedBrieQuality extends Quality {
    @Override
    public void update(Item item) {
        increaseQuality(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}
