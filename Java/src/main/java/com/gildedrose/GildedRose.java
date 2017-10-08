package com.gildedrose;

import com.gildedrose.categories.*;

class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : this.items)
            this.updateQualityForOneItem(item, new ItemCategoryStrategy().categorize(item));
    }

    private void updateQualityForOneItem(Item item, ItemCategory category) {
        category.updateQuality(item);
        category.updateSellIn(item);

        if (this.hasExpired(item))
            category.updateExpired(item);
    }

    private boolean hasExpired(Item item) {
        return item.sellIn < 0;
    }

    @Override
    public String toString() {
        String str = "";
        for (Item i : this.items) {
            str += i.toString();
            str += "\n";
        }
        return str;
    }
}