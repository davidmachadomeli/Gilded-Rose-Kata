package com.gildedrose;

import java.util.ArrayList;

class GildedRose {

    private Item[] items;
    private ArrayList<Quality> qualities;
    private Normal normalQuality = new Normal();

    public GildedRose(Item[] items) {
        qualities = new ArrayList<>();
        qualities.add(new Legendary());
        qualities.add(new AgedBrie());
        qualities.add(new ConcertPass());
        qualities.add(new Conjured());

        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            Quality itemType = getQuality(item);
            itemType.updateQuality(item);
            itemType.updateSellIn(item);
            if(itemType.hasExpired(item)) {
                itemType.updateExpired(item);
            }
        }
    }

    private Quality getQuality(Item item) {
        for (Quality quality : qualities) {
            if (quality.applies(item)) {
                return quality;
            }
        }

        return normalQuality;
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