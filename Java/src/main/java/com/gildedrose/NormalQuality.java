package com.gildedrose;

public class NormalQuality extends Quality {

    @Override
    public void update(Item item) {
        decreaseQuality(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }
}
