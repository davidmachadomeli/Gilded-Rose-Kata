package com.gildedrose;

/**
 * Created by sbertran on 3/11/17.
 */
public class AgedBrieItem extends BaseItem {

    public AgedBrieItem(Item item) {
        super(item);
    }

    public void updateQuality() {
        this.increaseQuality(this.item);
    }
}
