package com.gildedrose;

public class AgedBrieQuality implements Quality {
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
