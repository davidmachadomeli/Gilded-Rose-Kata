package com.gildedrose.categories;

import com.gildedrose.Item;

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
