package com.gildedrose;

import com.gildedrose.categories.*;

public class ItemCategoryStrategy {

    public ItemCategory categorize(Item item) {
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasCategory();
            case "Aged Brie":
                return new CheeseCategory();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassCategory();
            default:
                return new RegularItemCategory();
        }
    }

}
