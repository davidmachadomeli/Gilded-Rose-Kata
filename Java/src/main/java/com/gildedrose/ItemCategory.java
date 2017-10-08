package com.gildedrose;

public interface ItemCategory {

    default void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    default void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    void updateQuality(Item item);

    void updateSellIn(Item item);

    void updateExpired(Item item);
}
