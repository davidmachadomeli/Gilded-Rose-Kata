package com.gildedrose.factory;

import com.gildedrose.*;

/**
 * Created by sbertran on 17/11/17.
 */
public class ItemFactory {

    public BaseItem createSwordOfBurningFire(int sellIn, int quality) {
        return new BaseItem(new Item("Sword of Burning Fire", sellIn, quality));
    }

    public BaseItem createAgedBrie(int sellIn, int quality) {
        return new AgedBrieItem(new Item("Aged Brie", sellIn, quality));
    }

    public BaseItem createVestOfHermes(int sellIn, int quality) {
        return  new BaseItem(new Item("Vest of Hermes", sellIn, quality));
    }

    public BaseItem createBackStagePassesToConcert(int sellIn, int quality) {
        return new BackStage(new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality));
    }

    public BaseItem createSulfuras(int sellIn, int quality) {
        return new Sulfuras(new Item("Sulfuras, Hand of Ragnaros", sellIn, quality));
    }
}
