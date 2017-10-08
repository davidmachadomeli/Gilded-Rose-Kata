package com.gildedrose;

public class RegularItemCategory implements ItemCategory {

    @Override
    public void updateQuality(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            incrementQuality(item);

            if (item.sellIn < 11) {
                incrementQuality(item);
            }

            if (item.sellIn < 6) {
                incrementQuality(item);
            }
        } else {
            decrementQuality(item);
        }
    }

    @Override
    public void updateExpired(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.quality = 0;
        } else {
            decrementQuality(item);
        }
    }

}
